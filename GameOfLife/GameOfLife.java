/*_______________________________________________
Name: Valerie Angulo
Date: 11/16/2016
Project: Lab 9
Objective: Use Two-Dimensional Arrays to create a 
Game of Life with different generations 
Note: The 0th generation is a representation of 
the file, changes come into effect with gen 1
_________________________________________________*/
import java.util.Scanner;
import java.io.*;	
import java.util.Arrays;

public class GameOfLife {
	public static void main (String[] args) {
		final int M = 25;
		final int N = 75;	
		final char ALIVE = 'X';	
		final char VACANT = '.';
		boolean quit = false; 
		int generationCounter = 0;	
		Scanner input = new Scanner(System.in);	
		//initialize world arrays with values (0-26) and (0-76)	
		char[][] newGeneration = new char[M+2][N+2];		
		char[][] oldGeneration = new char[M+2][N+2];		

		System.out.println("What file would you like to use?");
		String fileName = input.next();
		File file = new File(fileName);  
		Scanner fileReader = null;
		
		try {
			fileReader = new Scanner (file);
		} catch (Exception e) {
			System.out.print("file " + file + " does not exist");
			System.exit(0);
		}

		for (int i = 1; i <= M; i++) {	
			String line = fileReader.nextLine();
			for (int j = 1; j <= N; j++) {
				char[] lineAsChars = new char[N]; 	
				lineAsChars = line.toCharArray();		
				newGeneration[i][j] = lineAsChars[j-1];	
			}											
		} System.out.println();

		while (!quit) {
	 		System.out.println("Generation " + generationCounter);
	 		generationCounter++;
			//prints newGeneration (initially prints data file at gen 0)
			for (int row = 0; row <= M+1; row++) {		
				for (int column = 0; column <= N+1; column++) {	
					System.out.print(newGeneration[row][column]);	
				} System.out.println();
			}
			//terminates game if generations are stable
			if (Arrays.deepEquals(newGeneration, oldGeneration)) {
				System.out.print("Game of Life world has reached a steady state. Thanks for playing!");
				System.exit(0);
			}
			//terminates game if world is empty
			quit = emptyWorld(newGeneration, ALIVE);	
			if (quit) {
				System.out.print("Game of Life world is now empty. Thanks for playing!");
				System.exit(0);
			}
			//calls setter method
			setWorld(newGeneration, oldGeneration);
			//uses old generation to create new generation
			for (int row = 1; row <= M; row++) {		
				for (int column = 1; column <= N; column++) {
					int neighbors = findNeighbors(oldGeneration, row, column, ALIVE);
					if (neighbors < 2 || neighbors > 3) 
						newGeneration[row][column] = VACANT;
					if (neighbors == 3)
						newGeneration[row][column] = ALIVE;			
				}  
			}
			//user input to continue or quit game
			System.out.println("Would you like to proceed? Press any key to continue or 'q' to quit");
			String userInput = input.next();
			if (userInput.equals("q")) {
				quit = true;
				System.out.print("You have selected \'" + userInput + "\'. Thanks for playing!");
			}
		}
	}
	//takes in a world and coordinates of a cell and returns the number of neighbors for that cell
	public static int findNeighbors(char[][] newGeneration, int yCoordinate, int xCoordinate, int ALIVE) { 
		int numberOfNeighbors = 0;
		for (int y = yCoordinate - 1; y <= yCoordinate + 1; y++) {
			for (int x = xCoordinate -1; x <= xCoordinate + 1; x++) {
				if (newGeneration[y][x] == ALIVE)
					numberOfNeighbors++;
			}
		}
		if (newGeneration[yCoordinate][xCoordinate] == ALIVE)
			numberOfNeighbors--;
		return numberOfNeighbors;
	}
	//takes in newGeneration and returns a Boolean value that tells whether or not it's empty
	public static boolean emptyWorld(char[][] newGeneration, int ALIVE) {	
		boolean emptyWorld = true;
		for (int row = 0; row < newGeneration.length; row++) {					
			for (int column = 0; column < newGeneration[row].length; column++) {	
				if (newGeneration[row][column] == ALIVE) 		
					emptyWorld = false;									
			}
		} return emptyWorld;
	}
	//sets newGeneration equal to oldGeneration
	public static void setWorld(char[][] newGeneration, char[][] oldGeneration) {
		for (int row = 0; row < newGeneration.length; row++) {		
			for (int column = 0; column < newGeneration[row].length; column++) {	
				oldGeneration[row][column] = newGeneration[row][column];
			}
		}
	}
}
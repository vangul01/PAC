/*
Name: Valerie Angulo
Date: October 5, 2016
Course: PAC 1
Program: Lab 5- Car Part II
Objective: Use arrays to create and manipulate 10 cars.
Note: Took away final reportState printout upon terminating program, not sure 
if it was necessary but it felt awkward ending with a printout of last chosen car.
Also, I left [0] in each array with default values. 
*/
import java.util.Random;
import java.util.Scanner;

public class carPartII {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean notDone = true, ignition = false;	
		
		//creates 4 new arrays with empty values from 0-10
		boolean[] ignitions = new boolean [11];
		char[] carColors = new char [11]; 
		int[] xCoordinates = new int [11];
		int[] yCoordinates = new int [11]; 
		
		//assigns random values for array positions 1-10
		for (int index = 1; index <= 10; index++) {		
			carColors[index] = assignColor(); 
			xCoordinates[index] = randomizePosition(); 
			yCoordinates[index] = randomizePosition(); 
		} System.out.println("\nWelcome to the Car Generator!");	

		while (notDone) { 
			System.out.println("\nWhich car would you like to use? (Choose from 1-10)");
			int carNum = input.nextInt();
			System.out.print("\nSelect an option for car number " + carNum + " below.\n" +
			"1: Turn the ignition on/off\n2: Change the car's position\nQ: Quit this program\nInput: ");
			char menuSelect= input.next().charAt(0);
			
			switch (menuSelect) { 
				case '1': ignitions[carNum] = ignitionSwitch(ignitions[carNum]);
					reportState(carNum, ignitions[carNum], carColors[carNum], xCoordinates[carNum], yCoordinates[carNum]);
					break;
				case '2': System.out.print("\nIn which direction do you wish to move the car?\n" +
					"H: Horizontal\nV: Vertical\nDirection: ");
					char direction= input.next().charAt(0);
					System.out.print("Enter a movement distance: ");
					int movementInput= input.nextInt();

					if (direction == 'H') { 													
						xCoordinates[carNum] = moveHorizontally (ignitions[carNum], movementInput, xCoordinates[carNum]);	
						reportState(carNum, ignitions[carNum], carColors[carNum], xCoordinates[carNum], yCoordinates[carNum]);
					} else if (direction == 'V') { 												
						yCoordinates[carNum] =  moveVertically (ignitions[carNum], movementInput, yCoordinates[carNum]);
						reportState(carNum, ignitions[carNum], carColors[carNum], xCoordinates[carNum], yCoordinates[carNum]);
					} else {
						System.out.println("\nERROR: Invalid direction");
					} break; 
				case '3': //change cars
					break;
				case 'Q': notDone = false;														
					break;
				default: System.out.println("\nERROR: Invalid input");							
					break;
			}
		} System.out.println("\nCar Program Terminated.");
	} 
	//Generates random number between 1 and 20 for position 
	public static int randomizePosition() {
		Random generator = new Random();
		int randomCoordinate = generator.nextInt(20) + 1; 
		return randomCoordinate;
	}
	//returns a random car color as char R,G,B,W or S
	public static char assignColor() { 
		Random generator = new Random();
		int randomInt = generator.nextInt(5);
		char[] resultColorChar = {'R','G','B','W','S'};
		return resultColorChar[randomInt];
	}
	//returns opposite ignition value
	public static boolean ignitionSwitch(boolean ignition) {
		return !ignition;
	}
	//changes value of x-coordinate with user input if ignition on and in bounds
	public static int moveHorizontally(boolean ignition, int movementInput, int xCoordinate) { 
		final int MAX_X = 20, MIN_X = 1;
		if (ignition) {										           
				if ((movementInput + xCoordinate >= MIN_X) && (movementInput + xCoordinate <= MAX_X)){
					xCoordinate += movementInput;
				} else {					
					System.out.println("The horizontal input is out of bounds. Try a different movement.");
				}
		} else if (!ignition) {											
			System.out.println("\nTurn ignition \"On\" to move the car!\n");	
		} return xCoordinate;
	}
	//changes value of y-coordinate with user input if ignition on and in bounds
	public static int moveVertically(boolean ignition, int movementInput, int yCoordinate) {
		final int MAX_Y = 20, MIN_Y = 1;	
		if (ignition) {										           
				if ((movementInput + yCoordinate >= MIN_Y) && (movementInput + yCoordinate <= MAX_Y)){
					yCoordinate += movementInput;
				} else {					
					System.out.println("The vertical input is out of bounds. Try a different movement.");
				}
		} else if (!ignition) {											
			System.out.println("\nTurn ignition \"On\" to move the car!\n");	
		} return yCoordinate;
	}
	//prints car properties
	public static void reportState(int carNumber, boolean ignition, char carColor, int xCoordinate, int yCoordinate) {
		System.out.println("\nYour Car Facts!");
		//print number of car in array
		System.out.println("Car Number: " + carNumber);
		//switch ignition on/off from main 
		if (!ignition){										
			System.out.println("Ignition: " + "Off");		
		} else if (ignition){									
			System.out.println("Ignition: " + "On");		
		}
		//print color from char
		switch(carColor){
			case 'R': System.out.println("Color: Red");
				break; 
			case 'G':System.out.println("Color: Green");
				break; 
			case 'B':System.out.println("Color: Black");
				break; 
			case 'W':System.out.println("Color: White");
				break; 
			case 'S':System.out.println("Color: Silver");
				break; 
		}
		//print random position (x,y)
		System.out.println("Position: (" + xCoordinate + "," + yCoordinate + ")");	
		//create car grid
		System.out.println("Location: \n");	
		for (int rows = 1; rows < 21; rows++) {	
			for (int columns = 1; columns < 21; columns++) {	
				if ((xCoordinate == columns) && (yCoordinate == rows)) {
					System.out.print(" " + carColor);
					if (xCoordinate==20) {											
						break;									
					} else {											
						columns++;
					}	
				} System.out.print (" -");
			} System.out.println (" ");
		} 
	}
}	    
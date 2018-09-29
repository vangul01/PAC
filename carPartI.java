/*
Name: Valerie Angulo
Date: October 4, 2016
Course: PAC 1
Program: Lab 4- Car Part I
Objective: Create a car with unique properties
by implementing various methods. 
*/
import java.util.Random;
import java.util.Scanner;

public class carPartI {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean notDone = true, ignition = false;		

		System.out.println("\nWelcome to the Car Generator!");
		char carColor = assignColor(); 
		int xCoordinate = randomizePosition(); 
		int yCoordinate = randomizePosition();

		while (notDone) { 
			System.out.println("\nSelect an option below.\n" +
			"1: Turn the ignition on/off\n" + "2: Change the car's position\n" +
			"Q: Quit this program");
			System.out.print("Input: ");
			char menuSelect= input.next().charAt(0);

			switch (menuSelect) { 
				case '1': ignition = ignitionSwitch(ignition);				
					reportState(ignition, carColor, xCoordinate, yCoordinate);
					break;
				case '2': System.out.print("\nIn which direction do you wish to move the car?\n" +
					"H: Horizontal\nV: Vertical\nDirection: ");
					char direction= input.next().charAt(0);
					System.out.print("Enter a movement distance: ");
					int movementInput= input.nextInt();

					if (direction == 'H') { 													
						xCoordinate = moveHorizontally (ignition, movementInput, xCoordinate);
						reportState(ignition, carColor, xCoordinate, yCoordinate);
					} else if (direction == 'V') { 												
						yCoordinate = moveVertically (ignition, movementInput, yCoordinate);
						reportState(ignition, carColor, xCoordinate, yCoordinate);
					} else {
						System.out.println("\nERROR: Invalid direction");
					} break; 
				case 'Q': notDone = false;														
					break;
				default: System.out.println("\nERROR: Invalid input");							
					break;
			}
		} System.out.println("\nCar Program Terminated.");
		reportState(ignition, carColor, xCoordinate, yCoordinate);
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
		char resultColorChar = ' ';
		int randomInt = generator.nextInt(5);

		if (randomInt == 0) {
			resultColorChar  = 'R';
		} else if (randomInt == 1) {
			resultColorChar = 'G';
		} else if (randomInt == 2) {
			resultColorChar = 'B';
		} else if (randomInt== 3) {
			resultColorChar = 'W';
		} else if (randomInt == 4) {
			resultColorChar = 'S';
		} return resultColorChar;
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
					xCoordinate = xCoordinate + movementInput;
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
					yCoordinate = yCoordinate + movementInput;
				} else {					
					System.out.println("The vertical input is out of bounds. Try a different movement.");
				}
		} else if (!ignition) {											
			System.out.println("\nTurn ignition \"On\" to move the car!\n");	
		} return yCoordinate;
	}
	//prints car properties
	public static void reportState(boolean ignition, char carColor, int xCoordinate, int yCoordinate) {

		System.out.println("\nYour Car Facts!");
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
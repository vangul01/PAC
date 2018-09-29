/*____________________________________________
Name: Valerie Angulo
Date: October 25, 2016
Objective: Create a Car class that gives 
certain properties to a car when instantiated
____________________________________________*/
import java.util.Random;

public class Car {	
	//data fields
	private int carNumber;
	private char carColor;
	private boolean ignition;
	private int x;
	private int y;
	//constructor
	public Car (int carNum) {
		carNumber = carNum;
		carColor = assignColor();			
		ignition = false; 
		x = randomizePosition();
		y = randomizePosition();
	}
	//setter returns opposite of ignition value 
	public void ignitionSwitch(boolean setIgnition) {
		ignition = !setIgnition;
	}	
	//return ignition state of car as boolean variable
	public boolean getIgnition() {
		return ignition;
	}
	//returns a random car color as char R,G,B,W or S 
	public char assignColor() { 
		Random generator = new Random();
		int randomInt = generator.nextInt(5);
		char[] resultColorChar = {'R','G','B','W','S'};
		return resultColorChar[randomInt];
	}
	//get color of car as string
	public String getColor() {
		if (carColor == 'R') 
			return "Red"; 
		else if (carColor == 'G') 
			return "Green"; 
		else if (carColor == 'B') 
			return "Blue"; 
		else if (carColor == 'W') 
			return "White"; 
		else return "Silver"; 	
	}
	//Generates random number between 1 and 20 for position 
	public static int randomizePosition() {
		Random generator = new Random();
		int randomCoordinate = generator.nextInt(20) + 1; 
		return randomCoordinate;
	}
	//returns x position of car as int
	public int getX() {
		return x;
	}
	//changes value of x-coordinate with user input if ignition on and in bounds
	public void moveHorizontally(int movementInput) { 
		final int MAX_X = 20, MIN_X = 1;
		if (ignition) {										           
				if ((movementInput + x >= MIN_X) && (movementInput + x <= MAX_X)) {
					x += movementInput;
				} else {					
					System.out.println("\nThe horizontal input is out of bounds. Try a different movement.");
				}
		} else if (!ignition) {											
			System.out.println("\nTurn ignition \"On\" to move the car!");
		} 
	}
	//return y position of car as int
	public int getY() {
		return y;
	}
	//changes value of y-coordinate with user input if ignition on and in bounds
	public void moveVertically(int movementInput) {
		final int MAX_Y = 20, MIN_Y = 1;
		if (ignition) {									           
			if ((movementInput + y >= MIN_Y) && (movementInput + y <= MAX_Y)){
				y += movementInput;
			} else {					
				System.out.println("\nThe vertical input is out of bounds. Try a different movement.");
			}
		} else if (!ignition) {											
			System.out.println("\nTurn ignition \"On\" to move the car!\n");
		} 
	}
	//prints car properties
		public void printState() {
		boolean ignition = getIgnition(); 
		int xCoordinate = getX();				
		int yCoordinate = getY();	

		System.out.print("\nInformation for Car #" + carNumber + "\nColor: " 
		+ getColor() + "\nPosition: " + "(" + xCoordinate + "," 
		+ yCoordinate + ")" + "\nIgnition Status: ");

		if (ignition)
			System.out.println("On");
		else
			System.out.println("Off");

		System.out.println("Location: \n");
		for (int rows = 1; rows < 21; rows++) {	
			for (int columns = 1; columns < 21; columns++) {	
				if ((xCoordinate == columns) && (yCoordinate == rows)) {
					System.out.print(" " + carColor);
					if (xCoordinate == 20) {											
						break;									
					} else {											
						columns++;
					}	
				} System.out.print (" -");
			} System.out.println (" ");
		} 															
	}
}
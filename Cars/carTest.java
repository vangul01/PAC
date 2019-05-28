/*
Name: Valerie Angulo
Date: September 28, 2016
Course: PAC 1
Program: Lab 4- Car Part I
Objective: 
*/
import java.util.Random;
import java.util.Scanner;

public class carTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean done = false, ignition = true;
		char carColor = ' ';
		int xCoordinate = 0, yCoordinate = 0;

		System.out.println("\nWelcome to the Car Generator!");
	
		ignition = ignitionSwitch(ignition);
		carColor = assignColor(carColor);
		xCoordinate = randomizePosition(xCoordinate);
		yCoordinate = randomizePosition(yCoordinate);


		while (!done) { 
			System.out.println("\nSelect an option below.\n" +
			"1: Turn the ignition on/off\n" + "2: Change the car's position\n" +
			"Q: Quit this program");

			System.out.print("Input: ");
			char menuSelect= input.next().charAt(0);

			switch (menuSelect) {
				case '1': reportState(ignition, carColor, xCoordinate, yCoordinate);
					
					break;
				case '2': System.out.println("\nIn which direction do you wish to move the car?\n" +
					"H: Horizontal\nV: Vertical\n");
					System.out.print("Direction: ");
					char direction= input.next().charAt(0);
					
					System.out.print("Select a movement direction: ");
					int movement= input.nextInt();

					if (direction == 'H') { //.equals("H")){

						System.out.println("Not done yet!!");
						//movementInput = moveHorizontally(movementInput);
						//System.out.print("New main horizontal coordinates: " + movementInput);
					}
					else if (direction == 'V') { //.equals("V")){
						System.out.println("Not done yet!!");
						//movementInput = moveVertically(movementInput);
						//System.out.print("New main vertical coordinates: " + movementInput);
					}
					else {
						System.out.println("Invalid direction");
					}
					break;
			}
		}

	}

	//Generates random number between 1 and 20 for position 
	public static int randomizePosition(int randomCoordinate) {
		Random generator = new Random();
		randomCoordinate = generator.nextInt(20) + 1; 
		return randomCoordinate;
	}

	//returns a random car color as char R,G,B,W or S
	public static char assignColor(char resultColorChar) {
		Random generator = new Random();
		int randomInt = generator.nextInt(5);
		resultColorChar = ' ';

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

	public static void reportState(boolean ignition, char carColor, int xCoordinate, int yCoordinate) {
		Scanner input = new Scanner(System.in);
		boolean done = false;





		char menuSelect= input.next().charAt(0);

			//if (menuSelect == 1){
					System.out.println("Car Facts\n");

					ignition = ignitionSwitch(ignition);
					if (!ignition){										
						System.out.println("Ignition: " + "Off");		
					} else if (ignition){									
						System.out.println("Ignition: " + "On");		
					}
					//to print out color from char
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
					//to print out position
					System.out.println("Position: (" + xCoordinate + "," + yCoordinate + ")");
					//break;
			//}







/*
		while (!done) { 
			System.out.println("\nSelect an option below.\n" +
			"1: Turn the ignition on/off\n" + "2: Change the car's position\n" +
			"Q: Quit this program");

			System.out.print("Input: ");
			char menuSelect= input.next().charAt(0);

			switch (menuSelect) {
				case '1': // CASE 1 IS PERFECT!!!!!!DO NOT TOUCH!!!!!!!!!!!
					//to change ignition through method and print out properly
					
					System.out.println("Car Facts\n");

					ignition = ignitionSwitch(ignition);
					if (!ignition){										
						System.out.println("Ignition: " + "Off");		
					} else if (ignition){									
						System.out.println("Ignition: " + "On");		
					}
					//to print out color from char
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
					//to print out position
					System.out.println("Position: (" + xCoordinate + "," + yCoordinate + ")");
					break;
					

				case '2': System.out.println("\nIn which direction do you wish to move the car?\n" +
					"H: Horizontal\nV: Vertical\n");
					System.out.print("Direction: ");
					char direction= input.next().charAt(0);
					
					System.out.print("Select a movement direction: ");
					int movement= input.nextInt();

					if (direction == 'H') { //.equals("H")){

						System.out.println("Not done yet!!");
						//movementInput = moveHorizontally(movementInput);
						//System.out.print("New main horizontal coordinates: " + movementInput);
					}
					else if (direction == 'V') { //.equals("V")){
						System.out.println("Not done yet!!");
						//movementInput = moveVertically(movementInput);
						//System.out.print("New main vertical coordinates: " + movementInput);
					}
					else {
						System.out.println("Invalid direction");
					}
					break;
			}
		} */
	}
}	


///-------------------------------------CORRECT PROGRAM  4:09PM-------------------------------------------------------------------------
/*
Name: Valerie Angulo
Date: September 28, 2016
Course: PAC 1
Program: Lab 4- Car Part I
Objective: 
*/
import java.util.Random;
import java.util.Scanner;

public class carPartI {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean notDone = true, ignition = false;		//dont touch!!!
		char carColor = ' ';
		int xCoordinate = 0, yCoordinate = 0;

		System.out.println("\nWelcome to the Car Generator!");
		carColor = assignColor(carColor);
		xCoordinate = randomizePosition(xCoordinate);
		yCoordinate = randomizePosition(yCoordinate);


		while (notDone) { 
			System.out.println("\nSelect an option below.\n" +
			"1: Turn the ignition on/off\n" + "2: Change the car's position\n" +
			"Q: Quit this program");

			System.out.print("Input: ");
			char menuSelect= input.next().charAt(0);

			switch (menuSelect) { 
				case '1': 
					//System.out.print("Ignition b4: " + ignition);	   // false
					ignition = ignitionSwitch(ignition);				
					//System.out.print("/nIg after: " +ignition);			//true
					reportState(ignition, carColor, xCoordinate, yCoordinate);	//WORKS!!!!!	//prints on
					//System.out.print("Ig after report state: " +ignition);			//true
					break;

				case '2': System.out.println("\nIn which direction do you wish to move the car?\n" +
					"H: Horizontal\nV: Vertical\n");
					System.out.print("Direction: ");
					char direction= input.next().charAt(0);
					
					System.out.print("Select a movement distance: ");
					int movementInput= input.nextInt();

					if (direction == 'H') { //.equals("H")){
						System.out.print("Ignition in case 2: " + ignition);
						//reportState(ignition, carColor, xCoordinate, yCoordinate);
						
						moveHorizontally(ignition, movementInput, xCoordinate);

						//System.out.print("New Main horizontal: " + movementInput);
					}
					else if (direction == 'V') { //.equals("V")){
						System.out.println("Not done yet!!");
						//movementInput = moveVertically(movementInput);
						//System.out.print("New main vertical coordinates: " + movementInput);
					}
					else {
						System.out.println("\nERROR: Invalid direction");
					}
					break; 
				case 'Q': notDone = false;												//WORKS!!!!
					break;
				default: System.out.println("\nERROR: Invalid input");					//WORKS!!!!!
					break;
			}
		}
		System.out.println("\nCar Program Terminated.");
	}

	//Generates random number between 1 and 20 for position 
	public static int randomizePosition(int randomCoordinate) {
		Random generator = new Random();
		randomCoordinate = generator.nextInt(20) + 1; 
		return randomCoordinate;
	}

	//returns a random car color as char R,G,B,W or S
	public static char assignColor(char resultColorChar) {
		Random generator = new Random();
		int randomInt = generator.nextInt(5);
		resultColorChar = ' ';

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

// xCoordinate =+ movementInput;
	public static int moveHorizontally(boolean ignition, int movementInput, int xCoordinate) { 
		//if ignition off, should notify user and just return current unchanged x. If on, this should
		//check if parameters in bounds. If yes, change x and return value. if no, error statement and 
		//return current value
		
		//Scanner input = new Scanner(System.in);
		final int MAX = 20, MIN = 1;
		//xCoordinate = randomizePosition(xCoordinate);
		movementInput = 0;
		
			System.out.println("ignition in moveHorizontally" + ignition); ///right now its false
		
		if (!ignition){										            //ig is false aka off
			System.out.println("You must turn ignition \"On\" before moving it!");
			System.out.println("ingnitions !ig in move");		
		} else if (ignition){											//when ig is true aka on
			System.out.println("ignitions ig in move");		




		}


		return moveHorizontally(ignition, movementInput, xCoordinate);


		/*	if (ignition = false)

			{
				System.out.println("You must turn the ignition on first.");
			} else 
			{
				System.out.println("Yay ignitions on!!");
			}
		*/
	/*	while (ignition = true) {
			System.out.println("Yay ignitions on!!");
		
		}
			System.out.println("You must turn the ignition on first.");
	*/	

		
		
		
		//System.out.println(ignition);
		//System.out.println(movementInput);
		//System.out.println(xCoordinate);

		
/*

		if (ignition != true) {





		} else
		System.out.println()		

		while (ignition) {
		System.out.println("Enter a movement distance: ");
		movementInput = input.nextInt();

			if ((movementInput + xCoordinate) >= MIN && (movementInput + xCoordinate) <= MAX ) {
				xCoordinate = xCoordinate + movementInput; 
				return(xCoordinate);
			} else {
				System.out.println("Error: The horizontal input is out of bounds");
				return(xCoordinate);
			}
		}
		System.out.println("Error: You must first turn the ignition on.");
		
		return moveHorizontally(ignition, movementInput, xCoordinate);
	*/ }
	 
/*
	public static int moveVertically() {
		while (ignition == true) {

			System.out.println("Enter a movement distance: ");
			int movement= input.nextInt();

			if ((int vertical + yCoordinate) >= 1 && (vertical + yCoordinate) <= 20 ){
				vertical = yCoordinate + vertical;
				return vertical;
			} else {
				System.out.println("Error: The vertical input is out of bounds");
				return vertical;
			} 
		}
		System.out.println("Error: You must first turn the ignition on.");
		return vertical;
	}
*/
	public static void reportState(boolean ignition, char carColor, int xCoordinate, int yCoordinate) {

		System.out.println("\nYour Car Facts!");
		
		//switch ignition from main and print on/off
		if (!ignition){										
			System.out.println("Ignition: " + "Off");		
		} else if (ignition){									
			System.out.println("Ignition: " + "On");		
		}
		
		//print out color from char
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
		
		//print out position
		System.out.println("Position: (" + xCoordinate + "," + yCoordinate + ")");
		
		//return reportState(ignition, carColor, xCoordinate, yCoordinate);

	/*	//to make (messed up) car grid
		System.out.println("Location: \n");
		for (int rows = 1; rows <= 20; rows++){	
			for (int columns = 1; columns <= 20; columns++){	
				//if (columns == xCoordinate && rows == yCoordinate){
				//	System.out.println(carColor);
				//} 
				System.out.print ("- ");	
			} 
			System.out.println ();
		} 
	*/
	}
}	

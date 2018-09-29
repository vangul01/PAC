/*_________________________________________
Name: Valerie Angulo
Date: October 25, 2016
Objective: To test an array of car objects 
from Car class
__________________________________________*/
public class TestCar {
	public static void main (String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		//declares array of 11 Car objects from 0-10
		Car[] newCar = new Car[11];	
		//instantiates Car objects for i values 1-10				
		for (int i = 1; i < newCar.length; i++) {
			newCar[i] = new Car(i);
		}
		System.out.print("\nWhich car would you like to use? (Choose from 1-10): ");
		int carNumber = input.nextInt();
		//loop for invalid car entries
		while ((carNumber < 1 || carNumber > 10)) {
			System.out.print("Select a valid car number: ");
			carNumber = input.nextInt();
		}
		while (carNumber > 0 && carNumber <11) { 
			newCar[carNumber].printState();	
			System.out.print("\nSelect an option for " + carNumber + " below:\n1: Turn the ignition on/off\n" +
				"2: Change the car's position\n3: Change cars\nQ: Quit this program\nInput: ");
			String menuSelect= input.next();
			
			switch (menuSelect) { 
				case "1": newCar[carNumber].ignitionSwitch(newCar[carNumber].getIgnition());
					break;
				case "2": System.out.print("\nIn which direction do you wish to move the car?\n" +
					"H: Horizontal\nV: Vertical\nDirection: ");
					String direction= input.next(); 
					System.out.print("Enter a movement distance: ");
					int movementInput= input.nextInt();

					if (direction.equals("H")) {
						newCar[carNumber].moveHorizontally(movementInput);
					} else if (direction.equals("V")) { 												
						newCar[carNumber].moveVertically(movementInput);
					} else {
						System.out.println("\nERROR: Invalid direction");
					} break; 
				case "3": System.out.print("\nWhich car would you like to use? (Choose from 1-10): ");
					carNumber = input.nextInt();
					while (carNumber < 1 || carNumber > 10) {
						System.out.print("Select a valid car number: ");
						carNumber = input.nextInt();		
					} break;
				case "Q": System.out.println("\nCar Program Terminated.");
					System.exit(0);														
					break;
				default: System.out.println("\nERROR: Invalid input");							
					break;
			}
		} 
	}
}
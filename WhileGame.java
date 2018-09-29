import java.util.Random;
import java.util.Scanner;

public class WhileGame {
	public static void main(String[] args) {

		int [] myFirstArray;

		myFirstArray = new int [10];

		for (int i = 0; i <= 9; i++)
				System.out.println("array element " + i + " is equal to " + myFirstArray [i]);
			


/*
		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		boolean won = false;

		System.out.println("Welcome to the while game!\n" +
						   "I am going to think of a number between 0 and 10...\n");

		int randomNumber = generator.nextInt(10);
		System.out.println("OK, guess away!  If you want to quit, press x");

		String nextChoice = "";
		
		// alternative way:
		// boolean gaveUp = false;
		// while (won != true && gaveUp == false)

		while (won != true) 
		{
			System.out.print("Your guess: ");
			nextChoice = input.next();

			// ALWAYS use .equals for string equality
			if (nextChoice.equals("x")) 
			{
				System.out.println("Quitting already, huh?  See ya!");
				// this might seem odd...but it works
				won = true;
				// in the alternative way, you could do
				// gaveUp = true;

			} 
			else 
			{
				// IMPORTANT: it is assumed that if the user did not enter "x"
				// then they entered an integer instead
				int nextChoiceInt = Integer.parseInt(nextChoice);

				if (nextChoiceInt == randomNumber) 
				{
					System.out.println("Wow, great job!\n");
					won = true;
				} 
				else 
				{
					System.out.println("Nope, try again!\n");
				}
			} 
		}
*/
	}
}
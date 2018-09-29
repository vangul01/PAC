import java.util.Scanner;

public class BinaryArithmetic {
	public static void main (String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("Hello! Welcome to my binary arithmetic program!" +
		" Input a number in binary: ");
	int bin1 = input.nextInt();

	System.out.println("Input another number in binary: ");
	int bin2 = input.nextInt();

	int newBin1 = smallInt(bin1);
	int newBin2 = smallInt(bin2);

//	System.out.println("Now input an operation(Choose one of the following: +, -): ");
//	char operation = input.next().charAt(0);

	//Step 2: obtain rightmost digit from both numbers
	//Step 3: add the two rightmost numbers together
		//if the combo is 0+0, the RMD is 0
		//if the combo is 0+1, the RMD is 1
		//if the combo is 1+1, the RMD is 2 
			//if the answer is 2, the RMD is 0 and 1 must be added to the next RMD
				//if the next RMD is 3, the answer is 1 and 1 must be added to the next RMD
	//Step 4: if the numbers are unequal in size, add the RMD of the longest to 0
	//Step 5: repeat steps 2-3 until the RMD of the longest number is the LMD

//OR convert binary to number, add the two numbers and convert it back to binary

	//

/*	System.out.println("Your first number is " + newBin1 + 
		"\nYour second number is " + newBin2 +
		"\nYour new number is " + (newBin1 + newBin2) +
		"\nYour new number in binary is " + binAnswer);
*/
	}
}
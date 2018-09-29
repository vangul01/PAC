/*_____________________________________________________
Name: Valerie Angulo
Date: 12/5/2016
Project: Lab 10
Objective: Design a program to implement a calculator 
that will first perform an infix to postfix conversion
and then evaluate the resulting postfix expression.


It is highly recommended that you read section 3.8 in the textbook (Objected-Oriented
Data Structures Using Java Third Edition by Nell Dale, Daniel T. Joyce, and Chip
Weems) on the Postfix Expression Evaluator. This will contain explanations and code
for taking a postfix expression and converting it into an infix expression.

Both the Converter and Calculator classes should use either a Stack class from the
book or one that you have designed yourself. You are not allowed to use any pre-built
classes in the Java library (such as ArrayList or something else). 

bounded stack - will have at most number of elements in string
error can be divide by zero...it actually calculates the postfix string

_____________________________________________________*/
import java.util.*;
import java.util.Scanner;

public class PostfixCalculator {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an infix expression to be evaluated: ");
		String infixInput = input.next();	//should i put nextLine?

		System.out.println("My infix after parse helper: " + Converter.toPostfix(infixInput));

	//	String result; 


    // Obtain and output result of expression evaluation_________________________________________
	//From textbook
 /*     try
      {
        result = Converter.toPostfix(infixInput);

        // Output result.
        System.out.println();
        System.out.println("Result = " + result);
      }
      catch (StackUnderflowException error)	//should be divide by 0 error.....
      {        
        // Output error message.
        System.out.println();
        System.out.println("Error in expression - " + error.getMessage());
      }
    //End of textbook code________________________________________________________________________
*/	}
}
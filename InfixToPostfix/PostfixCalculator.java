/*_____________________________________________________
Name: Valerie Angulo
Date: 12/5/2016
Project: Lab 10
Objective: Design a program to implement a calculator 
that will first perform an infix to postfix conversion
and then will evaluate the resulting postfix expression.

Note: modified parseHelper class to be public instead 
of private.
______________________________________________________*/
import java.util.*;
import java.util.Scanner;

public class PostfixCalculator {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		boolean quit = false; 
		String postfix = " ";
		
		while (!quit) {
			//Step 1: use scanner to get user input for infix expression
			System.out.println("\nEnter an infix expression to be evaluated: ");
			String infixInput = input.next();	

			//Step 2: convert String to List<String> then to string with spaces between each token
			List<String> infixParser = new ArrayList<String>(100);
			infixParser = ParserHelper.parse(infixInput.toCharArray());
			String parsedInfix = String.join(" ", infixParser);

			//Step 3: Instantiate new converter object. Assumes proper user input
			Converter convert = new Converter(parsedInfix);	
			
			//Step 4: print postfix, try/catch for exceptions present in converter class
			try
			{
				postfix = convert.toPostfix(parsedInfix);
				System.out.println("Your expression converted to postfix: " + postfix);		
			}
			catch (StackUnderflowException e)
			{
				System.out.println(e.getMessage());
			}

			//Step 6: print result, try/catch for exceptions present in calculate method
			try 
			{
				System.out.println("Result: " + calculate(postfix));	
			}
			catch (StackUnderflowException e) 
			{
				System.out.println(e.getMessage());					
			}
			//user input to continue program
			System.out.print("Press any key to continue or press \"q\" to quit: ");
			String userInput = input.next();
			if (userInput.equals("q")) {
				System.out.println("Calculator program terminated. Goodbye! ");
				quit = true;
			}
		}
	}

	//Step 5: calculate postfix String
	public static double calculate (String postfix) {
		int value = 0;
		String operator = " ";
		double result = 0.0, operand1 = 0.0, operand2 = 0.0;

		ArrayStack<Double> stack = new ArrayStack<Double>(100);
		Scanner tokenizer = new Scanner(postfix);

		while(tokenizer.hasNext()) {
			if (tokenizer.hasNextInt()) {	
				value = tokenizer.nextInt();
				while (stack.isFull()) 
				{
					throw new StackOverflowException("Error: Push attempted on full stack"); 
				} 
				stack.push((double)value);
			} else {
				operator = tokenizer.next();
				if (stack.isEmpty()) 
				{
					throw new StackUnderflowException("Error: No more operands in stack");
				}
				operand2 = stack.top();
				stack.pop();
				if (stack.isEmpty()) 
				{
					throw new StackUnderflowException("Error: No more operands in stack");
				}
				operand1 = stack.top();
				stack.pop();

				switch(operator) 
				{
					case "^": stack.push(Math.pow(operand1,operand2));
						break;
					case "*": stack.push(operand1 * operand2);
						break;
					case "/": stack.push(operand1 / operand2);
						break;
					case "+": stack.push(operand1 + operand2);
						break;
					case "-": stack.push(operand1 - operand2);
						break;
					default: System.out.println("Invalid operator");
						break;
				}
				result = stack.top();
			}
		}
		stack.pop();
		return result;
	}
}
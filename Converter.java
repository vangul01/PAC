/*_______________________________________________
Name: Valerie Angulo
Date: 12/5/2016
Project: Lab 10
Objective: Converter class used to convert an 
infix expression into a postfix expression



Possible errors: 

StackUnderflow: not enough operators
StackOverflow: too many operators


_________________________________________________*/
import java.util.*;
import java.util.Scanner;

public class Converter {

	private String infix;				//string instance variable
	public Converter() {}				//default constructor	
	public Converter(String infix) {	//constructor with string parameter //do i need this if im only passing string through toPostfix? 
		this.infix = infix;
	}
	//toPostfix method
	public static String toPostfix(String infix) {
		//Step 1: convert String to List<String> with spaces between each token 
		List<String> parsedInfix = ParserHelper.parse(infix.toCharArray());
		String newInfix = parsedInfix.toString();

		//Step 2: create a stack and create a String variable to hold postfix expressions
		ArrayStack<String> stack  = new ArrayStack<String>(100); // instantiate new stack of type T  (expression.length()).....50???
		String postfix = null; 

		//Step 3: split up operators and operands
//		Scanner tokenizer = new Scanner(newInfix);
//		while (tokenizer.hasNext()) {
//			if (tokenizer.hasNextInt()) {	//I want this to add ints to their own string
//				postfix += tokenizer.nextInt(); 
	//			System.out.println("heeeyyyyy");
	//			operands = "" + tokenizer.nextInt();
	//			operands = tokenizer.nextInt();
	//			if (stack.isFull()) 
	//				throw new StackOverflowException("Too many ope")
	//			}
			}
		}



	/*	int x = 0;
		for (int i = 0; i < infix.length(); i++) {
			if (infix.charAt(i).equals(0))
				return "contains a 0!";
		}
	*/


		return newInfix; //"postfix string";
	}
}

/*
Scanner s = new Scanner(postfix exxpressionString);

while s.hasNext {
	parse out type of s.next
		push to stack depending on type
		evaluate expressions depending on type
}



*/
/*
Name: Valerie Angulo
Date: September 22, 2016
Course: PAC 1
Program: Lab 3- Calculator
Objective: To create a calculator program that 
takes in operands and operations from the user
*/

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double bufferNumber = 0, newNumber = 0;
		char operator; 

		System.out.println("Welcome to calculator! Enter \"c\" to clear data." +  
		" Enter \"x\" to end the program.\n");
		
		System.out.print("First number:  ");
		bufferNumber = input.nextFloat();
			
		System.out.print("Operation:     ");
		operator = input.next().charAt(0);
		
		//skips second input if program cleared or terminated
		if (operator != 'c' && operator != 'x') {
			System.out.print("Second number: ");
			newNumber = input.nextFloat();	
		}

		while (operator != 'x') {			
				
			switch (operator) {
				case '+': bufferNumber = bufferNumber + newNumber;
					break;
				case '-': bufferNumber = bufferNumber - newNumber;
					break;	
				case '*': bufferNumber = bufferNumber * newNumber;
					break;
				case '/': // if/else to prevent division by 0 error
					if (newNumber == 0) { 
						System.out.println("ERROR: Division by 0\n");
					} else {
						bufferNumber = bufferNumber / newNumber;
					} break;
				case 'c': bufferNumber = 0; 
					System.out.println("Calculator cleared.\n");
					break;
				default: System.out.println("ERROR: Unknown operator " + "\"" + operator + "\"\n");
					break;
			}

			System.out.println("Answer:        " + bufferNumber);
			
			System.out.print("Operation:     ");
			operator = input.next().charAt(0);
			
			//skips more input if program cleared or terminated
			if (operator != 'c' && operator != 'x') {
				System.out.print("More input:    ");
				newNumber = input.nextFloat();	
			}
		}
		
		System.out.println ("Calculator program terminated.");
	}
}       	
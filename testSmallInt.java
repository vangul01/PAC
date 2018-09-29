/*
Name: Valerie Angulo
Date: October 12, 2016
Course: PAC 1
Program: Lab 6A-TestSmallInt
Objective: to test the SmallInt class
*/

import java.util.Scanner; 

public class testSmallInt {
	public static void main (String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Please enter a value from 0 to " + smallInt.MAX_VALUE + ": ");
	int valueInput = input.nextInt();

	smallInt number = new smallInt (valueInput);
	String numberAsString = number.getDec ();
	System.out.println ("Your value as a decimal: " + numberAsString);
	String numberAsBin = number.getBin ();
	System.out.println ("Your value in binary: 0b" + numberAsBin);
	String numberAsHex = number.getHex ();
	System.out.println ("Your value in hex: 0x" + numberAsHex);
	}
}

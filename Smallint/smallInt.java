/*
Name: Valerie Angulo
Date: October 18, 2016
Course: PAC 1
Program: Lab 6B-SmallInt
Objective: to pass and check a value through various methods, and
return a string of the value in binary and hexadecimal.

***Explanation of getBin and getHex at bottom of class***
*/
public class smallInt {		
	private int value;	
	public static final int MAX_VALUE = 1000;
	
	//constructor assigns an input to value
	public smallInt (int constructorValue) {
		setDec(constructorValue);	
	}
	//getter returns a string representation of the value
	public String getDec () {
		return ""+ value;
	}
	//setter checks for values validity and sets it by using valueCheck
	public void setDec (int setValue){
		if ((setValue >= 0) && (setValue <= MAX_VALUE)) {			
			value = setValue;
		} else {
			System.out.println("ERROR: Invalid value " + setValue + " set to 0.");
			value = 0;
		}
	}
	//returns value as a binary string 
	public String getBin () {
		int binValue = value;  
		String binString = "";
		int whileCount = 0;
		int [] remainders = new int [100];

		if (binValue == 0){
			binString = "" + 0;
		}
		while (binValue > 0) { 	
			whileCount++;				
			remainders [whileCount] = (binValue % 2); 
			binValue = (binValue / 2);		
		}
		for (whileCount = whileCount; whileCount > 0; whileCount--){
			binString = binString + remainders[whileCount];
		} return binString;
	}
	//returns value as a hexidecimal string 
	public String getHex () {
		int hexValue = value;	
		String hexString = "";
		int whileCount = 0;
		int [] remainders = new int [100];

		if (hexValue == 0){
			hexString = "" + 0;
		}
		while (hexValue > 0) {
			whileCount++;
			remainders [whileCount] = (hexValue % 16);
			hexValue = (hexValue / 16);
		}
		for (whileCount = whileCount; whileCount > 0; whileCount--){ 	
			if (remainders[whileCount] < 10){
				hexString = hexString + remainders[whileCount];
			} else {
				hexString = hexString + (char)(remainders[whileCount] + 55); 
			}
		} return hexString;
	}
}

/* The number stored as value is taken in and set as binValue. The number goes 
through a while loop: the modulus remainders for each binValue that goes through
the loop are stored in empty spaces of an array of size 100. binValue is divided 
by 2 until it equals 0 and exits the while loop. A whileCount increases by 1 for
each iteration of the while loop. A for loop is instantiated for the value of 
whileCount to represent the number of times binValue was divided before equaling 0.
binString gets binString (aka "") + each remainder in the array in descending order
until whileCount is 1. binString is returned as a string.

If value = 178, binValue gets 178. 178 goes through the while loop 8 times 
when whileCount = 1			remainder (binValue 178%2) = 0		binValue/2 = 89
	 whileCount = 2			remainder = 1						binValue = 44
	 whileCount = 3			remainder = 0						binValue = 22
	 whileCount = 4			remainder = 0						binValue = 11
	 whileCount = 5			remainder = 1						binValue = 5
	 whileCount = 6			remainder = 1						binValue = 2
	 whileCount = 7			remainder = 0						binValue = 1
	 whileCount = 8			remainder = 1						binValue = 0	exit out of while loop

In the for loop, binString is set to equal the remainders stored in an array printed backwards
when whileCount = 8			binString = 
	 whileCount = 7			binString = 1
	 whileCount = 6			binString = 10
	 whileCount = 5			binString = 101
	 whileCount = 4			binString = 1011
	 whileCount = 3			binString = 10110
	 whileCount = 2			binString = 101100
	 whileCount = 1			binString = 1011001		exit out of while loop

The for loop ends and the value of binString is returned complete and correct as 10110010

The same algorithm for getHex was used except 16 was used in place of 2 and in the 
for loop an if/else statement was instantiated where if the value of the remainder 
was less than 10 it was added to the hexString but if it was greater, the remainder 
was added to 55 and cast as a char so that a letter from A-F could be printed instead 
(the new value corresponds to the char values A-F in ascii code).

Using 178 as an example for getHex, the while loop takes in 178:
	 whileCount = 0			remainder (hexValue 178%16)= 2			hexValue/16 = 11
	 whileCount = 1			remainder = 11							hexValue = 0	exit out of while loop

In the for loop:
	 whileCount = 2			binString = 
	 whileCount = 1			binString = B 	exit out of while loop

The for loop ends and the value of hexString is returned complete and correct as B2
*/
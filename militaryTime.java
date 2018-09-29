/*
Name: Valerie Angulo
Date: September 20, 2016
Course: PAC 1
Program: Lab 2- Military Time
Objective: To scan user input of two times, subtract the 
second time from the first time and output it correctly.
*/

import java.util.Scanner;	

public class militaryTime
{
	public static void main(String[] args)
	{
		int SECONDS_IN_HOUR = 3600;
		int SECONDS_IN_MINUTE = 60;
		int firstMilitaryTime, secondMilitaryTime; 
		int firstHour =0, firstMin = 0, firstSec = 0,
		secHour = 0, secMin = 0, secSec = 0;
		int totalFirstTime = 0, totalSecondTime = 0;
		int finalTime = 0, finalHour = 0, finalMin = 0, finalSec = 0;
		Scanner userInput = new Scanner(System.in);

		//scans user input for two times 
		System.out.print("Enter a first time: ");
		firstMilitaryTime = userInput.nextInt();
		System.out.print("Enter a second time: ");
		secondMilitaryTime = userInput.nextInt();

		//separates first and second time input into hours, minutes and seconds
		firstHour = firstMilitaryTime / 10000; 
		firstMin = firstMilitaryTime % 10000;    
		firstMin = firstMin / 100;	    
		firstSec = firstMilitaryTime  % 100;  

		secHour = secondMilitaryTime / 10000; 	
		secMin = secondMilitaryTime % 10000;    
		secMin = secMin / 100;    
		secSec = secondMilitaryTime % 100;  	
		
		//computes total seconds for each time 
		totalFirstTime = (firstHour * SECONDS_IN_HOUR) + (firstMin * SECONDS_IN_MINUTE) + firstSec;
		totalSecondTime = (secHour * SECONDS_IN_HOUR) + (secMin * SECONDS_IN_MINUTE) + secSec;

		//subtracts second time from first time 
		finalTime = totalFirstTime - totalSecondTime;

		//converts total seconds into final hours, minutes and seconds 
		finalHour = finalTime / 3600;
		finalMin = finalTime % 3600;
		finalMin = finalMin / 60;
		finalSec = finalTime % 60;

 		//Gets the final time with leading zeros
 		finalTime = finalHour * 10000 + finalMin * 100 + finalSec; 

 		System.out.println("Your time difference is " + finalTime);
 		System.exit (0);
	}
}
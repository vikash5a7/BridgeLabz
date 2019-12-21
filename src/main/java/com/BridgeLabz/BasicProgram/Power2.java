/******************************************************************************
	 *  Compilation:  javac -d bin Primeno.java
	 *  Execution:    java -cp bin com.bridgeLabz.util.Utility
	 *  
	 *  Purpose:  This program takes a command-line argument N and prints a table of the powers of 2
	 *  		 that are less than or equal to 2^N.
	 *
	 *  @author  VIKASH KUMAR
	 *  @version 1.0
	 *  @since   18-12-2018
	 *
	 ******************************************************************************/


package com.BridgeLabz.BasicProgram;

import com.bridgeLabz.util.Utility;

public class Power2 {
	public static void main(String[] args) {
		System.out.println("Please enter the power value:");
		int num = Utility.inputNumber();
		findingPower(num);
	}

	// To determine the power of given number
	private static void findingPower(int num) {
		int power = 1;
		if (num >= 0 && num < 31) {
			for (int i = 0; i <= num; i++) {
				System.out.println("2 ^" + i + " = " + power);
				power = power * 2;
			}
		}
	}

}

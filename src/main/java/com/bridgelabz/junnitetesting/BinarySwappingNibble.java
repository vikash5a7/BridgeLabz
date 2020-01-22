/******************************************************************************
	 *  Purpose: Swapping binary nibbles
	 *
	 *  @author  VIKASH KUMAR
	 *  @version 1.0
	 *  @since   28-12-2018
	 *
	 ******************************************************************************/


package com.bridgelabz.junnitetesting;

import com.bridgelabz.util.Utility;

public class BinarySwappingNibble {
	static int newNum;

	public static void main(String[] args) {
		try {
			System.out.println("enter your number: ");
			int num = Utility.inputNumber();
			swappinngNibble(num);
			System.out.println("Number before swapping: "+ num);
			System.out.println("Number after swapping: "+ newNum);
		} 
		catch (Exception e) {
			System.out.println("Number are invalide: ");
		}

	}

	public static int swappinngNibble(int num) {
		return newNum = ((num & 0x0F) << 4 | (num & 0xF0) >> 4);

	}

}
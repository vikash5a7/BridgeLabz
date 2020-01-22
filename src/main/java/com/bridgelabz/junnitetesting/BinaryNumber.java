package com.bridgelabz.junnitetesting;

import com.bridgelabz.util.Utility;

public class BinaryNumber {
	public static void main(String[] args) {
		try {
			System.out.println("enter a number: ");
			int number = Utility.inputNumber();
			Utility.scanner.close();
			System.out.println(Utility.decimalToBinary(number));
		} catch (Exception e) {
			System.out.println("Enter valid input as number only: "+ e);
		}
	}	
}

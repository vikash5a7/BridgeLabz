package com.BridgeLabz.junniteTesting;

import com.bridgeLabz.util.Utility;

public class BinaryNumber {
	public static void main(String[] args) {
		System.out.println("enter a number: ");
		int number = Utility.inputNumber();
		int[] binarArray = Utility.decimalToBinary(number);
		for (int i = binarArray.length-1; i>=0; i--) {
			System.out.print(binarArray[i]);
			
		}
		for (int i : binarArray) {
			System.out.println(i);
		}
		
	}
	
}

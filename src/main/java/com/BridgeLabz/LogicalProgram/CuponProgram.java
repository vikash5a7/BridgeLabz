package com.BridgeLabz.LogicalProgram;

import java.util.Random;

import com.bridgeLabz.util.Utility;

public class CuponProgram {
	 static Random rn = new Random();
	public static void main(String[] args) {
		System.out.println("enter how many number do you want to print :");
		int number = Utility.inputNumber();
		int[] genrateNumber = generate(number);
		for (int i : genrateNumber) {
			System.out.print(i);
		}
	}

	private static int[] generate(int number) {
		
		int count = 0 ;
		int[] randomGenerateNumber = new int [number];
		while(count<number)
		{
			count++;
			//Random class
			
			// storing all the random value in array
			for (int i = 0; i < randomGenerateNumber.length; i++) {
				int randomNumber = rn.nextInt(9) + 1;
				randomGenerateNumber[i] = randomNumber;
				
			}
		}
		return randomGenerateNumber;
}
}
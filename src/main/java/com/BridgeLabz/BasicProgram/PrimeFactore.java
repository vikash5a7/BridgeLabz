package com.BridgeLabz.BasicProgram;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bridgeLabz.util.utility;

public class PrimeFactore {
	public static void main(String args[]) {
		
		System.out.println("Enter any Number to find Prime Factors "); //
		int number = utility.inputNumber();
		System.out.println("Given Number is : " + number);
		System.out.print("Prime Factors are : ");
		try {
			for (int i = 2; i <= number; i++) {

				while (number % i == 0) {
					System.out.print(i + " ");
					number = number / i;
				}
			}

			if (number < 1)
				System.out.println(number);
		
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("enter valid input: ");
		}

}
}

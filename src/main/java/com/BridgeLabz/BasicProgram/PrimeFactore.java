/******************************************************************************
	 *  Compilation:  javac -d bin Primeno.java
	 *  Execution:    java -cp bin com.bridgeLabz.util.Utility
	 *  
	 *  Purpose:  Computes the prime factorization of N using brute force.
	 *
	 *  @author  VIKASH KUMAR
	 *  @version 1.0
	 *  @since   18-12-2018
	 *
	 ******************************************************************************/

package com.BridgeLabz.BasicProgram;

import com.bridgeLabz.util.Utility;

public class PrimeFactore {
	int[] arrayForPrimeFacore = new int[20];
	public static void main(String[] args) {

		System.out.println("Enter any Number to find Prime Factors "); //
		int number = Utility.inputNumber();
		System.out.println("Given Number is : " + number);
		System.out.print("Prime Factors are : ");

		System.out.println(primeFactoreNumber(number));
	}

	private static int[] primeFactoreNumber(int number) {
		int[] arrayForPrimeFacore = new int[20];
		for (int i = 2; i <= number; i++) {
	
			while (number % i == 0) {
				System.out.print(i + " ");
				number = number / i;
			}
		}

		if (number < 1)
			for (int i : arrayForPrimeFacore) {
				arrayForPrimeFacore[i]=number;
			}
		return arrayForPrimeFacore;
		}

}
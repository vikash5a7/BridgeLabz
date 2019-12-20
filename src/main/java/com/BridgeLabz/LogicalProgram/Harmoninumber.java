package com.BridgeLabz.LogicalProgram;

public class Harmoninumber

{

	public static void main(String[] args) {
		System.out.println("Please enter the Nth harmonic value:");
		int number = utility.inputNumber();

		
		final float a = 1;
		double harmonic = 0;
		if (number > 0) {
			for (int i = 1; i <= number; i++) {
				System.out.print(a+ "/" + i + "\t");
				harmonic = harmonic + a / i;
			}
			System.out.println();
			System.out.println(number + " Harmonic value:" + harmonic);
		} else {
			System.out.println("Enter a number which is greater  0 : ");
		}
	}
}

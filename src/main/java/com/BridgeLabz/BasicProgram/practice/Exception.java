package com.BridgeLabz.BasicProgram.practice;

public class Exception {

	public static void main(String[] args) {
		try {
			
			int data = 100 / 0;
		} 
		catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("rest of the code...");
		}
		// rest code of the program
		System.out.println("rest of the code...");
	}
}

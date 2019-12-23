package com.BridgeLabz.junniteTesting;

import com.bridgeLabz.util.Utility;

public class VendingMachine {

	/* function to count and 
	 * print currency notes 
	 * */ 
		public static void countCurrency(int amount) 
		{ 
			int[] notes = new int[]{ 2000, 500, 200, 100, 50, 20, 10, 5, 1 }; 
			int[] noteCounter = new int[9]; 
		
			// count notes using Greedy approach 
			for (int i = 0; i < 9; i++) { 
				if (amount >= notes[i]) { 
					noteCounter[i] = amount / notes[i]; 
					amount = amount - noteCounter[i] * notes[i]; 
				} 
			} 
		 
			// Print notes 
			System.out.println("Currency Count ->"); 
			for (int i = 0; i < 9; i++) { 
				if (noteCounter[i] != 0) { 
					System.out.println(notes[i] + " : "
						+ noteCounter[i]); 
				} 
			} 
		} 
		
		// driver function 
		public static void main(String[] args){ 
			System.out.println("ENTER YOUR AMOUNT: ");
			int amount = Utility.inputNumber(); 
			
			countCurrency(amount); 
		} 
		
		/* This code is contributed by Sagar Shukla */
	} 

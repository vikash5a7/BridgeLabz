/******************************************************************************
	 *  Purpose: vending machine program
	 *  @author  VIKASH KUMAR
	 *  @version 1.0
	 *  @since   24-12-2018
	 *
	 ******************************************************************************/
package com.bridgelabz.junnitetesting;

public class VendingMachine {

	/* function to count and 
	 * print currency notes 
	 * */ 

	static int[] notes = new int[]{1000 ,500, 100,50,10, 5,  2, 1}; 
	static int[] noteCounter = new int[8]; 
	
		public static void countCurrency() 
		{
			int amount = 120;
			// count notes using Greedy approach 
			for (int i = 0; i < 8; i++) { 
				if (amount >= notes[i]) { 
					noteCounter[i] = amount / notes[i]; 
					amount = amount - noteCounter[i] * notes[i]; 
				} 
			} 
			// for testing purpose 
		 
			// Print all the notes: 
			System.out.println("Currency Count ->"); 
			for (int i = 0; i < 8; i++) { 
				if (noteCounter[i] != 0) { 
					System.out.println(notes[i] + " : "
						+ noteCounter[i]); 
				} 
			} 
		} 
		
		
		
		public static String printNote()
		{
			String numberOfNote = "";
			for (int i : noteCounter) {
				
					numberOfNote =numberOfNote + i + " ";
			}
			return numberOfNote;
			
		}
		public static void main(String[] args){ 
			System.out.println("ENTER YOUR AMOUNT: is 120 ");
			countCurrency(); 
			System.out.println(printNote());
		} 

	} 

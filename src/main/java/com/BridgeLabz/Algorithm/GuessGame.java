/***********************************************
 * purpose : Takes a command-line argument N,
 * 			 asks you to think of a number between 0 and N-1, 
 * 			where N = 2^n, and always guesses the answer with n questions.

 *           
 * @author  vikash kumar
 * @version 1.0
 * @since   20/12/2019          
 ***********************************************/


package com.BridgeLabz.Algorithm;

import com.bridgeLabz.util.Utility;

public class GuessGame {

	public static void main(String[] args) {

		System.out.println("guess a no between 0 to 5 ");
		Utility.scanner.next();
		try {
			System.out.println("guessed no is " + find());
		} catch (Exception e) {
			System.out.println("enter correct input");
		}
	}
	/**
	 * function to fine the number
	 */
	static int find() {

		int low = 0;
		int high = 5;
		int mid;
		while (low != high) {
			mid = (low + high) / 2;
			System.out.println("enter 1 if no is between " + low + " - " + mid + "\nEnter 2 if no is between "
					+ (mid + 1) + " - " + high);
			int c = Utility.scanner.nextInt();
			mid = (low + high) / 2;
			if (c == 1)
				high = mid;
			else
				low = mid + 1;
		}
		return low;
	}

}

/******************************************************************************
	 *  Purpose: PROGRAM FOR FINDING THE SQRT OF PROGRAM
	 *  @author  VIKASH KUMAR
	 *  @version 1.0
	 *  @since   24-12-2018
	 *
	 ******************************************************************************/

package com.BridgeLabz.junniteTesting;

import com.bridgeLabz.util.Utility;

public class Sqrt {

	/**
	 * Main method to test the class
	 * 
	 * @throws Exception if input is not integer
	 */
	public static void main(String[] args) {
		try {
			System.out.println("ENTER A NUMBER TO FIND SQUARE: ");
			double c = Utility.scanner.nextDouble();
			System.out.println("square root is " + Utility.sqrt(c));
			Utility.scanner.close();
		} catch (Exception e) {
			System.out.println("ENTER A VALID INTEGER VALUE:  " + e.getMessage());
		}

	}
}

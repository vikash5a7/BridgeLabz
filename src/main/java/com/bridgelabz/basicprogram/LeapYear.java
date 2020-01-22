/******************************************************************************
	 *  Compilation:  javac -d bin LEAPYEAR
	 *  Execution:    java -cp bin com.bridgeLabz.util.Utility
	 *  
	 *  Purpose:  Determine if it is a Leap Year.
	 *
	 *  @author  VIKASH KUMAR
	 *  @version 1.0
	 *  @since   18-12-2018
	 *
	 ******************************************************************************/
package com.bridgelabz.basicprogram;

import com.bridgelabz.util.Utility;

public class LeapYear {
	public static void main(String[] args) {
			try {
				System.out.println("Please enter year : ");
				int year = Utility.inputNumber();
				System.out.println(Utility.leapOrNot(year));
				
			} catch (Exception e) {
				System.out.println("enter valide number: ");
			}
	}

	
}

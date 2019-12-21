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
package com.BridgeLabz.BasicProgram;

import com.bridgeLabz.util.Utility;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Please enter year : ");
		int year= Utility.inputNumber();
		System.out.println(Utility.leapOrNot(year));
	}
	
 public static boolean leapOrNot(int year)
 {
		int count = Utility.numberOfDigit(year);;
	 if(count>=4)
		 return Utility.leapOrNot(year);
	 else
		 return false;
	 
 }
}

/********************************************************************************************
 * Purpose : calendar  
 * @author :vikash kumar
 * @version:1.0
 * @date   :04/01/2020
 * @Filename:TwoDarray.java
 ********************************************************************************************/
package com.BridgeLabz.DataStructure;

import com.bridgeLabz.util.Utility;

public class CalenderProgram {
	public static void main(String[] args) {
		System.out.println("Enter your Month Number: ");
		int month = Utility.inputNumber();
		System.out.println("Enter your year number: ");
		int year = Utility.inputNumber();

		int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] daysName = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "sat" };
		System.out.println("\n \n \n .......... Calender of  Year-" + year + " Month- " + month + "th  ...........\n");
		// printing days...
		for (int i = 0; i < daysName.length; i++) {
			System.out.print(daysName[i] + "\t");
		}
		// checking year is leap year or not
		System.out.println();
		if (Utility.leapOrNot(year)) {
			daysInMonth[1] = 29;
		}

		// storing the days value in empt for printing space
		int empt = day(month, year);
		int count = -1;
		// for printing space
		for (int i = 0; i < empt; i++) {
			System.out.print(" \t");
			count++;
		}

		// printing days using based on the year and month:
		for (int i = 1; i <= daysInMonth[month - 1]; i++) {
			count++;
			if (count % 7 == 0)
				System.out.println();
			System.out.print(i + "\t ");
		}
	}

	// finding day by implementing this formula in method:
	public static int day(int m, int y) {
		int d = 1;
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12) % 7;
		return d0;

	}
}

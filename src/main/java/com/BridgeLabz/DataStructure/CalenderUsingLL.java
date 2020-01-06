/********************************************************************************************
 * Purpose : calendar using linked list: 
 * @author :vikash kumar
 * @version:1.0
 * @date   :01/01/2020
 * @Filename:TwoDarray.java
 ********************************************************************************************/

package com.BridgeLabz.DataStructure;

import com.BridgeLabz.DataStructure.LinkedListProgram.LinkedList12;
import com.bridgeLabz.util.Utility;

public class CalenderUsingLL {

	public static void main(String[] args) {
		int year = 2020;
		int month = 2;

		LinkedList12 list = new LinkedList12();
		LinkedList12 list2 = new LinkedList12();
		String[] week = { "", "S", "M", "T", "W", "T", "F", "S" };
		String[] monthDays = { " ","31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31" };
		for (int i = monthDays.length - 1; i > 0; i--) {
			list2.insertAtFirst(monthDays[i]);
		}
		int day = CalenderProgram.day(month, year);

		for (int i = week.length - 1; i > 0; i--) {
			list.insertAtFirst(week[i]+" ");
		}
		if (Utility.leapOrNot(year)) {
			monthDays[2] = "29";
		}
		int count = 0;

		list.viewList();

		System.out.println("");

		// for printing space
		for (int i = 0; i < day; i++) {
			System.out.print("  ");
			count++;
		}
		// printing days using based on the year and month:
		for (int i = 1; i <= Integer.parseInt(monthDays[month]); i++) {
			count++;
			if (count % 7 == 0)
				System.out.println();
			System.out.print(i+" ");
		}
	}

}

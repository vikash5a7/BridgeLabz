/******************************************************************************
	 *  Purpose: Day of week 
	 *
	 *  @author  VIKASH KUMAR
	 *  @version 1.0
	 *  @since   24-12-2018
	 *
	 ******************************************************************************/

package com.BridgeLabz.junniteTesting;

import com.bridgeLabz.util.Utility;

public class DayOfWeek {
	public static void main(String[] args) {
		try {
			
			int d;
			int m;
			int y;
			System.out.println("enter date in day:(DD) month(M) year(yyyy)");
			d = Utility.scanner.nextInt();
			m = Utility.scanner.nextInt();
			y = Utility.scanner.nextInt();
			System.out.println("day is "+Utility.dayOfWeek(d, m, y));
			Utility.scanner.close();
		}catch(Exception e) {
			System.out.println("enter valid input: ");
		}
		}		
}

/******************************************************************************
	 *  Purpose: PROGRAM FOR THE PAYMENTS MONTHLY
	 *  @author  VIKASH KUMAR
	 *  @version 1.0
	 *  @since   24-12-2018
	 *
	 ******************************************************************************/

package com.bridgelabz.junnitetesting;

import com.bridgelabz.util.Utility;

public class PaymentsMonthly {

	public static void main(String[] args) {
		try {
			System.out.println("ENTER YOUR 1.PRINCIPAL(p): 2.YEAR(Y): 3.RATE(R): ");
			double p = Utility.scanner.nextDouble();
			double y = Utility.scanner.nextDouble();
			double r = Utility.scanner.nextDouble();
			Utility.scanner.close();
			System.out.println("MONTLY PAYMENTS: " + Utility.monthlyPayment(p, y, r));
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	} 	 	

}

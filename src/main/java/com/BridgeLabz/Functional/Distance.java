/***********************************************
 * purpose : Write a program Distance.java that takes two integer command-line arguments x and y and
 * 			 prints the Euclidean distance from the point (x, y) to the origin (0, 0). 
 * 			The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
 *
 *           
 * @author  vikash kumar
 * @version 1.0
 * @since   20/12/2019          
 ***********************************************/

package com.BridgeLabz.Functional;

public class Distance {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		try {
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);

		} catch (NumberFormatException e) {
			System.out.println("invalide input! ");
		}
		double distance = Math.sqrt(num1 * num1 + num2 * num2);
		System.out.println(distance);
	}
}

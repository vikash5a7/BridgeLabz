/***********************************************
 * purpose : Palidrome Program: 
 *           
 * @author  vikash kumar
 * @version 1.0
 * @since   26/12/2019          
 ***********************************************/
package com.BridgeLabz.Algorithm;

public class Palidrome {
	
 static String str = "";
	public static void palidrome(int n) {
		int r, sum = 0, temp;
		// It is the number variable to be checked for palindrome

		temp = n;
		while (n >0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum) {

			str = str + sum + " ";
		}
	}
}

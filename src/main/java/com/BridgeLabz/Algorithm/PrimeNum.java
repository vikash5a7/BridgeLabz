/***********************************************
 * purpose : Prime Number Program
 *           
 * @author  vikash kumar
 * @version 1.0
 * @since   26/12/2019          
 ***********************************************/

package com.BridgeLabz.Algorithm;

import com.bridgeLabz.util.Utility;

public class PrimeNum {
	public static void main(String[] args) {
		System.out.println("enter a number: ");
		int num = Utility.inputNumber();
		int count=0;
		for (int i = 1; i <num/2 ; i++) {
			if(num%i==0)
			{
				count++;
			}
		}
		if(count<2)
		{
			System.out.println("its a prime");
		}
		else
		{
			System.out.println("it is not prime number");
		}
	}

}

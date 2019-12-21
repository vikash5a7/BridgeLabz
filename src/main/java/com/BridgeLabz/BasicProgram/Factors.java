/***********************************************
 * purpose : to find the prime factor of given number
 *           
 * @author  vikash kumar
 * @version 1.0
 * @since   20/12/2019          
 ***********************************************/

package com.BridgeLabz.BasicProgram;
import com.bridgeLabz.util.Utility;
public class Factors {
	public static void main(String[] args) {
		System.out.println("enter a number to find factore");
		int num= Utility.inputNumber();
		System.out.println(num + " The prime factore of given number");
		factor(num);
}
	
	public static int[] factor(int num)
	{
		for( int i=1; i<=num/2;i++)
		{
			if(num%i==0)
			{
				System.out.print(i + " ");
			}
		}
		return null;
	}
	
}

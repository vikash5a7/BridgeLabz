/***********************************************
 * purpose : to find the prime factor of given number
 *           
 * @author  vikash kumar
 * @version 1.0
 * @since   20/12/2019          
 ***********************************************/

package com.bridgelabz.basicprogram;
import com.bridgelabz.util.Utility;
public class Factors {
	public static void main(String[] args) {
		System.out.println("enter a number to find factore");
		int num= Utility.inputNumber();
		System.out.println(num + " The prime factore of given number");
		System.out.println(factor(num));
}
	
	public static String factor(int num)
	{
		String str = "";
		for( int i=1; i<=num/2;i++)
		{
			if(num%i==0)
			{
				str = str+ i +" ";
			}
		}
		return str;
	}
	
}

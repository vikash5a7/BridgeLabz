package com.BridgeLabz.Algorithm;

import com.bridgeLabz.util.Utility;
public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		int total = 0;
		int count = 0;
		int i;
		System.out.println("enter your number to find prime number : ");
		Utility.inputNumber();
		
		int num = Utility.inputNumber();
		for (i = 1; i < num; i++)
		{	
			count =0;
			for (int j = 2; j < i/2; j++) {
				if(i%j==0)
				{
					count++;
					break;
				}			
			}
			if(count==0)
			{
				System.out.println(i + " ");
				Palidrome.palidrome(i);
				total++;
			}
		
		}
		
		System.out.println("Total number of prime b/w 1 To " + num +" :-" + total);
		System.out.println("PALIDROM NUMBER ARE : " + Palidrome.str);
	}
}

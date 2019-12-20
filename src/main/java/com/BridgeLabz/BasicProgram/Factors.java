package com.BridgeLabz.BasicProgram;
import com.bridgeLabz.util.utility;
public class Factors {
	public static void main(String[] args) {
		System.out.println("enter a number to find factore");
		int num= utility.inputNumber();
		System.out.println(num + " The prime factore of given number");
		for( int i=1; i<=num/2;i++)
		{
			if(num%i==0)
			{
				System.out.print(i + " ");
			}
		}
	}
	
}

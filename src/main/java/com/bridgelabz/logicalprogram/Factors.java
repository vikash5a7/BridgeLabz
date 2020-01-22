package com.bridgelabz.logicalprogram;

public class Factors {
	public static void main(String[] args) {
		System.out.println("enter a number to find factore");
		utility.inputNumber();
		int num= utility.number;
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

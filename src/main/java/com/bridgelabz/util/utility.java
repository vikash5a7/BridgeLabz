package com.bridgelabz.util;

import java.util.Scanner;

public class utility {
	public static String name; 
	public static int number;
	public static int count=0;
	
	
	// taking a single number from from the user..
	static Scanner scanner=new Scanner(System.in);
	public static String inputName()
	{
		 name = scanner.nextLine();
		return name;
	}
	
	
	
	// taking a string from the keyboard and return it. 
	public static int inputNumber()
	{
		return number = scanner.nextInt();
		
	}
	
	// count number of digit in number
	public static int numberOfDigit(int num)
	{
		while(num != 0)
		{
			count ++;
			num /= 10;
			
		}
		return count;
	}

	
	// this method is used for printing the array:
		public static	void printArray(int arr[])
		{
			int n = arr.length;
			for (int i=0; i<n; ++i)
				System.out.print(arr[i] + " ");
			System.out.println();
		}
		
	
	
}

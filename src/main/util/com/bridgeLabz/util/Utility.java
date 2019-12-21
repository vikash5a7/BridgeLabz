package com.bridgeLabz.util;

import java.util.Scanner;
public class Utility {
	 
	// taking a string from the keyboard and return it.
	public static Scanner scanner=new Scanner(System.in);
	public static String inputName()
	{
		String name; 
		name = scanner.nextLine();
		return name;
	}
	
	
	
	// taking a integer from the keyboard and return it. 
	public static int inputNumber()
	{
		return scanner.nextInt();
		
	}
	
	// taking a double from the keyboard and return it.
	public static double inputDouble()
	{
		return scanner.nextDouble();
		
	}
	
	// count number of digit in number
	public static int numberOfDigit(int num)
	{
		 int count=0;
		 while(num != 0)
		{
			count ++;
			num /= 10;
			
		}
		return count;
	}
		// INSERTING INTEGER ELEMENT IN ARRAY
	
		public static int[] inserting(int num)
		{
			int[] array = new int[num];
			for (int i = 0; i < num; i++) {
				array[i] = scanner.nextInt();
			}
			return array;
		
		}
	
	// this method is used for printing the array:
		public static	void printArray(int[] arr)
		{
			int num = arr.length;
			for (int i=0; i<num; ++i)
				System.out.print(arr[i] + " ");
			System.out.println();
		}

	// this method is used for printing the double array:
	public static void prinDoubletArray(double[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
		
		
		
		//To insert integer elements in array 
	public static int[][] inArray() {

		System.out.println("ENTER ROWS AND COLUMN");
		int row = scanner.nextInt();
		int colm = scanner.nextInt();

		int[][] array = new int[row][colm];
		System.out.println("PLEASE ENTER ONLY INTEGER VALUE ONLY");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < colm; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		return array;

	}

	
	
	//for printing 2D integer array from given size 
	
	public static int[][] showIntArray(int[][] array) {
		int row = array.length;
		int coul = array[0].length;
		for( int i=0; i<row; i++)
		{
			for( int j=0; j<coul;j++)
			{
				if(j<coul -1)
				{
					System.out.print(array[i][j] + " , ");
				}
				else
				{
					System.out.print(array[i][j]);
				}
			}
			System.out.println();
		}
		return array;
	}
	
	// To insert double elements in array
	public static double[][] doubleArray() {

		System.out.println("Please enter number of rows");
		int row = scanner.nextInt();
		System.out.println("Please enter number of colmns");
		int colm = scanner.nextInt();

		double[][] array = new double[row][colm];
		System.out.println("PLEASE ENTER ONLY THE DOUBLE VALUE: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < colm; j++) {
				array[i][j] = scanner.nextDouble();
			}
		}
		return array;

	}

//for printing 2D double array from given size 

	public static double[][] showDoubleArray(double[][] array) {
		int row = array.length;
		int coul = array[0].length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coul; j++) {
				if (j < coul - 1) {
					System.out.print(array[i][j] + " , ");
				} else {
					System.out.print(array[i][j]);
				}
			}
			System.out.println();
		}
		return array;
	}
		
	// To insert double elements in array
		public static boolean[][] booleanArray() {

			System.out.println("Please enter number of rows");
			int row = scanner.nextInt();
			System.out.println("Please enter number of colmns");
			int colm = scanner.nextInt();

			boolean[][] array = new boolean[row][colm];
			System.out.println("please enter the elements ");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < colm; j++) {
					array[i][j] = scanner.nextBoolean();
				}
			}
			return array;

		}

	//for printing 2D double array from given size 

		public static boolean[][] ShowBooleanArray(boolean[][] array) {
			int row = array.length;
			int coul = array[0].length;
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < coul; j++) {
					if (j < coul - 1) {
						System.out.print(array[i][j] + " , ");
					} else {
						System.out.print(array[i][j]);
					}
				}
				System.out.println();
			}
			return array;
		}
			
/*    To finding the year is leap year or not:          */
		
	public static boolean leapOrNot(long year) {
		if (year % 400 == 0)
			return true;
		else if (year % 100 == 0)
			return false;
		else if(year % 4 == 0)
			return true;
		else
			return false;
	}
}

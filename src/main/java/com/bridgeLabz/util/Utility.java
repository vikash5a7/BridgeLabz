package com.bridgeLabz.util;

import java.util.Arrays;
import java.util.Scanner;
public class Utility {
	 
	// taking a string from the keyboard and return it.
	public static final Scanner scanner=new Scanner(System.in);
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
		// TING INTEGER ELEMENT IN ARRAY
	
		public static int[] ting(int num)
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
		
		
		
		//To t integer elements in array 
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
	
	// To t double elements in array
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
		
	// To t double elements in array
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

		/**for printing 2D double array from given size
		 * 
		 * @param boolean array
		 * @param row a integer value
		 *  @param coul a integer value
		 * @return returning array
		 */

		public static boolean[][] showBooleanArray(boolean[][] array) {
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
			
		/** To finding LeapOrNot a year
		 * 
		 * @param year  a integer value
		 * @return boolean value as it's leap or not
		 */
		
	public static boolean leapOrNot(long year) {
		if (year % 400 == 0)
			return true;
		else if (year % 100 == 0)
			return false;
		else if (year % 4 == 0)return true;
		else
			return false;
	}
	
	/**for finding the Celsius to Fahrenheit: 
	 * 
	 * @param fahrenheit
	 * @return fahrenheit
	 */
	 public static double fahrenheittoCelsius(double fahrenheit)
	 {
		return ((fahrenheit-32) * 5/9);
		 
	 }
	 /**for finding the Fahrenheit to Celsius
		 * 
		 * @param fahrenheit
		 * @return fahrenheit
		 */
	 public static double celsiustoFahrenheit(double celsius)
	 {
		return  ((celsius * 9/5)+32 );

		 
	 }
	 
	 /**
		 * Function to check the day of the week of given date
		 *
		 * @param d int value for day of date
		 * @param m int value for month of year
		 * @param y int value for year
		 * @return day of week from 1 to 7
		 */
	 	public static int dayOfWeek(int d, int m, int y) {
			int y0 = y - (14 - m) / 12;
			int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
			int m0 = m + 12 * ((14 - m) / 12) - 2;
			return (d + x + (31 * m0) / 12) % 7;
		
		}
	 	/**
		 * calculating the monthly payments
		 *
		 * @param p the principal amount given
		 * @param y the year for which p is given
		 * @param r the rate at which p is given
		 * @return monthly payment
		 */
		public static double monthlyPayment(double p, double y, double r) {
			double n = 12 * y;
			double r0 = r / (12 * 100);
			return p * r0 / (1 - Math.pow((1 + r0), -n));
			
		}
		
		/**
		 * For finding the square
		 *
		 * @param c the value to find square root of
		 * @return return the square root
		 */
		
		public static double sqrt(double c) {

			double t = c;
			double epsilon = 1e-15;
			while (Math.abs(t - c / t) > epsilon * t) {
				t = (c / t + t) / 2;
			}

			return t;
		}
		
		/**
		 * For for finding binary nUmber:
		 *
		 * @param n the value to find binary of
		 * @return return the binaryArray 
		 */
		public static String decimalToBinary(int number)
		{
			int i =0;
			String str = "";
			int[] binarArray = new int[50];
			while(number>0)
			{
				binarArray[i] = number%2;
				str = str+binarArray[i];
				i++;
				number = number/2;
			
			    
			}
			
			return  Utility.reverseStringUsingArray(str);
		}
		/**
		 * For Reversing of the given string:
		 *
		 * @param str a string value:
		 * @return return the rev;
		 */
		public static StringBuilder reverseString(String str){   
		    StringBuilder rev = new StringBuilder(); 
		    rev.append(str);
		    rev.reverse();
		    return rev;
		    
		}  
		/**
		 * For Reversing of the given string:
		 *
		 * @param str a string value:
		 * @return return the rev;
		 */
		public static String reverseStringUsingArray(String str){  
		    char ch[]=str.toCharArray();  
		    String rev="";  
		    for(int i=ch.length-1;i>=0;i--){  
		        rev+=ch[i];  
		    }  
		    return rev;  
		}  
		
		/** 
		* Swap Characters at position 
		* @param a string value 
		* @param i position 1 
		* @param j position 2 
		* @return swapped string 
		*/
		public static String swap(String a, int i, int j) 
		{ 
			char temp; 
			char[] charArray = a.toCharArray(); 
			temp = charArray[i] ; 
			charArray[i] = charArray[j]; 
			charArray[j] = temp; 
			return String.valueOf(charArray); 
		} 

		/** 
		* permutation function 
		* @param str string to calculate permutation for 
		* @param l starting index 
		* @param r end index 
		*/
		@SuppressWarnings("unused")
		private static void permute(String str, int l, int r) 
		{ 
			if (l == r) 
				System.out.println(str); 
			else
			{ 
				for (int i = l; i <= r; i++) 
				{ 
					str = swap(str,l,i); 
					permute(str, l+1, r); 
					str = swap(str,l,i); 
				} 
			} 
		} 
		
		/** 
		* Sorting number using bubble sorting
		* comparing the adjacent elements 
		* @param array is integer type
		* @param temp integer type for storing temporary value
		* @param flag intergerType
		*/

	public static int[] bubbleSortForIntergerValue(int[] array) {
		int temp;
		for (int i = 0; i < array.length; i++) {
			int flag = 0;
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}
		return array;

	}
	/** 
	* Sorting String using bubble sorting
	* comparing the adjacent elements 
	* @param array is integer type
	* @param temp integer type for storing temporary value
	* @param flag intergerType
	*/
	
	
	public static String[] bubbleSortForIntergerValue(String[] array) {
		String temp;
		for (int i = 0; i < array.length; i++) {
			int flag = 0;
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j].compareTo(array[j+1])>0) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}
		return array;

	}
		
	/**
	 * to search a word using binary
	 * 
	 * @param arr
	 * @param s   word which is to be searched
	 * @return integer index
	 */
	public static int binary(String[] arr, String s) {
		int high = arr.length - 1;
		int low = 0;
		int mid;
		Arrays.sort(arr);

		while (low <= high) {
			mid = (high + low) / 2;
			if (s.equalsIgnoreCase(arr[mid])) {
				return mid;
			} else if (arr[mid].compareToIgnoreCase(s) < 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return -1;
	}



/** 
* Sorting String using selection sorting
* repeatly finding the minimum elements and later it's swap with each other
* @param array is integer type
* @param temp integer type for storing temporary value
* @param min integer for storing the index of minimum
*/
	public static int[] selectionSort(int[] array) {
		int temp =0;
		int min=0;
		for (int i = 0; i < array.length; i++) {
			min=i;
			for (int j = i+1; j < array.length; j++) {
				if(array[j]<array[min])
				{
					min=j;
				}
				temp =array[i];
				array[i]=array[min];
				array[min]=temp;
			}	
		}
		return array;
	}
		
	/** 
	*  FOR SEARCHING THE ELEMENTS FROM THE ARRAY:
	*  USING THE BINNARY SEARCH 
	* @param STRING ARRAY
	* @param temp integer type for storing temporary value
	* @param min integer for storing the index of minimum
	*/
	public static int binarySearchForString(String[] arr, String x) 
			{ 
				int l = 0; 
				int r = arr.length - 1; 
				while (l <= r) { 
					int m = l + (r - l) / 2; 

					int res = x.compareTo(arr[m]); 

					// Check if x is present at mid 
					if (res == 0) 
						return m; 

					// If x greater, ignore left half 
					if (res > 0) 
						l = m + 1; 

					// If x is smaller, ignore right half 
					else
						r = m - 1; 
				} 

				return -1; 
			} 

	public static int[] isertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j = i;
			while (j > 0 && array[j - 1] > temp) {
				array[j] = array[j - 1];
				j = j - 1;
			}
			array[j] = temp;
		}
		return array;

	}
	/**
	 * function to insert integer in array
	 * 
	 * @param number
	 * @return array
	 */
	public static int[] inserting(int num) {
		int[] array = new int[num];
		for (int i = 0; i < array.length; i++) {
			array[i]=Utility.inputNumber();
		}
		return array;
	}
	
	
	/**
	 * function to check if given no is prime or not
	 * 
	 * @param n the number which to check for prime
	 * @return true if prime false if not
	 */
	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i== 0) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * function to check if given anagram or not
	 * 
	 * @param s1, and s2 for checking anagram are not
	 * @return true if prime false if not
	 */
	 public static boolean checkAnagram(String s1, String s2)
	    {
	        s1 = s1.replaceAll("\\s", "");
	        s2 = s2.replaceAll("\\s", "");
	        
	        
	        if(s1.length() != s2.length())
	            return false;
	        else
	        {
	            // Convert both Strings into lower case and into Character Array
	            char[] arr1 = s1.toLowerCase().toCharArray();
	            char[] arr2 = s2.toLowerCase().toCharArray();
	            
	            // Sort both Character Array
	            Arrays.sort(arr1);
	            Arrays.sort(arr2);
	            
	            // Check if both arrays are equal
	            return (Arrays.equals(arr1, arr2));
	        }
	    }
	 
	 /**
		 * to check the values are anagrams or not
		 * 
		 * @param n1
		 * @param n2
		 * @return
		 */
		public static boolean anagram(int n1, int n2) {
			int[] n1count = count(n1);
			int[] n2count = count(n2);
			for (int i = 0; i < n2count.length; i++) {
				if (n1count[i] != n2count[i]) {
					return false;
				}
			}
			return true;
		}
		/**
		 * Function to count the value in given integer be place
		 * 
		 * @param n the integer value to count
		 * @return the integer array for the count value
		 */
		public static int[] count(int n) {
			int[] count = new int[10];
			int temp = n;
			while (temp != 0) {
				int r = temp % 10;
				count[r]++;
				temp = temp / 10;
			}
			return count;
		}
}

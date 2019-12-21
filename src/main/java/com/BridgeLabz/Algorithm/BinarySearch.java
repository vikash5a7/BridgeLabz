package com.BridgeLabz.Algorithm;
import com.bridgeLabz.util.Utility;
public class BinarySearch {
	// Java program to implement Binary Search for strings
		static int binarySearch(String[] arr, String x) 
		{ 
			int l = 0, r = arr.length - 1; 
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

		// Driver method to test above 
		public static void main(String []args) 
		{ 
			System.out.println("please eanter a string which you want to search");
			String[] arr = { "vikash", "ram", "sita", "practice"}; 
			Utility.inputName();
			String x = Utility.inputName();
			int result = binarySearch(arr, x); 

			if (result == -1) 
				System.out.println("Element not present"); 
			else
				System.out.println("Element found at "
								+ "index " + result); 
		} 
} 


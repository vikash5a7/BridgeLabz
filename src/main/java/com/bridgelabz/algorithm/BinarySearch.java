/***********************************************
 * purpose : Binary search for the string 
 *           
 * @author  vikash kumar
 * @version 1.0
 * @since   20/12/2019          
 ***********************************************/package com.bridgelabz.algorithm;
import com.bridgelabz.util.Utility;
public class BinarySearch {
	
		public static void main(String []args) 
		{ 
			System.out.println("please eanter a string which you want to search");
			String[] arr = { "abc", "def", "ghi", "klm"}; 
			String x = Utility.inputName();
			int result = Utility.binarySearchForString(arr, x);
			if (result == -1) 
				System.out.println("Element not present"); 
			else
				System.out.println("Element found at "
								+ "index " + result); 
		} 
} 


package com.BridgeLabz.Algorithm;

import com.bridgeLabz.util.Utility;

public class GenericMethodForSorting {
	public static void main(String[] args) {

		System.out.println("please eanter a string which you want to search");
		String[] arr = { "abc", "def", "ghi", "klm" };
		String x = Utility.inputName();
		String[] sortedArray = Utility.bubbleSortForIntergerValue(arr);
		
		System.out.println("Sorted Array: ");
		for (String string : sortedArray) {
			System.out.println(string);
		}
		int result = Utility.binarySearchForString(arr, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at " + "index " + result);
	}
}
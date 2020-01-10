package com.BridgeLabz.Algorithm.All;

import com.bridgeLabz.util.Utility;

public class BinarSearch {

	public static void main(String[] args) {
		int[] array = {1,2,4,5,6,8,9,10,11};
		System.out.println("enter a number to be search in array: ");
		int search = Utility.inputNumber();
		binarySearch(array, search);
}

	public static String binarySearch(int[] array, int search) {
		String searchedValue = "";
		int low = 0;
		int high = array.length-1;
		int mid = (low+high)/2;
		while(low<=high)
		{
			
			if (array[mid] < search)
				low = mid + 1;
			else if (array[mid] == search) {
				System.out.println(search + " found at location " + (mid + 1) + ".");
				searchedValue = search + " found at location " + (mid + 1);
				break;
			} else {
				high = mid - 1;
			}
			mid = (low + high) / 2;
			if (low > high)
			{
			System.out.println(search + " is not found.\n");
			searchedValue = "Not Found";
			}
		}
	
		return searchedValue;
	}
}
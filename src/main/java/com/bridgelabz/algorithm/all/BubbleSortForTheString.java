package com.bridgelabz.algorithm.all;

import com.bridgelabz.util.Utility;

public class BubbleSortForTheString {
	public static void main(String[] args) {
		String[] array = { "vikash", "ram", "anshu", "ravi", "vineetha" };
		String[] sortedArray = Utility.bubbleSortForIntergerValue(array);
		for (String string : sortedArray) {
			System.out.println(string);
		}
	}
}	

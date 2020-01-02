package com.BridgeLabz.AlgorithmTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgeLabz.util.Utility;

class InsertionSortTest {

	@Test
	void test() {
		try {
			System.out.println("SORTING USING THE INSERTION SORTING: ");
			System.out.println("ENTER HOW MANY NUMBER DO YOU WANT TO ENTER IN ARRAY: ");
			int num = Utility.inputNumber();
			System.out.println("ENTER YOUR ELEMENTS IN ARRAY: ");
			int[] actual = Utility.inserting(num);
			System.out.println("Enter your Expected array: ");
			int [] expected = Utility.inserting(num);
			Utility.scanner.close();
			int[] sortedArray = Utility.isertionSort(actual);
			System.out.println("YOUR SORTED ARRAY ARE: ");
			assertArrayEquals(expected, actual);
			for (int i : sortedArray) {
				System.out.print(i + " ");
			}
		} catch (Exception e) {
			System.err.println("ENTER VALID INPUT PLEASE: ");
		}
	}

}

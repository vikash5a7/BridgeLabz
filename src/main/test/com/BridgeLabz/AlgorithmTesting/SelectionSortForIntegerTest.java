package com.BridgeLabz.AlgorithmTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgeLabz.util.Utility;
/*
 *  sorting array using the selectioin sorting: 
 * 
 * 
 */
class SelectionSortForIntegerTest {

	@Test
	void test() {
		try {
			System.out.println("ENTER HOW MANY NUMBER DO YOU WANT TO ENTER IN ARRAY: ");
			int num = Utility.inputNumber();
			System.out.println("ENTER YOUR ELEMENTS IN ARRAY: ");
			int[] actual = Utility.inserting(num);
			System.out.println("Enter your Expected array: ");
			int [] expected = Utility.inserting(num);
			Utility.scanner.close();
			int[] sortedArray = Utility.selectionSort(actual);
			assertArrayEquals(expected, actual);
			System.out.println("YOUR SORTED ARRAY ARE: ");
			for (int i : sortedArray) {
				System.out.print(i + " ");
			}
		} catch (Exception e) {
			System.out.println("ENTER VALID NUMBER: ");
		}
	}

}

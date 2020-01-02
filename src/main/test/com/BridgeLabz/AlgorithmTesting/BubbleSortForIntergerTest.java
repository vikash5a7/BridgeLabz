package com.BridgeLabz.AlgorithmTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgeLabz.util.Utility;
/*
 * Bubble sorting.............
 */
class BubbleSortForIntergerTest {

	@Test
	void test() {
		try {
			System.out.println("SORTING USING THE BUBBLE SORTING: ");
			System.out.println("ENTER HOW MANY NUMBER DO YOU WANT TO ENTER IN ARRAY: ");
			int num = Utility.inputNumber();
			System.out.println("ENTER YOUR ELEMENTS IN ARRAY: ");
			int [] array = Utility.inserting(num);
			System.out.println("Enter your Expected array: ");
			int [] expected = Utility.inserting(num);
			Utility.scanner.close();
			int[] actual = Utility.bubbleSortForIntergerValue(array);
			assertArrayEquals(expected, actual);
			System.out.println("YOUR SORTED ARRAY ARE: ");
			for (int i : actual) {
				System.out.print(i+ " ");
			}
		} catch (Exception e) {
			System.out.println("ENTER VALID NUMBER: ");
		}
	}

}

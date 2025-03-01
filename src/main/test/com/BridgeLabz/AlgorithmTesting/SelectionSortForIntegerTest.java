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

		int[] expected = { 1, 2, 3, 4 };
		int[] array = { 2, 4, 1, 3 };
		int[] actual = Utility.selectionSort(array);
		assertArrayEquals(expected, actual);

	}
	
	
	@Test
	void test2() {
		int[] expected = { 2, 3, 4, 5};
		int[] array = { 2, 4, 3, 5};
		int[] actual = Utility.selectionSort(array);
		assertArrayEquals(expected, actual);


	}


}

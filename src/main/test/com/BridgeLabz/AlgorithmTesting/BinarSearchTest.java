package com.BridgeLabz.AlgorithmTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sortingAlogorithm.BinarSearch;
/*
 * binary search: 
 * array are : {1,2,4,5,6,8,9,10,11};
 * 
 */
class BinarSearchTest {

	@Test
	void test() {
		int[] array = {1,2,4,5,6,8,9,10,11};
		int search = 5;
		String actual = BinarSearch.binarySearch(array, search);
		String expected = "5 found at location 4";
		assertEquals(expected, actual);
	}

}

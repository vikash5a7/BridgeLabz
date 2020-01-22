package com.BridgeLabz.AlgorithmTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/*
 * binary search: 
 * array are : {1,2,4,5,6,8,9,10,11};
 * this is for the valid data and for valid output
 * 
 */
class BinarSearchTest {

	@Test
	void test() {
		int[] array = {1,2,4,5,6,8,9,10,11};
		int search = 5;
		String actual = com.bridgelabz.algorithm.all.BinarSearch.binarySearch(array, search);
		String expected = "5 found at location 4";
		assertEquals(expected, actual);
	}
	
	/*
	 * binary search: 
	 * array are : {1,2,4,5,6,8,9,10,11};
	 * this is for the valid data and for valid output but for not found: 
	 * 
	 */
	
	@Test
	void test2() {
		int[] array = {1,2,4,5,6,8,9,10,11};
		int search = 12;
		String actual = com.bridgelabz.algorithm.all.BinarSearch.binarySearch(array, search);
		String expected = "Not Found";
		assertEquals(expected, actual, " searching for not found");
	}

}

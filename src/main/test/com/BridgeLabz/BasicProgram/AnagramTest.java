/******************************************************************************
	 *  Purpose: TESTING FOR ANAGRAM
	 *  @author  VIKASH KUMAR
	 *  @version 1.0
	 *  @since   24-12-2018
	 *
	 ******************************************************************************/

package com.BridgeLabz.BasicProgram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.BridgeLabz.Algorithm.Anagram;

class AnagramTest {

	@Test
	/*
	 *  1 means it's anagram 
	 * 	0 means it's not anagram 
	 * 	2 means it's invalid String
	 * this is for valid input and valid output
	 */
	void test1() {
		int actual = Anagram.angramCheck("vikash", "vikash");
		int expectd = 1;
		assertEquals(expectd, actual);
	}
	/*
	 * this is invalid data with valid output
	 * it's should return the true value
	 */
	@Test
	void test3() {
		int actual = Anagram.angramCheck("vikash", "akasha");
		int expectd = 0;
		assertEquals(expectd, actual);
	}
	/*
	 * this is invalid data with invalide output
	 * it's should return the false value
	 */
	@Test
	void test2() {
		int actual = Anagram.angramCheck("vikash", "vikash");
		int expectd = 2;
		assertNotEquals(expectd, actual);
	}

}

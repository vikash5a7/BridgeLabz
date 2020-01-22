/******************************************************************************
	 *  Purpose: TESTING FOR FACTOR 
	 *  @author  VIKASH KUMAR
	 *  @version 1.0
	 *  @since   24-12-2018
	 *
	 ******************************************************************************/

package com.BridgeLabz.BasicProgram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.basicprogram.Factors;

class FactorsTest {

	@Test
	void test() {
		String actual = Factors.factor(12);
		String expected = "1 2 3 4 6 ";
		assertEquals(expected, actual);
	}
	
	@Test
	void test1() {
		String actual = Factors.factor(120);
		String expected = "1 2 3 4 6 ";
		assertNotEquals(expected, actual);
	}
	
	@Test
	void test2() {
		String actual = Factors.factor(100);
		String expected = "1 2 4 5 10 20 25 50 ";
		assertEquals(expected, actual);
	}
	@Test
	void test3() {
		String actual = Factors.factor(120);
		String expected = "1 2 3 4 6 ";
		assertNotEquals(expected, actual);
	}

	
}

package com.BridgeLabz.BasicProgram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


/*
 * Testing for the power of 2
 * with valid data and valid input
 * 
 */
class Power2Test {

	@Test
	void test() {
		String actual = Power2.findingPower(5);
		String expected = "1 2 4 8 16 32 ";
		assertEquals(expected, actual);
		
	}
	/*
	 * Testing with invalid data 
	 */
	@Test
	void test2() {
		String actual = Power2.findingPower(7);
		String expected = "1 2 4 ";
		assertNotEquals(expected, actual);
		
	}

}

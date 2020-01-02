
/******************************************************************************
	 *  Purpose: TESTING add to zero
	 *  @author  VIKASH KUMAR
	 *  @version 1.0
	 *  @since   24-12-2018
	 *
	 ******************************************************************************/
package com.BridgeLabz.Functional;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntegerAddsToZEROTest {

	@Test
	void test() {
		int[] a = {1,0,4,1,1};
		int actual = IntegerAddsToZERO.numberOfTripleSum(a);
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	void test2() {
		int[] a = {0,0,0,1,-1};
		int actual = IntegerAddsToZERO.numberOfTripleSum(a);
		int expected = 4;
		assertEquals(expected, actual);
	}

}

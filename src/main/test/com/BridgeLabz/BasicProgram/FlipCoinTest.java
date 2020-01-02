/******************************************************************************
	 *  Purpose: TESTING FOR PERCENTAGE OF HEAD AND TELL
	 *  @author  VIKASH KUMAR
	 *  @version 1.0
	 *  @since   24-12-2018
	 *
	 ******************************************************************************/

package com.BridgeLabz.BasicProgram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FlipCoinTest {

	@Test
	void test() {
		double[] actual = FlipCoin.percentageOfHeadAndTail(2);
		for (@SuppressWarnings("unused") double d : actual) {
			FlipCoin.percentageOfHeadAndTail(5);
		}
		double[] expected = {5.0,5.0};
		assertArrayEquals(expected, actual);
	}

}

/******************************************************************************
	 *  Purpose: TESTING FOR harmonic number
	 *  @author  VIKASH KUMAR
	 *  @version 1.0
	 *  @since   24-12-2018
	 *
	 ******************************************************************************/

package com.BridgeLabz.LogicalProgram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.logicalprogram.Harmoninumber;

class HarmoninumberTest {

	@Test
	void test() {
		
		double actual = Harmoninumber.harmonicNumber(12);
		double expected = 3.103210709989071;
		assertEquals(expected, actual);
	}

}

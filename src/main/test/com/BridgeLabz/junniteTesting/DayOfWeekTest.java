/******************************************************************************
	 *  Purpose: TESTING DAY OF WEEK
	 *  @author  VIKASH KUMAR
	 *  @version 1.0
	 *  @since   24-12-2018
	 *
	 ******************************************************************************/

package com.BridgeLabz.junniteTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgeLabz.util.Utility;

class DayOfWeekTest {

	@Test
	void test() {
		double actual = Utility.dayOfWeek(24, 12, 2019);
		assertEquals(2, actual);
	}
	@Test
	void test1() {
		double actual = Utility.dayOfWeek(24, 2, 2109);
		assertEquals(0, actual);
	}
	@Test
	void test2() {
		double actual = Utility.dayOfWeek(2, 12, 2109);
		assertNotEquals(2, actual);
	}
	@Test
	void test3() {
		double actual = Utility.dayOfWeek(4, 12, 2130);
		assertEquals(1, actual);
	}

}

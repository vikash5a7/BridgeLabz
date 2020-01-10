/******************************************************************************
	 *  Compilation:  javac -d bin LEAPYEARtEST
	 *  Execution:    java -cp bin com.bridgeLabz.util.Utility
	 *  
	 *  Purpose:  testing if it is a Leap Year.

	 *
	 *  @author  VIKASH KUMAR
	 *  @version 1.0
	 *  @since   18-12-2018
	 *
	 ******************************************************************************/


package com.BridgeLabz.BasicProgram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgeLabz.util.Utility;

class LeapYearTest {

	@Test
	void test() {
		boolean actual = Utility.leapOrNot(2004);
		assertEquals(true, actual, "checking for 2004 ");
	}

	@Test
	void test1() {
		boolean actual = Utility.leapOrNot(2014);
		assertEquals(false, actual," checking for non leap year 2014");
	}
	@Test
	void test2() {
		boolean actual = Utility.leapOrNot(2004);
		assertEquals(true, actual);
	}
	@Test
	void test3() {
		boolean actual = Utility.leapOrNot(200);
		assertEquals(false, actual, "Checking for the less than 3 digit" );
	}

}

/******************************************************************************
	 *  Purpose: TESTING FOR NAME TEST
	 *  @author  VIKASH KUMAR
	 *  @version 1.0
	 *  @since   24-12-2018
	 *
	 ******************************************************************************/


package com.BridgeLabz.BasicProgram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.basicprogram.Name;

class NameTest {

	@Test
	void test() {
		String actual = Name.display("vikash");
		String expected = "Name after replaced: Hello vikash ,How are you?";
		assertEquals(expected, actual, "String method");
	}
	
	@Test
	void test1() {
		String actual = Name.display("v");
		String expected = "ENTER MORE THAN THREE CHARACTER: ";
		assertEquals(expected, actual, "CHECKING FOR THE LESS THAN 3 CHARACTER");
	}
	@Test
	void test2() {
		String actual = Name.display("somu");
		String expected = "Name after replaced: Hello somu ,How are you?";
		assertEquals(expected, actual, "Name after replaced:");
	}

}

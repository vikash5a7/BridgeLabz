package com.BridgeLabz.BasicProgram.Practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.basicprogram.practice.math;

class mathTestUnit {

	@Test
	void test() {
		math m = new math();
		int expected = 3;
		int actual = m.add(1, 2);
		assertEquals(expected, actual);
		
	}

}

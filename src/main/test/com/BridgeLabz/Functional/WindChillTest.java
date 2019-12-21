package com.BridgeLabz.Functional;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WindChillTest {

	@Test
	void test() {
	double actual = WindChill.windChill(120, 340);
	double expected = 149.45401344630147;
	assertEquals(expected, actual);
	
	}

}

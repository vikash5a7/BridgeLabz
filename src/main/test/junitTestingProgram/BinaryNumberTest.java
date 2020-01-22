package junitTestingProgram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.util.Utility;

class BinaryNumberTest {

	@Test
	void test() {
		String actual = Utility.decimalToBinary(100);
		String expected = "1100100";
		assertEquals(expected, actual);
	}
	@Test
	void test1() {
		String actual = Utility.decimalToBinary(100);
		String expected = "11001";
		assertNotEquals(expected, actual);
	}
}

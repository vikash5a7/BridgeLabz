/******************************************************************************
	 *  Purpose: Testing Swapping binary nibbles
	 *
	 *  @author  VIKASH KUMAR
	 *  @version 1.0
	 *  @since   28-12-2018
	 *
	 ******************************************************************************/
package junitTestingProgram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.junnitetesting.BinarySwappingNibble;

class BinarySwappingNibbleTest {

	@Test
	void test() {
		int actual = BinarySwappingNibble.swappinngNibble(52);
		assertEquals(67, actual);
	}

}

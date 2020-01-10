/******************************************************************************
	 *  Purpose: TESTING THE SQRT PROGRAM 
	 *  @author  VIKASH KUMAR
	 *  @version 1.0
	 *  @since   24-12-2018
	 *
	 ******************************************************************************/

package junitTestingProgram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgeLabz.util.Utility;

class SqrtTest {

	@Test
	void testForvalideInput() {
		double actual = Utility.sqrt(16);
		assertEquals(4.0, actual);
	}
	@Test
	void testForInvalideInput() {
		double actual = Utility.sqrt(16);
		assertNotEquals(3.4, actual);
	}
	@Test
	void testvalideinputOfdecimal() {
		double actual = Utility.sqrt(3);
		assertEquals(1.7320508075688772, actual);
	}
}

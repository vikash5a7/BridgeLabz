/******************************************************************************
	 *  Purpose: VENDING MACHINE PROGRAM
	 *  @author  VIKASH KUMAR
	 *  @version 1.0
	 *  @since   25-12-2020
	 *
	 ******************************************************************************/


package junitTestingProgram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.bridgelabz.junnitetesting.VendingMachine;

class VendingMachinePTest {
	/* note are arranging in this order
	 * 1000 ,500, 100,50,10, 5,  2, 1
	 * 0      0   1   0  2  0   0  0
	 * 
	 * 120 rupee taken as the 
	 */
	@Before
	void testforMethod()
	{
		VendingMachine.countCurrency();
	}
	
	
	@Test
	void test() {
		VendingMachine.countCurrency();
		String actual = VendingMachine.printNote();
		String expected = "0 0 1 0 2 0 0 0 ";
		assertEquals(expected, actual);
	}
	
	@Test
	void test3() {
		VendingMachine.countCurrency();
		String actual = VendingMachine.printNote();
		String expected = "1 0 2 0 0 0 ";
		assertNotEquals(expected, actual);
	}

}

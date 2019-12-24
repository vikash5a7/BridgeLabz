/******************************************************************************
	 *  Purpose: TESTING THE PAYMENTS MONTHLY PROGRAM:
	 *  @author  VIKASH KUMAR
	 *  @version 1.0
	 *  @since   24-12-2018
	 *
	 ******************************************************************************/

package com.BridgeLabz.junniteTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgeLabz.util.Utility;

class PaymentsMonthlyTest {

	@Test
	void testingValidInput() {
		double actual = Utility.monthlyPayment(1200, 3, 20);
		assertEquals(44.59630003168866, actual);
	}
	
	void testingInValidInput() {
		double actual = Utility.monthlyPayment(12, 3, 20);
		assertNotEquals(44.59630003168866, actual);
	}


}

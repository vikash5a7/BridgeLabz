/******************************************************************************
	 *  Purpose: TESTING Quadtric equation
	 *  @author  VIKASH KUMAR
	 *  @version 1.0
	 *  @since   24-12-2018
	 *
	 ******************************************************************************/

package com.BridgeLabz.Functional;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.functional.Quadratic;

class QuadraticTest {

	@Test
	void test() {
		int a = 120;
		int b = 120;
		int c = 120;
		double delta = Quadratic.delta(a, b, c);
		double sqr = Quadratic.sqrt(delta);
		double actualTestForRootX1 = Quadratic.root1(a, b, delta);
		double expected= 7775999.5;
		double actualTestForRootX2 =Quadratic.root2(a, b, delta);
		double expected2= -7776000.5;
		assertEquals(expected, actualTestForRootX1);
		assertEquals(expected2, actualTestForRootX2);
		
	}

}

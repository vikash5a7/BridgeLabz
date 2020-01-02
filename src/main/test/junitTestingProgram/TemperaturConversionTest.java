/******************************************************************************
	 *  Purpose: TESTING TEMPRATURE CONVERSION PROGRAM 
	 *  @author  VIKASH KUMAR
	 *  @version 1.0
	 *  @since   24-12-2018
	 *
	 ******************************************************************************/



package junitTestingProgram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgeLabz.util.Utility;

class TemperaturConversionTest {

	@Test
	void celsiustoFahrenheit() {
		double actual = Utility.celsiustoFahrenheit(125);
		assertEquals(257.0, actual);
	}
	@Test
	void fahrenheittoCelsius() {
		double actual = Utility.fahrenheittoCelsius(125);
		assertEquals(51.666666666666664, actual);
	}

}

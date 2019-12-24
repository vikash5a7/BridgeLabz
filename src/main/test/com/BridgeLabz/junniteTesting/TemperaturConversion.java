/******************************************************************************
	 *  Purpose: temperature conversion program
	 *
	 *  @author  VIKASH KUMAR
	 *  @version 1.0
	 *  @since   24-12-2018
	 *
	 ******************************************************************************/


package com.BridgeLabz.junniteTesting;

import com.bridgeLabz.util.Utility;

public class TemperaturConversion {
	public static void main(String[] args) {
		int num;
		try {
			System.out.println("ENTER WHAT YOU WANT TO DO ?");
			System.out.println("PRESS 1: FOR THE Celsius to Fahrenheit: ");
			System.out.println("PRESS 2: FOR THE Fahrenheit To celsius: ");
			num = Utility.inputNumber();
			switch (num) {
			case 1:
				System.out.println("ENTER TEMPERATURE IN CELSIUS (C):");
				double celsius = Utility.inputDouble();
				System.out.println(Utility.celsiustoFahrenheit(celsius) + "°F");
				break;

			case 2:
				System.out.println("ENTER TEMPERATURE IN FARANHEIT(F)");
				double fahranheit = Utility.inputDouble();
				System.out.println(Utility.fahrenheittoCelsius(fahranheit) + "°c");
				break;
			default:
				System.out.println("PLEASE ENTER VALID INPUT ONE AND TWO: ");
			}
		} catch (Exception e) {
			System.out.println("ENTER VALID INPUT: 1 OR 2");
		}
	}
}

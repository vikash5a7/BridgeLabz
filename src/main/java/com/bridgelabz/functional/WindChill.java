/**************************************************************************************************************
 * purpose : Write a program WindChill.java that takes two double command-line arguments t and v and prints the
 * 			 wind chill.
 *           
 * @author  vikash kumar
 * @version 1.0
 * @since   20/12/2019          
 ********************************************************************************************************/



package com.bridgelabz.functional;

import com.bridgelabz.util.Utility;

public class WindChill {
	

	public static void main(String[] args) {

		System.out.println("Please enter temperature t in Fahrenheit:");
		double t = Utility.inputDouble();
		System.out.println("Please enter wind speed v  in miles per hour :");
		double v = Utility.inputDouble();
		System.out.println("wind chill :" + windChill(v, t));
	}

	public static double windChill(double v, double t) {
		double poe = Math.pow(v, 0.16);
		double value= (35.74 + 0.6215 * t + (0.4275 * t - 35.75) * poe);
		return value;

	}
}
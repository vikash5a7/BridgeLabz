/******************************************************************************
 * Purpose:  for measuring the time that elapses between the start and end clicks 
 *
 * @author 	VIKASH KUMAR
 * @version 10.0
 * @since 23-12-2019
 *
 ******************************************************************************/
package com.BridgeLabz.LogicalProgram;

import java.util.Scanner;

public class StopWatch {

	static double start = 0;
	static double stop = 0;

	/**
	 * Function to put start time and print it
	 */
	static void startTime() {
		start = System.currentTimeMillis();
		System.out.println("started at " + start);
	}

	/**
	 * function to put stop time and print it
	 */
	static void stopTime() {
		stop = System.currentTimeMillis();
		System.out.println("stopped at " + stop);
	}
	
	
	/**
	 * function to calculate elapsed time and print it
	 */
	static void elapsedTime() {
		System.out.println("elapsed time is " + (stop - start) / 1000);
		System.out.println(" " + (stop - start) + "ms");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter 1 to start");
		s.next();
		startTime();
		System.out.println("enter to stop");
		s.next();
		s.close();
		stopTime();
		elapsedTime();
	}
}

package com.BridgeLabz.LogicalProgram;



public class TimePrgTocountForloop {

	public static void main(String[] args) {
		// starting time
		long start = System.currentTimeMillis();

		// start of function

		countFunction(10);

		// end of function

		// ending time
		long end = System.currentTimeMillis();
		System.out.println("Counting to 10000000 takes " + (end - start) + "ms");
	}

	// A dummy function that runs a loop x times
	public static void countFunction(long x) {
		System.out.println("Loop starts");
		for (long i = 0; i < x; i++);
		System.out.println("Loop ends");
	}
}

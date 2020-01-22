package com.bridgelabz.logicalprogram;

public class Time {
	static long start;
	public static void main(String[] args) {
		startTime();
	}
	static void startTime() {
		start = System.currentTimeMillis();
		System.out.println("started at " + start);
	}
}

package com.BridgeLabz.Functional;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter temperature t in Fahrenheit:");
		double t = sc.nextDouble();
		System.out.println("Please enter wind speed v  in miles per hour :");
		double v = sc.nextDouble();
		double  poe = Math.pow(v, 0.16);
		System.out.println(poe);
		double w = 35.74 + 0.6215 * t +	 (0.4275 * t - 35.75) * poe;
		
		System.out.println("wind chill :" + w);
	}
}
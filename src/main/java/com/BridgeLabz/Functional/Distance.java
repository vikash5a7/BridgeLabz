package com.BridgeLabz.Functional;

public class Distance {
public static void main(String[] args) {
	int num1 = 0;
	int num2=0;
	try
	{
		num1 = Integer.parseInt(args[0]);
		num2 = Integer.parseInt(args[1]);
		
	}
	catch (NumberFormatException e) {
		e.printStackTrace();
	}
	double distance = Math.sqrt(num1*num1 + num2 	*num2);
	System.out.println(distance);
}
}

/***********************************************
 * purpose : Write a program Quadratic.java to find the roots of the equation 
 *
 *           
 * @author  vikash kumar
 * @version 1.0
 * @since   20/12/2019          
 ***********************************************/




package com.BridgeLabz.Functional;

import com.bridgeLabz.util.Utility;

public class Quadratic {
	public static void main(String[] args) {

		System.out.println("ENTER THREE VALUE A, B, C : ");
		double a = Utility.inputDouble();
		double b = Utility.inputDouble();
		double c = Utility.inputDouble();
		Utility.scanner.close();
		double delta = delta(a,b,c);
		
		System.out.println("delat value :" + delta);
		
		System.out.println("Root 1 of x =  " + Quadratic.root1(b, a, delta));
		System.out.println("Root 2 of x =  " + Quadratic.root1(b, a, delta));

	}
	
	// TO FINDING THE DELTA VALUE 
	public static double delta(double a, double b, double c) {
		return  b * b - 4 * a * c;
		
	}
	// TO FINDING THE SQUARE OF GIVEN DELTA
	public static double sqrt(double delat) {
		return delat * delat;
	}
	
	// TO FINDING THE FIRST ROOT 
	public static double root1(double b, double a,double delta) {
		return (-b + sqrt(delta)) / (2 * a);	
	}
	// TO FINDING THE SECOND ROOT 
	public static double root2(double b, double a,double delta) {
		return (-b - sqrt(delta)) / (2 * a);	
	}

	

}

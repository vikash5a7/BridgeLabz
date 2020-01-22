/**************************************************************************************************************
 * purpose : A library for reading in 2D arrays of integers, doubles, or booleans from standard input and
 * 			 printing them out to standard output.
 *           
 * @author  vikash kumar
 * @version 1.0
 * @since   20/12/2019          
 ********************************************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class Array2D {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter a dataType which you want to insert into array");
		Utility.inputName();
		String dataType = Utility.inputName();
		int[][] arr;
		boolean[][] booleanArray;
		double[][] doubleArray;
		if (dataType.equals("int")) {
			arr = Utility.inArray();
			Utility.showIntArray(arr);
		} else if (dataType.equals("double")) {
			doubleArray = Utility.doubleArray();
			Utility.showDoubleArray(doubleArray);
		} else if (dataType.equals("boolean")) {
			booleanArray = Utility.booleanArray();
			Utility.showBooleanArray(booleanArray);
		} else {
			System.out.println("enter Correct DataType");
		}
	}
}

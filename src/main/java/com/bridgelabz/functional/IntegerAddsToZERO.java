/***********************************************
 * purpose : A program with cubic running time. Read in N integers and counts the  
 * 	 		number of triples that sum to exactly 0.
 *
 *           
 * @author  vikash kumar
 * @version 1.0
 * @since   20/12/2019          
 ***********************************************/

package com.bridgelabz.functional;

import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class IntegerAddsToZERO {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("HOW MANY NUMBER DO YOU WANT TO INSERTING INTO ARRAY:  ");
		int num = Utility.inputNumber();
		int a[] = new int[num];
		System.out.println("ENTER YOUR ELEMENTS: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		numberOfTripleSum(a);
	}

	public static int numberOfTripleSum(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length - 2; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				for (int k = j + 1; k < a.length; k++) {
					if ((a[i] + a[j] + a[k]) == 0) {
						count++;
						System.out.print(a[i]);
						System.out.print(", ");
						System.out.print(a[j]);
						System.out.print(", ");
						System.out.print(a[k]);
						System.out.println();

					}
				}
			}
		}
		System.out.println(" Count " + count);
		return count;
	}

}

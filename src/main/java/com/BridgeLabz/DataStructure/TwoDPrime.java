/********************************************************************************************
 * Purpose :storing the prime number in 2d array
 * @author :vikash kumar
 * @version:1.0
 * @date   :01/01/2020
 * @Filename:TwoDarray.java
 ********************************************************************************************/

package com.BridgeLabz.DataStructure;

import com.bridgeLabz.util.Utility;

public class TwoDPrime {

	public static void main(String[] args) {
		int[][] array=new int[10][100];
		int[][] prime=new int[10][100];
		int temp=1;
		// storing values 1 - 1000;
		for (int i = 0; i< 10; i++) {
			for (int j = 0; j < 100; j++) {
				array[i][j]=temp;
				temp++;
			}
		}	
		// checking is value are prime number or not
		for (int i = 0; i <10; i++) {
			for (int j = 0; j < 100; j++) {
				if(Utility.isPrime(array[i][j]))
				{
				prime[i][j]=array[i][j];
				}
				else
				{
					prime[i][j]=-1;
				}
			}
		}
	
	/************
	 * for printing array
	 */

		for (int[] i : prime) {
			
			for (int j : i) {
				if(j!=-1&& j!=1) // checking condition
				{
					System.out.print(j+" ");
				}
			}
			System.out.println("\n");
		}
		for(int i = 0 ; i<10 ; i++) {
			for(int j = 0 ; j<100;j++) {
				if(prime[i][j]!=-1) {
				for(int k = j+1 ; k <100;k++ ) {
				if(prime[i][k]!=-1&& Utility.anagram(prime[i][j],prime[i][k])) {
					System.out.println(prime[i][j]+" "+ prime[i][k]);
				}
				}
				}
			}
		}
		
	}

}
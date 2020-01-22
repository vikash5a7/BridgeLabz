/******************************************************************************
	 *  Compilation:  javac -d bin flipcoin
	 *  Execution:    java -cp bin com.bridgeLabz.util.Utility
	 *  
	 *  Purpose:  Flip Coin and print percentage of Heads and Tails 
	 *
	 *  @author  VIKASH KUMAR
	 *  @version 1.0
	 *  @since   18-12-2018
	 *
	 ******************************************************************************/


package com.bridgelabz.basicprogram;
import com.bridgelabz.util.Utility;

public class FlipCoin {
	static int counter = 1;
	static double heads = 0;
	static double tails = 0;
	static double randNum = 0.0;
	static double percentageOfTail;
	static double percentageOfhead;
	static double[] arry;

	public static void flipCoinn(int numberOfTime) {
		while (counter <= numberOfTime) {
			randNum = Math.random();
			if (randNum < 0.5) {
				heads++;
				System.out.println("\t heads");
			} else {
				tails++;
				System.out.println("\t tails");
			}
			counter++;

		}
	}
	public static double[] percentageOfHeadAndTail(int numberOfTime)
	{
		arry =new double[2];
		
			arry[0] =(int) (percentageOfhead = (heads / numberOfTime) * 100);
			arry[1] =(int) (percentageOfhead = (tails / numberOfTime) * 100);
		return arry;
	}

	public static void main(String[] args) {
		System.out.println("enter how many times do you want to print ?");
		int numberOfTime = Utility.inputNumber();
		FlipCoin.flipCoinn(numberOfTime);
		Utility.prinDoubletArray(percentageOfHeadAndTail(numberOfTime));

	}

}

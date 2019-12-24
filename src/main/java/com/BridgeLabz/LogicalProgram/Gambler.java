package com.BridgeLabz.LogicalProgram;
/******************************************************************************
 * Purpose: Simulates a gambler who start with $stake and place fair $1 bets 
 *  until he/she goes broke (i.e. has no money) or reach $goal.
 *  Keeps track of the number of times he/she wins and the number of bets he/she makes.
 *  Run the experiment N times, averages the results, and prints them out.
 *
 * @author vikash kumar
 * @version 10.0
 * @since 23-12-2019
 *
 ******************************************************************************/
import com.bridgeLabz.util.Utility;

public class Gambler {

	/**
	 * Function to simulate gamble
	 * 
	 * @param n      the value of no of times to bet
	 * @param stack the amount which you have
	 * @param goal  the value which to reach to win the gamble (not the bet)
	 */
	static void gamble(int noOfTimes, int stack, int goal) {
		int bets = 0; 
		int wins = 0; 

		// repeat number of times
		for (int i = 0; i < noOfTimes; i++) {
			int cash = stack;

			while (cash > 0 && cash < goal) {
				bets++;
				if (Math.random() < 0.5)
					cash++; // win $1
				else
					cash--; // lose $1
			}
			if (cash == goal)
				wins++; // to find no. of wins
		}

		// print results
		System.out.println();
		System.out.println(wins + " wins out of of " + noOfTimes);
		System.out.println("Percent of games won = " + 100.0 * wins / noOfTimes);
		System.out.println("Percent of games lost = " + 100.0 * (noOfTimes - wins) / noOfTimes);
		System.out.println("Total bets in " + noOfTimes + " games = " + bets);
	}

	public static void main(String[] args) {
		
		int n; 
		int stack;
		int goal;
		System.out.println("enter stack amount");
		stack = Utility.inputNumber();
		System.out.println("enter goal amount");
		goal = Utility.inputNumber();
		System.out.println("enter no of times to gamble");
		n = Utility.inputNumber();
		Utility.scanner.close();
		gamble(n,stack, goal);

	}


}

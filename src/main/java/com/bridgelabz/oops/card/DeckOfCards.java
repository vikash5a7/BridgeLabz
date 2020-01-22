/**
 * 
 */
package com.bridgelabz.oops.card;

import java.util.Random;

/**
 * @author vikash kumar
 *
 */
public class DeckOfCards {
	static String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
	static String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	static String[][] card = new String[suit.length][rank.length];

	/**
	 * 
	 * this function is used for shuffled card 
	 * here using random function for shuffling the card 
	 * 
	 */
	
	
	public static void suffledCard() {
		Random rand = new Random();

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				int k = rand.nextInt(4);
				int l = rand.nextInt(13);
				String temp = card[i][j];
				card[i][j] = card[k][l];
				card[k][l] = temp;

			}

		}
	}
	
	/**
	 * this function is for inserting the card into to the 2D array 
	 * 
	 */

	public static void insertingInArray() {
		int count = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				
				card[i][j] = rank[count % 13] + " " + suit[count / 13];
				count++;
			}

		}

	}

	
	/**
	 *  Printing the card and person
	 *  this function printing the person and all the card which alloted to him 
	 */
	public static void printCard() {
		int count = 1;
		for (int i = 0; i < 4; i++) {
			System.out.println("Person-> " +count);
			for (int j = 0; j < 9; j++) {
				System.out.print(card[i][j] + " ");
			}
			count++;
			System.out.println();
		}

	}
	

}

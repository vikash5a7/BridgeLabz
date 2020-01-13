package com.BridgeLabz.OOPS.Card;

public class DeckOfCards {
	static String[] suit = { "S", "D", "H", "C" };
	static String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "k", "A" };
	static String[][] card = new String[suit.length][rank.length];
	static String[] deck = new String[52];

	public static void main(String[] args) {
		
		insertingInArray();
		System.out.println("printing before Suffeled card ");
		printCard();

	}
/*
	public static void genratingCard() {
		for (int i = 0; i < deck.length; i++) {
			deck[i] = rank[i % 13] + suit[i / 13];
			System.out.println(deck[i]);
		}

	}



*/
	
	public void suffledCard()
	{
		for (int i = 0; i < card.length; i++) {
			System.out.println(i);
		}
	}
	
	
	public static void insertingInArray() {
		 int count = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				
				card[i][j] = rank[count % 13] + suit[count / 13];
				count++;
			}

		}

	}

	public static void printCard() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				System.out.print(card[i][j] + " ");
			}
			System.out.println();
		}

	}

}

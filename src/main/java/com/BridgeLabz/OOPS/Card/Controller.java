package com.BridgeLabz.OOPS.Card;

public class Controller {
	
	public static void main(String[] args) {
	DeckOfCards deck = new DeckOfCards();

		DeckOfCards.insertingInArray();
		System.out.println("printing before Suffeled card \n ");
		DeckOfCards.printCard();
		DeckOfCards.suffledCard();
		System.out.println("\nprinting after Suffeled card \n\n");
		DeckOfCards.printCard();

	}
	

	
}

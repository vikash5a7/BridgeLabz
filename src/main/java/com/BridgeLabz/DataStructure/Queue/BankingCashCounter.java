package com.BridgeLabz.DataStructure.Queue;

import java.util.Iterator;

import com.bridgeLabz.util.Utility;

public class BankingCashCounter {
	public static void main(String[] args) {
		int amout = 100000;
		System.out.println("Enter how many person: ");

		int person = Utility.inputNumber();
		UtilityForQueue q = new UtilityForQueue(person);
		for (int i = 0; i < person; i++) {
			q.enqueue(i);
		}
		while (person != 0) {
			int choice;
			System.out.println("enter your choice id number: " + q.peek());
			
			System.out.println("1. WITHDRAW 2. DEPOSIT: ");
			choice = Utility.inputNumber();
			switch (choice) {
			case 1:
				System.out.println("enter how much amount do you want to deposit: ");
				withdraw();
				person--;
				break;
			case 2:
				System.out.println("enter how much amount do you want to deposit: ");
				deposite();
				person--;
				break;

			default:
				System.out.println("Please enter valid choice");
				break;
			}

		}

	}

	private static void deposite() {
	}

	private static void withdraw() {

	}

}

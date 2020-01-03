package com.BridgeLabz.DataStructure.Queue;

import java.util.Iterator;

import com.bridgeLabz.util.Utility;

public class BankingCashCounter {
	public static void main(String[] args) {
		int amout = 10000;
		System.out.println("Enter how many person: ");
		
		int person = Utility.inputNumber();
		UtilityForQueue q = new UtilityForQueue(person);
		for (int i = 0; i < person; i++) {
			q.enqueue(i);
		}
		
			q.show();
		
	}

}

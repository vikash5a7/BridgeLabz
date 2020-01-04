package com.BridgeLabz.DataStructure;

import com.BridgeLabz.DataStructure.QueueUsingLinkedList.UtilityForDeque;
import com.bridgeLabz.util.Utility;

public class PalindromeChecker {
	static boolean status = false;

	public static void main(String[] args) {
		String str = "";
		UtilityForDeque dq = new UtilityForDeque();
		UtilityForDeque dq1 = new UtilityForDeque();
		System.out.println("ENTER YOUR STRING HERE: ");
		str = Utility.inputName();
		int strlength = str.length();
		System.out.println("your string: " + str);
		char[] c = str.toCharArray();
		for (char d : c) {
			dq.insertAtFront(d + "");
		}
		for (int i = 0; i < c.length; i++) {
			dq1.insertAtRear(c[i] + "");
		}
		System.out.print("\n Before Reverse : ");
		dq1.display();
		System.out.print("\n After Reversing: ");
		dq.display();
		palidrome(dq, dq1, strlength);
		if (status == true) {
			System.out.println("\nGIVEN STRING IS PALIDROME ");
		} else {
			System.out.println("\nGIVEN STRING IS NOT PALIDROME: ");
		}

	}

	private static boolean palidrome(UtilityForDeque dq, UtilityForDeque dq1, int strlength) {

		for (int i = 1; i < strlength; i++) {
			if (dq.peekAtFront().equals(dq1.peekAtFront())) {
				status = true;
			} else
				status = false;
		}
		return status;
	}
}

package com.BridgeLabz.Algorithm;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		int found = 0;
		int notFound = 0;
		int n;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER YOUR ONE STRING: ");
		String str = scan.nextLine();
		System.out.println("ENTER YOUR ANOTHER STRING WHICH YOU WANT TO CHECH");
		String str1 = scan.nextLine();
		if (str.length() == str1.length()) {
			n = str.length();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					found = 0;
					if (str.charAt(i) == str1.charAt(j)) {
						found = 1;
						break;
					}
				}
				if (found == 0) {
					notFound = 1;
				}
			}
			if (notFound == 1) {
				System.out.print("STRING ARE NOT ANAGRAM WITH EACH OTHER");
			} else {
				System.out.print("STRING ANAGRAM...!!!");
			}
		} else {
			System.out.print("BOTH STRING MUST HAVE SAME NUMBER OF CHARACTER..!");
		}
	}
}

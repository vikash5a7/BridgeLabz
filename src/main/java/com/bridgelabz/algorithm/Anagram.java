/***********************************************
 * purpose :An Anagram Detection Example
 *           
 * @author  vikash kumar
 * @version 1.0
 * @since   26/12/2019          
 ***********************************************/

package com.bridgelabz.algorithm;

import com.bridgelabz.util.Utility;

public class Anagram {
	static String str;
	static int n;
	static int notFound = 0;
	static int found = 0;

	public static void main(String[] args) {
		System.out.println("ENTER YOUR ONE STRING: ");
		str = Utility.inputName();
		System.out.println("ENTER YOUR ANOTHER STRING WHICH YOU WANT TO CHECH");
		String str1 = Utility.inputName();
		Utility.scanner.close();
		int result = angramCheck(str, str1);
		if (result == 1) {
			System.out.println("Angram: ");

		} else if (result == 0) {
			System.out.println("Not angram: ");
		} else {
			System.out.println("Input should have same length of string: ");
		}
	}

	public static int angramCheck(String str, String str1) {
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
				return 0;
			} else {
				return 1;
			}
		} else {
			return 2;
		}

	}
}

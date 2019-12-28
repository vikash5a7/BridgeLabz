package com.BridgeLabz.Algorithm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgeLabz.util.Utility;

public class SortingWordsFromTheFile {
	public static void main(String[] args) throws FileNotFoundException {
		String str = "";
		File file = new File("/home/user/Desktop/names.txt");
		Scanner sc = new Scanner(file);
		try {

			while (sc.hasNextLine()) {
				System.out.print(sc.next() + ", ");
				// storing the name from the file in str string 
				str = str + sc.nextLine();
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			sc.close();
		}
		// printing string value from the array
		System.out.println("............unsorting String are..............");
		System.out.println(str);
		// spliting str and storing into the String array
		String[] words = str.split(" ");
		
		System.out.println(Arrays.toString(words));
		// sorting array using the bubble sorting
		String[] sortedArray = Utility.bubbleSortForIntergerValue(words);
		// printing sorting array
		System.out.println("........Sorting names are............");
		for (String string : sortedArray) {
			System.out.print(string+ ", ");
		}
	}

}

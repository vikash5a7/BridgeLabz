package com.BridgeLabz.DataStructure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OerderedList {
	
		public static void main(String[] args) throws FileNotFoundException {
			
			  LinkedList llist = new LinkedList(); 
			File file = new File("/home/user/Desktop/names.txt");
			Scanner sc = new Scanner(file);
			try {

				while (sc.hasNextLine()) {
					 llist.append(sc.next());
				}
			} catch (Exception e) {
				System.out.println(e);
			} finally {
				sc.close();
			}
			llist.printList();
			
		}
		
}

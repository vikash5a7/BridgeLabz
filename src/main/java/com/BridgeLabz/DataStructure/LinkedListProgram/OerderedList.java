package com.BridgeLabz.DataStructure.LinkedListProgram;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.bridgeLabz.util.Utility;

public class OerderedList {
	
		public static void main(String[] args) throws IOException {
			
			 LinkedList list=new LinkedList();
			File file = new File("/home/user/Desktop/names.txt");
			Scanner sc = new Scanner(file);
			try {
				while (sc.hasNextLine()) {
					list.insertAtFirst(sc.next());
				}
			} catch (Exception e) {
				System.out.println(e);
			} finally {
				System.out.println("enter a word: ");
				String search = Utility.inputName();
				int pos=0 ;
				if(list.searchString(search)>1)
				{
					pos = list.searchString(search);
					System.out.println("elements found at " + pos );
					list.deleteAtPosition(pos);
					System.out.println("elements "+ search + " deleted");
					list.viewList();
					
				}
				else {
					System.out.println("elements not found");
					list.insertAtFirst(search);
					System.out.println("GIVEN ELEMENTS IS : " + search);
					list.viewList();
				}
				sc.close();	
			}
		}
		
}

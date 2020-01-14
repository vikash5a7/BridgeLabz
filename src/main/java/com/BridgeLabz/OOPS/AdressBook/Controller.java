package com.BridgeLabz.OOPS.AdressBook;

import com.bridgeLabz.util.Utility;

public class Controller {
	static ImplemantionClasss service = new ImplemantionClasss();
	public static void main(String[] args) {
		System.out.println("-----Welcome To Adress Book App---------");
		menu();
	}

	static void menu() {
		ImplemantionClasss service = new ImplemantionClasss();
		System.out.println("Enter your choice");
		System.out.println("1. Add\n2. Search\n3. Remove\n4. Sort\n5. update\n6. exit");
		String choice = Utility.inputNames();
		switch (choice) {
		case "1":
			service.addAddressBook();
			menu();
			break;
		case "2":
			serachMenu();
			break;
		case "3":
			System.out.println("enter first name");
			service.remove("FirstName", Utility.inputNames());
			menu();
			break;
		case "4":
			System.out.println("sorted based on the first name");
			service.sort("FirstName");
			menu();
			break;
		case "5":
			updateMenu();
			break;
		case "6":
			Utility.quit();
			break;

		default:
			System.out.println("Please enter valid Number b/w 1-5 ");
			menu();
			break;
		}

	}

	private static void updateMenu() {
		System.out.println("Enter your phone number");
		String name = Utility.inputNames();
		choiceUpdate(name);
		
	}

	private static void choiceUpdate(String name) {
		System.out.println("what you want to update?");
		System.out.println("1.Name\n2. phone \n3. adddress");
		String choice = Utility.inputNames();
		
	}

	private static void serachMenu() {
		System.out.println("Enter your choice: ");
		System.out.println("search By\n1. Name\n2. Number\n3. zipCode");
		String choice = Utility.inputNames();
		searchChoice(choice);

	}

	private static void searchChoice(String choice) {
		switch (choice) {
		case "1":
			System.out.println("Enter First name: ");
			service.search("FirstName",Utility.inputNames());
			menu();
			break;
		case "2":
			System.out.println("Enter phone Number: ");
			service.search("PhoneNumber",Utility.inputNames());
			menu();
			break;
		case "3":
			System.out.println("Enter your zip code ");
			service.search("Zip",Utility.inputNumber());

		default:
			System.out.println("choose valide input");
			menu();
			break;
		}
		
	}

}

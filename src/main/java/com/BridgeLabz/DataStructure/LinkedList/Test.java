package com.BridgeLabz.DataStructure.LinkedList;

import com.bridgeLabz.util.Utility;

public class Test {
	public static void main(String[] args) {
		LinkedList12 list = new LinkedList12();
		boolean flag= true;
		while (flag) {
			System.out.println("1. ADD ITEM AT START:\n2. ADD ITEM AT POSITION: \n3. ADD ITEM AT LAST POSITION"
					+ "\n4. DELETE FIRST ITEM FROM THE LIST \n5. DELETE ITEM AT LAST POSITOIN \n"
					+ "6. DELETE ITEM FROM THE LIST AT GIVEN POSTION:\n7. VIEW LIST "
					+ "\n8. list is empty or not \n9. size of list \n10. exit ");
			System.out.println("");
			System.out.println("ENTER YOUR CHOICE");
			int choice = Utility.inputNumber();
			String val;
			int position;
			System.out.println();
			switch (choice) {
			case 1:
				System.out.println("enter your value: ");
				list.insertAtFirst("vikash");
				break;

			case 2:
				System.out.println("enter postion");
				position = Utility.inputNumber();
				System.out.println("enter your value");
				val = Utility.inputName();
				list.insertAtPos(val, position);
				break;
			case 3:
				System.out.println("enter your value: ");
				val =Utility.inputName();
				list.insertAtLast(val);
				break;
			case 4:
				list.deleteAtFirst();
				break;
			case 5:
				list.deleteAtLast();
				break;
			case 6:
				System.out.println("enter postion");
				position = Utility.inputNumber();
				list.deleteAtPosition(position);
				break;
			case 7:
				list.viewList();
				break;
			case 8:
				System.out.println(list.searchString("v"));
				break;
			case 9:
				System.out.println(list.getListSize());
				break;
			case 10 :
				flag = false;
				break;
			default:
				System.out.println("invalide choice");
			}

		}

	}
}

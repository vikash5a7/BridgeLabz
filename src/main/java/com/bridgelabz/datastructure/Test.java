package com.bridgelabz.datastructure;

import com.bridgelabz.util.Utility;

public class Test {
	public static void main(String[] args) {
		LinkedList12 list = new LinkedList12();
		boolean flag= true;
		while (flag) {
			System.out.println("1. ADD ITEM AT START:\n2. ADD ITEM AT POSITION: \n3. ADD ITEM AT LAST POSITION"
					+ "\n4. DELETE FIRST ITEM FROM THE LIST \n5. DELETE ITEM AT LAST POSITOIN \n"
					+ "6. DELETE ITEM FROM THE LIST AT GIVEN POSTION:\n7. VIEW LIST \n"
					+ "8. exit ");
			System.out.println("");
			System.out.println("ENTER YOUR CHOICE");
			int choice = Utility.inputNumber();
			int position, val;
			switch (choice) {
			case 1:
				System.out.println("enter your value: ");
				val = Utility.inputNumber();
				list.insertAtFirst(val);
				break;

			case 2:
				System.out.println("enter your value: ");
				val = Utility.inputNumber();
				list.insertAtLast(val);
				break;
			case 3:
				System.out.println("enter postion");
				position = Utility.inputNumber();
				System.out.println("enter your value");
				val = Utility.inputNumber();
				list.insertAtPos(position, val);
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
			case 8 :
				flag = false;
				break;
			default:
				System.out.println("invalide choice");
			}

		}

	}
}

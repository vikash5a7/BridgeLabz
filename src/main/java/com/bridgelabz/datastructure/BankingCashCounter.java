/********************************************************************************************
 * Purpose : Banking problem  
 * @author :vikash kumar
 * @version:1.0
 * @date   :04/01/2020
 * @Filename:TwoDarray.java
 ********************************************************************************************/

package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.queue.UtilityForQueue;
import com.bridgelabz.util.Utility;

public class BankingCashCounter {
	static int amout = 100000;

	public static void main(String[] args) {
		System.out.println("Enter how many person: ");

		int person = Utility.inputNumber();
		UtilityForQueue q = new UtilityForQueue(person);
		for (int i = 0; i < person; i++) {
			q.enqueue(i);
		}
		while (person != 0) {
			int choice;
			int personNumber = q.peek();
			System.out.println("enter your choice Quequ at postion: " + personNumber);

			System.out.println("1. WITHDRAW 2. DEPOSIT: ");
			choice = Utility.inputNumber();
			switch (choice) {
			case 1:
				System.out.println("enter how much amount do you want to Withdraw : ");
				int withdraaw = Utility.inputNumber();
				withdraw(withdraaw);
				q.dequeue();
				System.out.println("Have a nice day! thanks... You can go \n \n");
				--person;
				System.out.print("Reamining person: ");
				q.show();
				System.out.println("\n");
				break;
			case 2:
				System.out.println("enter how much amount do you want to deposit: ");
				int depostMoney = Utility.inputNumber();
				deposite(depostMoney);
				q.dequeue();
				System.out.println("Have a nice day! thanks... You can go \n \n");
				--person;
				System.out.print("Reamining person: ");
				q.show();
				System.out.println("\n");
				break;

			default:
				System.out.println("Please enter valid choice");
				break;
			}

		}

	}

	private static void withdraw(int withdraaw) {

		if (withdraaw > amout) {
			System.out.println("Insufficient balance Try for minimum");
		} else {
			amout = amout - withdraaw;
			System.out.println(" SucessFully withdraw amount: ");
			System.out.println("Here is your amout: " + withdraaw);
			System.out.println("current Balance is: " + amout);
		}

	}

	public static void deposite(int amoutForDeposit) {
		amout = amout + amoutForDeposit;
		System.out.println(" SucessFully Deposit amount: " + amoutForDeposit);
		System.out.println("current Balance is: " + amout);
	}

}

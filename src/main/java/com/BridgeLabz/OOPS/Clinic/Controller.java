/**
 * 
 */
package com.BridgeLabz.OOPS.Clinic;

import com.bridgeLabz.util.Utility;

/**
 * @author mobicomp
 *
 */
public class Controller {
	static ServicesImpl service = new ServicesImpl();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("-----Welcome to Clinic------------");
		menu();
	}
	
		private static void menu() {
			System.out.println("Enter your choice: ");
			System.out.println("1. Doctor \n 2. Patient\n 3. Take appoiment\n 4. exit ");
			int choice = Utility.inputNumber();
			switch (choice) {
			case 1:
				System.out.println("Enter your choice: ");
				patientMenu();
				break;
			case 2:
				System.out.println("Enter your Choice: ");
				doctorMenu();
				break;
			case 3:
				Utility.quit();
				break;

			default:
				System.out.println("Enter valid number Between 1-3:");
				menu();
				break;
			}
		
	}

		private static void doctorMenu() {
			
				System.out.println("Enter your choice: ");
				System.out.println("1. Doctor \n 2. Patient 3. exit ");
				int choice = Utility.inputNumber();
				switch (choice) {
				case 1:
					System.out.println("Enter your choice: ");
					patientMenu();
					break;
				case 2:
					System.out.println("Enter your Choice: ");
					doctorMenu();
					break;
				case 3:
					Utility.quit();
					break;

				default:
					System.out.println("Enter valid number Between 1-3:");
					menu();
					break;
				}
			
		}

		private static void patientMenu() {
			// TODO Auto-generated method stub
			
		}
}
	

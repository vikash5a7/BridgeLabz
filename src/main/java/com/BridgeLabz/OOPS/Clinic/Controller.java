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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ServicesImpl service = new ServicesImpl();
		System.out.println("-----Welcome to Clinic------------");
		System.out.println("Press 1.Doctor 2. Patients 3. Exit ");
		int choice = Utility.inputNumber();
		switch (choice) {
		case 1:
			System.out.println("Doctor information adding: ");
			service.addDoctor();
			break;
		case 2:
			ServicesImpl.addPatient();
			break;
		case 3:

			break;
		case 4:

			break;

		default:
			break;
		}

	}

	

}

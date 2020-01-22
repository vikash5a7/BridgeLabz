/**
 * purpose : clinic managements system
 * @author vikash kumar
 * @date 13-1-2020
 * @version 1.1
 * 
 */
package com.bridgelabz.oops.clinic;

import com.bridgelabz.util.Utility;

/**
 * @author vikash kumar
 *
 */
public class Controller {
	static ServicesImpl service = new ServicesImpl();

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("-----Welcome to Clinic------------");

		try {
			mainController();
		} catch (Exception e) {
			System.out.println("Enter valid Input please");
			mainController();
		}
	}

	static void mainController() {
		System.out.println("Enter your choice: ");
		System.out.println("1. Doctor \n2. Patient\n3. Take appoiment\n4. exit ");
		int choice = Utility.inputNumber();
		switch (choice) {
		case 1:
			System.out.println("Enter your choice: ");
			doctorMenu();
			break;
		case 2:
			patientMenu();
			break;
		case 3:
			System.out.println("Please Seach Doctor");
			searchDoctor();
			break;

		case 4:
			Utility.quit();
			break;

		default:
			System.out.println("Enter valid number Between 1-3:");
			mainController();
			break;
		}

	}

	/**
	 * Doctor menu
	 * 
	 */
	private static void doctorMenu() {

		System.out.println("1. Add Doctor \n2. Search Doctor\n3. Take appoiment\n4. exit ");
		int choice = Utility.inputNumber();
		switch (choice) {
		case 1:
			service.addDoctor();
			mainController();
			break;
		case 2:
			searchDoctor();
			mainController();
			break;
		case 3:
			System.out.println("Please Seach Doctor");
			searchDoctor();
			mainController();
			break;
		case 4:
			Utility.quit();
			break;

		default:
			System.out.println("Enter valid number Between 1-3:");
			mainController();
			break;
		}

	}

	// patient working
	private static void patientInput() {
		System.out.println("Search patient by:");
		System.out.println("1. Name");
		System.out.println("2. ID");
		System.out.println("3. Mobile Number");
		String choice = Utility.inputString();
		patientChoice(choice);

	}

	// patient choice
	private static void patientChoice(String choice) {
		switch (choice) {
		case "1":
			Utility.inputString();
			System.out.print("Enter name:");
			service.readPatientData("Name", Utility.inputString());
			break;
		case "2":
			System.out.print("Enter ID:");
			service.readPatientData("Id", Utility.inputString());
			break;
		case "3":
			System.out.print("Enter mobile number:");
			service.readPatientData("Mobile", Utility.inputString());
			break;
		default:
			System.out.println("Please select valid option");
			patientChoice(choice);
			break;
		}
	}

	// searching doctor based on their name, id and specialization
	public static void searchDoctor() {
		System.out.println("Search doctor by:");
		System.out.println("1. Name");
		System.out.println("2. ID");
		System.out.println("3. Specialization");
		System.out.println("4. Availability");
		String choice = Utility.inputString();
		doctorSearchBy(choice);

	}
	// searching based on their choice

	public static void doctorSearchBy(String choice) {
		switch (choice) {
		case "1":
			System.out.print("Enter name:");
			service.readDoctorData("Name", Utility.inputString(), choice);
			break;
		case "2":
			System.out.print("Enter ID:");
			service.readDoctorData("Id", Utility.inputString(), choice);
			break;
		case "3":
			System.out.print("Enter speacialization:");
			service.readDoctorData("Specialization", Utility.inputString(), choice);
			break;
		case "4":
			System.out.print("Enter availability::");
			service.readDoctorData("Availability", Utility.inputString(), choice);
			break;
		default:
			System.out.println("select valid option\n");
			doctorSearchBy(choice);
		}
	}

	// patient working functionality
	private static void patientMenu() {

		System.out.println("1. Add Patient \n2. Search Doctor\n3. Take appoiment\n4. Search Patient\n5. exit ");
		int choice = Utility.inputNumber();
		switch (choice) {
		case 1:
			System.out.println("enter Doctor ID or Name");
			String doctorId = Utility.inputNames();
			service.addPatients("Doctor Id", doctorId);
			mainController();
			break;
		case 2:
			System.out.println("Enter your Choice: ");
			searchDoctor();
			mainController();
			break;
		case 3:
			System.out.println("Enter your Choice: ");
			searchDoctor();
			mainController();
			break;
		case 4:
			System.out.println("Enter your choice: ");
			patientInput();
			mainController();
			break;
		case 5:
			Utility.quit();
			break;
		default:
			System.out.println("Enter valid number Between 1-3:");
			mainController();
			break;
		}

	}

}

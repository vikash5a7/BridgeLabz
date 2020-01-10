package com.BridgeLabz.OOPS.Clinic;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgeLabz.util.Utility;

public class ServicesImpl {
	private static String PATH_DOCTOR = "/home/mobicomp/eclipse-workspace/BridgeLabz/src/main/java/com/BridgeLabz/OOPS/Clinic/Repostary/doctor.json";

	@SuppressWarnings("unchecked")
	public void addDoctor() {
		Doctor doctor = new Doctor();
		
		System.out.println("Enter Id of Doctor ");
		int doctorId = Utility.inputNumber();
		doctor.setId(doctorId);

		System.out.println("enter doctor name: ");
		String doctorName = Utility.inputNames();
		doctor.setName(doctorName);

		System.out.println("Enter doctor Specilization");
		String doctorSpecilization = Utility.inputNames();
		doctor.setSpecilization(doctorSpecilization);

		System.out.println("Enter Availability ");
		String availability = Utility.inputNames();
		doctor.setAvailability(availability);
		
		JSONObject ob = new JSONObject();
		
		ob.put("name", doctor.getName());
		ob.put("id", doctor.getId());
		ob.put("Specilization", doctor.getSpecilization());
		ob.put("Availability", doctor.getAvailability());
		
		JSONArray doctorList = new JSONArray();
		doctorList.add(ob);
		System.out.println(doctorList.toJSONString());
		UtilityClinic.writeOnFile("PATH_DOCTOR", doctorList);

	}

	@SuppressWarnings("unchecked")
	public static void addPatient() {
		Patient patient = new Patient();
		System.out.println("enter Patients name: ");
		String patientName = Utility.inputNames();
		patient.setName(patientName);

		System.out.println("Enter Id of Doctor ");
		int patientId = Utility.inputNumber();
		patient.setID(patientId);

		System.out.println("Enter your phone number ");
		double PphoneNumber = Utility.inputDouble();
		patient.setMobile(PphoneNumber);

		System.out.println("enter your age ");
		int patientAge = Utility.inputNumber();
		patient.setAge(patientAge);

		JSONObject ob = new JSONObject();
		ob.put("name", patient.getName());
		ob.put("id", patient.getID());
		ob.put("Mobile", patient.getMobile());
		ob.put("Age", patient.getAge());
		
		JSONArray patientList = new JSONArray();
		
		patientList.add(ob);
		
		System.out.println(patientList.toJSONString());
		UtilityClinic.writeOnFile("patient.json", patientList);

	}

}

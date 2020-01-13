package com.BridgeLabz.OOPS.Clinic;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgeLabz.util.Utility;

public class ServicesImpl {
	private static String PATH_DOCTOR = "/home/mobicomp/eclipse-workspace/BridgeLabz/src/main/java/com/BridgeLabz/OOPS/Clinic/Repostary/doctor.json";
	Doctor doctor = new Doctor();
	private String doctorPath = "doctor.json";
	private String patientPath = "patient.json";
	JSONArray jsonArray = new JSONArray();
	JSONObject jsonObject = new JSONObject();
	JSONObject ob = new JSONObject();

	@SuppressWarnings("unchecked")
	public void doctorDetails() {

		jsonArray = UtilityClinic.readData(doctorPath);

		Doctor doctorDetails = new Doctor();
		System.out.println("Enter Doctor Name");
		String doctorName = Utility.inputNames();
		if (Utility.isStringOnlyAlphabet(doctorName)) {
			doctorDetails.setName(doctorName);
		}

		System.out.println("Enter Doctor Specialization");
		String specialization = Utility.inputString();
		if (Utility.isStringOnlyAlphabet(specialization)) {
			doctorDetails.setSpecilization(specialization);
		}

		System.out.println("Enter Doctor Availability");
		String availability = Utility.inputString();
		if (Utility.isStringOnlyAlphabet(availability)) {
			doctorDetails.setAvailability(availability);
		}

		doctorDetails.setId(Utility.doctorId());
		doctorDetails.setNumberOfPatients(0);

		jsonObject.put("Id", doctorDetails.getId());
		jsonObject.put("Name", doctorDetails.getName());
		jsonObject.put("Specialization", doctorDetails.getSpecilization());
		jsonObject.put("Availability", doctorDetails.getAvailability());
		jsonObject.put("Patients", doctorDetails.getNumberOfPatients());

		jsonArray.add(jsonObject);

		System.out.println(jsonArray);
		UtilityClinic.writeData(doctorPath, jsonArray);

	}

	@SuppressWarnings("unchecked")
	public void patientDetailsNew(String id, String doctorId) {

		JSONArray jsonArray = UtilityClinic.readData(patientPath);

		Patient patientDetails = new Patient();
		System.out.println("Enter Patient Name");
		String patientName = Utility.inputString();
		if (Utility.isStringOnlyAlphabet(patientName)) {
			patientDetails.setName(patientName);
		}

		System.out.println("Enter Mobile Number");
		String mobile = Utility.inputString();
		if (Utility.mobileNumberValidator(mobile)) {
			System.out.println("Mobile :" + mobile);
			patientDetails.setMobile(Long.parseLong(mobile));
		}

		System.out.println("Enter Age");
		int age = Utility.inputInteger();
		patientDetails.setAge(age);

		patientDetails.setID(Utility.patientId());

		jsonObject.put("Id", patientDetails.getID());
		jsonObject.put("Name", patientDetails.getName());
		jsonObject.put("Mobile", patientDetails.getMobile());
		jsonObject.put("Age", patientDetails.getAge());
		jsonObject.put("Doctor Id", doctorId);

		jsonArray.add(jsonObject);
		// System.out.println(jsonArray);
		UtilityClinic.writeData(patientPath, jsonArray);
	}

}

package com.BridgeLabz.OOPS.Clinic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class UtilityClinic {
	static BufferedReader bufferedReader;

	public static void writeOnFile(String filename, JSONArray doctorList) {
		try (FileWriter file = new FileWriter(filename)) {
			file.write(doctorList.toJSONString());
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static JSONObject readDetails(String filename) {
		String string = UtilityClinic.readFromFile(filename);
		JSONParser parser = new JSONParser();
		JSONObject objectFile = null;
		try {
			objectFile = (JSONObject) parser.parse(string);
			return objectFile;
		} catch (Exception e) {
			System.out.println("Something Went Wrong! " + e.getMessage());
		}
		return null;

	}

	public static String readFromFile(String filename) {
		try {
			bufferedReader = new BufferedReader(new FileReader(filename));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		StringBuilder sb = new StringBuilder();
		try {

			String line;
			while ((line = bufferedReader.readLine()) != null)
				sb.append(line);
		} catch (IOException e) {
			System.out.println("Empty file " + e.getMessage());
		} finally {
			try {

				bufferedReader.close();
			} catch (IOException e) {
				System.out.println(e.getStackTrace());
			}
		}
		return sb.toString();
	}

	public static JSONArray fileRead(String fileName) {

		JSONParser parser = new JSONParser();

		try (FileReader reader = new FileReader(fileName)) {

			JSONArray jsonArray = new JSONArray();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return jsonArray;

	}

	public static void writeOnFile(String filename, JSONObject ob) {

	}
}

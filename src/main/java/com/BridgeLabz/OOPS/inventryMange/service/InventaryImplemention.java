package com.BridgeLabz.OOPS.inventryMange.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class InventaryImplemention {
	static String filename = "newInventary.json";

	public static void insertIntoFile(String str) {
		try (FileWriter file = new FileWriter(filename)) {

			file.write(str);
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String readingFromFile() {
		String jsonData = " ";
		JSONParser parser = new JSONParser();
		try (FileReader reader = new FileReader(filename)) {

			Object ob = parser.parse(reader);
			Object jsonObject = ob;
			jsonData = jsonData+ jsonObject.toString();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return jsonData;

	}

}

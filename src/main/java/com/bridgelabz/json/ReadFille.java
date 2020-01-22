package com.bridgelabz.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadFille {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		JSONParser parser = new JSONParser();
		try {

			Object ob = parser.parse(new FileReader("MyJSON.json"));
			JSONObject jsonObject = (JSONObject) ob;
			String name = (String) jsonObject.get("Name");
			System.out.println("Name is: " + name);

			String location = (String) jsonObject.get("Location");
			System.out.println("you are from " + location);
			// loop array
			JSONArray courseArray = (JSONArray) jsonObject.get("Course");
			System.out.println("you have study these subject: ");
			courseArray.forEach(System.out::println);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

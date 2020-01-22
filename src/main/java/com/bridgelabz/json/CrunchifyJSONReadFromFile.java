package com.bridgelabz.json;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



public class CrunchifyJSONReadFromFile {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		JSONParser parser = new JSONParser();

		try {

			Object obj = parser.parse(new FileReader("vikash.json"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray companyList = (JSONArray) jsonObject.get("Rice");
			Iterator<String> iterator = companyList.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

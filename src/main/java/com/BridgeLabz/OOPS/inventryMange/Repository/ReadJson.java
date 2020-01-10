package com.BridgeLabz.OOPS.inventryMange.Repository;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class ReadJson {
	public static void main(String[] args) {
		System.out.println("==========================================");
		JSONParser jsonParser = new JSONParser();
		try(FileReader file = new FileReader("StudentDeatil.json")) {
			Object obj = jsonParser.parse(file);
			JSONObject jsonOb = (JSONObject) obj;
			System.out.println("hi...........");
			JSONObject StudenDetails = (JSONObject) jsonOb.get("StudentDetails");
			System.out.println(StudenDetails.toJSONString());
			String studenName = (String) StudenDetails.get("Name");
			System.out.println("Student names : " + studenName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		
		}
	
	}

}


package com.BridgeLabz.OOPS;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgeLabz.util.Utility;


public class Inventary {
	
	static String fileName;
	static boolean status= true;
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		System.out.println("Enter your name please: ");
		String name1 = Utility.inputName();
		fileName = name1 + ".json";
		
		
		JSONArray inventaryList = new JSONArray();
		while(status)
		{
			
			System.out.println("What you want to inssert: \n Press-  1.Rice, 2.Pulses 3. Wheats 4.exit");
			int choice = Utility.inputNumber();
			String name;
			int weight;
			switch (choice) {
			case 1:
				JSONObject rice = new JSONObject();
				name = Utility.inputName();
				System.out.println("Your Rice name: ");
				name = Utility.inputName();
				rice.put("Name", name);
				System.out.println("Enter how much you want: ");
				weight = Utility.inputNumber();
				rice.put("Weight", weight);
				rice.put("Rate", 30);
				JSONObject riceObj = new JSONObject();
				riceObj.put("Rice", rice);
				inventaryList.add(riceObj);
				System.out.println(inventaryList);
				System.out.println("Total Price = " + weight * 30);
				System.out.println("Your file name is : " + fileName);
				break;
			case 2:
				JSONObject pulsese = new JSONObject();
				name = Utility.inputName();
				System.out.println("Your pulsese name: ");
				name = Utility.inputName();
				pulsese.put("Name ", name);
				System.out.println("Enter how much you want: ");
				weight = Utility.inputNumber();
				pulsese.put("Weight", weight);
				pulsese.put("Rate", 40);
				JSONObject pulsesObj = new JSONObject();
				pulsesObj.put("Pulses", pulsese);
				inventaryList.add(pulsesObj);
				System.out.println(inventaryList);
				System.out.println("Total Price = " + weight * 40);
				System.out.println("Your file name is : " + fileName);
				break;
			case 3:
				JSONObject Wheats = new JSONObject();
				name = Utility.inputName();
				System.out.println("Your Wheats name: ");
				name = Utility.inputName();
				Wheats.put("Name ", name);
				System.out.println("Enter how much you want: ");
				weight = Utility.inputNumber();
				Wheats.put("Weight", weight);
				Wheats.put("Rate", 50);
				JSONObject wheatsObj = new JSONObject();
				wheatsObj.put("Wheats", Wheats);
				inventaryList.add(wheatsObj);
				System.out.println(inventaryList);
				System.out.println("Total Price = " + weight * 50);
				System.out.println("Your file name is : " + fileName);
				break;
			case 4:
				System.out.println("succfully Exit");
				status=false;
				break;
			default:
				System.out.println("enter correc choice: ");
				break;
			}
		}
		try (FileWriter file = new FileWriter(fileName)) {
			file.write(inventaryList.toJSONString());
			file.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

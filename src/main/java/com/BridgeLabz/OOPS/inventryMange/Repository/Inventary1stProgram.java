package com.BridgeLabz.OOPS.inventryMange.Repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.BiConsumer;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Inventary1stProgram {
	private static void parseInventory(JSONObject inv) {
		// Get employee website name
		// Get employee object within list
		JSONObject employeeObject = (JSONObject) inv.get("Inventory");

		String name = (String) employeeObject.get("Name");
		System.out.println("Name  : " + name);

		String Weight = String.valueOf(employeeObject.get("Weight"));
		// int weight = Integer.parseInt(lastName);
		System.out.println("Weight: " + Weight);

		String Price = String.valueOf(employeeObject.get("PricePerKg"));
		// int Price = Integer.parseInt(firstName);
		System.out.println("Price : " + Price);
		System.out.println();
	}

	@SuppressWarnings("unchecked")
	public static void readFile() {
	
		try (FileReader reader = new FileReader(
				"/home/user/Desktop/bridgeLab/src/main/java/com/BridgeLabz/OOPS/inventryMange/service/inventary.json")) {
			
			JSONParser parser = new JSONParser();
			Object perserOb = parser.parse(reader);
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package com.BridgeLabz.OOPS.inventryMange.Repository;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class Inventary1stProgram {
	
	
	public static void display(JSONObject weatDetails)
	{
		System.out.println(weatDetails.toJSONString());
		String weatsName = (String) weatDetails.get("Name");
		System.out.println("Name Of Inventary: " + weatsName);
		Double pricePerKg = (Double) weatDetails.get("PricePerKg");
		System.out.println("Price per kilogram : " + pricePerKg);
		Double weight = (Double) weatDetails.get("Weight");
		System.out.println("Total Weight is " + weight);
		System.out.println("Total cost:- " + pricePerKg * weight);
	}

	public static void readFile() {
		System.out.println("==========================================");
		JSONParser jsonParser = new JSONParser();
		try (FileReader file = new FileReader("Inventary.json")) {
			Object obj = jsonParser.parse(file);
			JSONObject jsonOb = (JSONObject) obj;
			JSONObject inventaryDetails = (JSONObject) jsonOb.get("Inventary");

			// getting the objects of the Wheat
			System.out.println("------Information about wheat from inventary JSSON-----");
			JSONObject weatDetails = (JSONObject) inventaryDetails.get("wheat");
			display(weatDetails);

			// getting the objects of the pulse
			System.out.println("\n------Information about Pulse from inventary JSSON-----");
			JSONObject pulseDetails1 = (JSONObject) inventaryDetails.get("pulses");
			display(pulseDetails1);

			// getting the objects of the rice
			System.out.println("\n------Information about Pulse from inventary JSSON-----");
			JSONObject riceDetails = (JSONObject) inventaryDetails.get("Rice");
			display(riceDetails);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println();
		}
	}

}

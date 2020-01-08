package com.BridgeLabz.OOPS.inventryMange.Repository;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Inventary1stProgram {

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
			System.out.println(weatDetails.toJSONString());
			String weatsName = (String) weatDetails.get("Name");
			System.out.println("Wheat Name: " + weatsName);
			Double pricePerKg = (Double) weatDetails.get("PricePerKg");
			System.out.println("Price of Wheat: " + pricePerKg);
			Double weight = (Double) weatDetails.get("Weight");
			System.out.println("Total Weight of Wheat " + weight);
			System.out.println("Total cost of Weat-> " + pricePerKg * weight);

			// getting the objects of the pulse
			System.out.println("\n------Information about Pulse from inventary JSSON-----");
			JSONObject pulseDetails1 = (JSONObject) inventaryDetails.get("pulses");
			System.out.println(pulseDetails1.toJSONString());
			String pulseName = (String) pulseDetails1.get("Name");
			System.out.println("Wheat Name: " + pulseName);
			Double pulsePrice = (Double) pulseDetails1.get("PricePerKg");
			System.out.println("Price of Wheat: " + pulsePrice);
			Double pulseWeight = (Double) pulseDetails1.get("Weight");
			System.out.println("Total Weight of Wheat " + pulseWeight);
			System.out.println("Total cost of Weat-> " + pulsePrice * pulseWeight);

			// getting the objects of the rice
			System.out.println("\n------Information about Pulse from inventary JSSON-----");
			JSONObject riceDetails = (JSONObject) inventaryDetails.get("Rice");
			System.out.println(riceDetails.toJSONString());
			String riceName = (String) riceDetails.get("Name");
			System.out.println("Wheat Name: " + riceName);
			Double ricePrice = (Double) riceDetails.get("PricePerKg");
			System.out.println("Price of Wheat: " + ricePrice);
			Double riceweight = (Double) riceDetails.get("Weight");
			System.out.println("Total Weight of Wheat " + riceweight);
			System.out.println("Total cost of Weat-> " + ricePrice * riceweight);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println();
		}

	}

}

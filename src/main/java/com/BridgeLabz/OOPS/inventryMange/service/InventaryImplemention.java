package com.BridgeLabz.OOPS.inventryMange.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class InventaryImplemention {

	public static void insertIntoFile(String str) {
		
		try (FileWriter file = new FileWriter("newInventary.json")) {
			JSONObject str1=readingFromFile();
			str = str +str1.toJSONString();
			file.write(str);
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static JSONObject readingFromFile() {
		JSONObject jsonData = null;
		JSONParser parser = new JSONParser();
		try(FileReader reader=new FileReader("newInventary.json")) {

			Object ob = parser.parse(reader);
			JSONObject jsonObject = (JSONObject) ob;
			jsonData=jsonObject;

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

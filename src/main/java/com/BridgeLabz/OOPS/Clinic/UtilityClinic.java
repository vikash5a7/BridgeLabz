package com.BridgeLabz.OOPS.Clinic;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;

public class UtilityClinic {
	
	public static void writeOnFile(String filename, JSONArray obj) {
		try (FileWriter file = new FileWriter(filename)) {
			file.write(obj.toJSONString());
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

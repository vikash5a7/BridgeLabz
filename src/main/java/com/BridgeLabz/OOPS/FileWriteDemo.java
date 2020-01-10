package com.BridgeLabz.OOPS;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

public class FileWriteDemo {
	public static void main(String[] args) {

		JSONParser parser = new JSONParser();
		try {
			JSONArray a = (JSONArray) parser.parse(new FileReader("v.json"));
			a.forEach(System.out::println);

		} catch (Exception e) {

		}

	}
}
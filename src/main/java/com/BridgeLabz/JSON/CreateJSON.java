package com.BridgeLabz.JSON;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgeLabz.util.Utility;

public class CreateJSON {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		JSONObject obj = new JSONObject();
		System.out.println("enter your name: ");
		String name = Utility.inputName();
		obj.put("Name", name);
		System.out.println("enter your name: ");
		String location = Utility.inputName();
		obj.put("Location", location);
		JSONArray list = new JSONArray();
		list.add("java");
		list.add("JSP");
		list.add("Servlet");
		obj.put("Course", list);
		try (FileWriter file = new FileWriter("new.json")) {
			file.write(obj.toJSONString());
			file.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(obj);
	}

}

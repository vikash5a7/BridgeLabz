package com.BridgeLabz.JSON;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class CreateJSON {
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		JSONObject obj = new JSONObject();
		obj.put("Name", "vikash");
		obj.put("Location", "India");
		JSONArray list = new JSONArray();
		list.add("java");
		list.add("JSP");
		list.add("Servlet");
		obj.put("Course", list);
		try(FileWriter file = new FileWriter("MyJSON.json"))
		{
			file.write(obj.toJSONString());
			file.flush();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println(obj);
	}

}

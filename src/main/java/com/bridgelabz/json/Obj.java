package com.bridgelabz.json;

import org.json.simple.JSONObject;

public class Obj {
@SuppressWarnings("unchecked")
public static void main(String[] args) {
	JSONObject ob = new JSONObject();
	ob.put("name", "vikash");
	ob.put("class", 4);
	System.out.println(ob);
}
}

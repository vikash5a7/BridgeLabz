package com.BridgeLabz.JSON;

import org.json.simple.JSONObject;

public class Obj {
public static void main(String[] args) {
	JSONObject ob = new JSONObject();
	ob.put("name", "vikash");
	ob.put("class", 4);
	System.out.println(ob);
}
}

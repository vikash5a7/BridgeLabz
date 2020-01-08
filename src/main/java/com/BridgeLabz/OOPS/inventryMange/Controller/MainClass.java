package com.BridgeLabz.OOPS.inventryMange.Controller;

import com.BridgeLabz.OOPS.inventryMange.Model.InventaryClass;
import com.BridgeLabz.OOPS.inventryMange.Model.JsonUtil;

public class MainClass {
	public static void main(String[] args) {
		InventaryClass invenclass= new InventaryClass();
		invenclass.setNameOfInventary("Rice");
		invenclass.setCost(34.0);
		invenclass.setWeaight(48);
		invenclass.setInventaryName("Normal");
		String jsonData = JsonUtil.convertJavaToJson(invenclass);
		System.out.println(jsonData);
		
		
	}
}

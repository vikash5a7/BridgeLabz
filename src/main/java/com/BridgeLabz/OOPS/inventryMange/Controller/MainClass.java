package com.BridgeLabz.OOPS.inventryMange.Controller;

import com.BridgeLabz.OOPS.inventryMange.Model.InventaryClass;
import com.BridgeLabz.OOPS.inventryMange.Model.JsonUtil;
import com.BridgeLabz.OOPS.inventryMange.service.InventaryImplemention;

public class MainClass {
	public static void main(String[] args) {
		InventaryClass invenclass= new InventaryClass();
		invenclass.setNameOfInventary("Rice");
		invenclass.setCost(34.0);
		invenclass.setWeaight(48);
		invenclass.setInventaryName("Normal");
		InventaryClass invenclass2= new InventaryClass();
		invenclass2.setCost(34);
		invenclass2.setWeaight(89);
		invenclass2.setNameOfInventary("Pulses");
		invenclass2.setInventaryName("Normal");
		String jsonData = JsonUtil.convertJavaToJson(invenclass);
		
		String jsonData2 = JsonUtil.convertJavaToJson(invenclass2);
		System.out.println(jsonData);
		InventaryImplemention.insertIntoFile(jsonData);
		InventaryImplemention.insertIntoFile(jsonData2);
		System.out.println(InventaryImplemention.readingFromFile());
		
	}
}

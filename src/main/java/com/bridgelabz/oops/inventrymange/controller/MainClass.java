package com.bridgelabz.oops.inventrymange.controller;

import com.bridgelabz.oops.inventryMange.service.InventaryImplemention;
import com.bridgelabz.oops.inventrymange.model.InventaryClass;

public class MainClass {
	static String fileContent= "";
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
//		String jsonData = JsonUtil.convertJavaToJson(invenclass);
		fileContent = InventaryImplemention.readingFromFile();
		
		System.out.println(fileContent);
//		String jsonData2 = JsonUtil.convertJavaToJson(invenclass2);
//		fileContent = jsonData2 + InventaryImplemention.readingFromFile();
		InventaryImplemention.insertIntoFile(fileContent);
		System.out.println(fileContent);
//		System.out.println(jsonData);
		
		
	}
}

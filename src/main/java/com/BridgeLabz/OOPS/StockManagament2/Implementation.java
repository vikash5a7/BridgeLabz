package com.BridgeLabz.OOPS.StockManagament2;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.BridgeLabz.JSON.Obj;
import com.BridgeLabz.OOPS.AdressBook.UtilForAddressBook;
import com.BridgeLabz.OOPS.Clinic.UtilityClinic;
import com.bridgeLabz.util.Utility;

public class Implementation {
	JSONObject obJson = new JSONObject();
	JSONArray jsonArray = new JSONArray();
	Company company = new Company();
	static String Stock_File = "CompanyList.json";
	File FileReader = new File(Stock_File);

	@SuppressWarnings("unchecked")
	public void stockAccount(File file) {

		System.out.println("Enter Company Symbol: ");
		JSONObject fileJson = (JSONObject) UtilityForStock.readData(file);
		JSONObject json = (JSONObject) fileJson.get("STOCK MARKET");

		String companySymbol = Utility.inputNames();
		company.setCompanySymbol(companySymbol);

		System.out.println("Enter Stock name ");
		String stockeNames = Utility.inputNames();
		company.setStockNames(stockeNames);

		System.out.println("Enter Number of Stock ");
		int numberOfShare = Utility.inputNumber();
		company.setNumberOfShare(numberOfShare);

		System.out.println("Enter share Price ");
		double sharePrice = Utility.inputDouble();
		company.setSharePrice(sharePrice);

		LocalDateTime current = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String dateTime = current.format(format);
		company.setDate(dateTime);

		obJson.put("Company Name", company.getStockNames());
		obJson.put("Number Of Share", company.getNumberOfShare());
		obJson.put("Share Price", company.getSharePrice());
		obJson.put("Date", company.getDate());
		obJson.put("Company Symbol", company.getCompanySymbol());
		jsonArray.add(obJson);

		json.put(company.getCompanySymbol(), jsonArray);

		UtilityForStock.writeData(file, fileJson);
	}

	@SuppressWarnings("unchecked")
	public void removeCompanyDetails(String symbol) {
		JSONObject jsonObj = UtilityForStock.readData(FileReader);
		JSONObject jsonObj1 = (JSONObject) jsonObj.get("STOCK MARKET");
		JSONObject jsonObj2 = new JSONObject();

		if (jsonObj1.containsKey(symbol)) {

			System.out.println(jsonObj1.get(symbol));
			jsonObj2.get(symbol);
			jsonObj1.remove(symbol);
			jsonObj2.put("STOCK MARKET", jsonObj1);
			UtilityForStock.writeData(FileReader, jsonObj2);
			System.out.println("Success.....");
		} else {
			System.out.println("not found");
		}
	}

	public void displayData() {
		System.out.println("--------Details----------");
		System.out.println("Name \t Share \t Price \t Value");
		JSONArray readData = UtilForAddressBook.readData(Stock_File);
		double value = 0.0;
		@SuppressWarnings("rawtypes")
		Iterator iterator = readData.iterator();
		JSONObject ob;
		while (iterator.hasNext()) {
			if ((ob = (JSONObject) iterator.next()) != null) {
				System.out.println(ob.get("Stock Name") + " \t " + ob.get("Number Of Share") + " \t "
						+ ob.get("Share Price") + " \t " + ob.get("Value "));
				value = value + Double.valueOf(ob.get("Value ").toString());

			}
		}
		System.out.println("Total Price for the whole Stock-> " + value);
	}

	public void displayCompanyAccordingToSymbol(String symbol) {
		JSONObject jsonObject = UtilityForStock.readData(FileReader);

		JSONObject objectOfStock = (JSONObject) jsonObject.get("STOCK MARKET");
		if (objectOfStock.containsKey(symbol)) {
			JSONArray innerArray = (JSONArray) objectOfStock.get(symbol);
			JSONObject innerObject = (JSONObject) innerArray.get(0);
			
			
			System.out.println("*********************Company Details****************************");
			System.out.println("Company Name    : " + innerObject.get("Company Name"));
			System.out.println("Share Price     : " + innerObject.get("Share Price"));
			System.out.println("Number Of Share : " + innerObject.get("Number Of Share"));
			System.out.println("Company Symbol  : " + innerObject.get("Company Symbol"));
			System.out.println("Date            : " + innerObject.get("Date"));
		}else
		{
			System.out.println("Company Not Found with this SYMBOL -> " + symbol +" Try with another Symbol");
		}

	}
//		Set<?> key = objectOfStock.keySet();
//		Iterator<?> iterator = key.iterator();
//		while(iterator.hasNext())
//		{
//			
//		}
//		System.out.println(objectOfStock.toJSONString());
//		Object[] Keys = objectOfStock.keySet().toArray();
//		for (int i = 0; i < Keys.length; i++) {
//			if (Keys[i].equals(symbol)) {
//				System.out.println(Keys[i]);
//				Object object = objectOfStock.get(Keys[i]);
//
//				System.out.println(object);

//					System.out.println("Company Name    :" + object[1]);
//					System.out.println("Number Of Share :" + object.get("Number Of Share"));
//					System.out.println("Price           :" + object.get("Share Price"));
//					System.out.println("Company Symbol  :" + object.get("Company Symbol"));
//					System.out.println("Date            :" + object.get("Date"));
//					System.out.println();

// }

//		for (Object i : Keys)
//		{
//			if (i.equals(symbol)) {
//				System.out.println(i);
//				
//			}
//		}

	// }

	public void displayCompanyDetail() {
		JSONObject json = UtilityForStock.readData(FileReader);
		JSONObject Stock = (JSONObject) json.get("STOCK MARKET");
		@SuppressWarnings("unused")
		JSONArray arr = new JSONArray();

		Object[] Keys = Stock.keySet().toArray();
		for (Object i : Keys) {
			JSONArray a = (JSONArray) Stock.get(i);
			for (Object j : a) {
				JSONObject m = (JSONObject) j;
				System.out.println("Company Name    :" + m.get("Company Name"));
				System.out.println("Number Of Share :" + m.get("Number Of Share"));
				System.out.println("Price           :" + m.get("Share Price"));
				System.out.println("Company Symbol  :" + m.get("Company Symbol"));
				System.out.println("Date            :" + m.get("Date"));
				System.out.println();
			}
		}

	}

}

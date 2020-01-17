package com.BridgeLabz.OOPS.StockManagament2;

import java.io.File;

import com.bridgeLabz.util.Utility;

public class Stock {
	static Implementation stockImpl = new Implementation();
	static File file;
	static String FILE_PATH = "CompanyList.json";
	public static void main(String[] args) {
		Menu();
	
	}
	private static void Menu() {
		System.out.println("----------------Stock Managaments-------------");
		System.out.println("Enter Your Choice\n1. Add Company Details"
				+ " \n2. Remove Comapny Details ");
		String Choice = Utility.inputNames();
		switch (Choice) {
		case "1":
			file = new File(FILE_PATH);
			stockImpl.stockAccount(file);
			Menu();
			break;
		case "2":
			System.out.println("Enter Company symbol");
			String symbol = Utility.inputNames();
			stockImpl.removeCompanyDetails(symbol);
			Menu();
			
		default:
			break;
		}
		
	}

	
}


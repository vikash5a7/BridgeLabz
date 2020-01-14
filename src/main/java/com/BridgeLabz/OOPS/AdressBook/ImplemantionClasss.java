/**
 * 
 */
package com.BridgeLabz.OOPS.AdressBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.BridgeLabz.BasicProgram.practice.array;
import com.BridgeLabz.OOPS.Clinic.UtilityClinic;
import com.bridgeLabz.util.Utility;

/**
 * @author vikash kumar
 *
 */
public class ImplemantionClasss implements ImplemantionMethod {

	static String FilePath = "AdressBook.json";
	JSONObject jObject = new JSONObject();
	JSONArray jsonArray = new JSONArray();
	Controller controller = new Controller();

	@SuppressWarnings("unchecked")
	@Override
	public void addAddressBook() {
		Person p = new Person();
		jsonArray = UtilityClinic.readData(FilePath);
		System.out.println("Enter your First name");
		String firstName = Utility.inputNames();
		p.setFirstName(firstName);

		System.out.println("Enter your last name");
		String lastName = Utility.inputNames();
		p.setLastName(lastName);

		System.out.println("Enter your city name");
		String city = Utility.inputNames();
		p.setCity(city);

		System.out.println("Enter your state name");
		String state = Utility.inputNames();
		p.setState(state);

		System.out.println("Enter your address ");
		String address = Utility.inputNames();
		p.setAddress(address);

		System.out.println("Enter your Zip");
		int zip = Utility.inputInteger();
		p.setZip(zip);

		System.out.println("enter your Phone Number");
		String phonenumber = Utility.inputNames();
		p.setPhonenumber(phonenumber);

		jObject.put("FirstName", p.getFirstName());
		jObject.put("LastName", p.getLastName());
		jObject.put("City", p.getCity());
		jObject.put("State", p.getState());
		jObject.put("Address", p.getAddress());
		jObject.put("Zip", p.getZip());
		jObject.put("PhoneNumber", p.getPhonenumber());

		jsonArray.add(jObject);
		System.out.println(jsonArray);
		UtilForAddressBook.writeData(FilePath, jsonArray);

	}

	public void search(String key, String value) {
		jsonArray = UtilForAddressBook.readData(FilePath);
		@SuppressWarnings("rawtypes")
		Iterator iterator = jsonArray.iterator();
		JSONObject ob;
		while (iterator.hasNext()) {
			if ((ob = (JSONObject) iterator.next()).containsValue(value)) {
				System.out.println("----Information----");
				System.out.println("Phone Number-> " + ob.get("PhoneNumber"));
				System.out.println("Full name: " + ob.get("FirstName") + " " + ob.get("LastName"));
				System.out.println(
						"Full Adress- " + " " + ob.get("Address") + " " + ob.get("City") + " " + ob.get("State"));
				System.out.println("Zip code" + ob.get("Zip"));

			} else {
				System.out.println("No More For Search: ");
			}
		}
	}

	public void search(String key, int inputNumber) {
		jsonArray = UtilForAddressBook.readData(FilePath);
		@SuppressWarnings("rawtypes")
		Iterator iterator = jsonArray.iterator();
		JSONObject ob;
		while (iterator.hasNext()) {
			if ((ob = (JSONObject) iterator.next()).containsKey(key)) {
				System.out.println("----Information----");
				System.out.println("Phone Number-> " + ob.get("PhoneNumber"));
				System.out.println("Full name: " + ob.get("FirstName") + " " + ob.get("LastName"));
				System.out.println(
						"Full Adress- " + " " + ob.get("Address") + " " + ob.get("City") + " " + ob.get("State"));
				System.out.println("Zip code" + ob.get("Zip"));

			}
		}
	}

	@SuppressWarnings("unchecked")
	public void remove(String key, String value) {
		jsonArray = UtilForAddressBook.readData(FilePath);
		JSONArray updatedArray = new JSONArray();
		@SuppressWarnings("rawtypes")
		Iterator iterator = jsonArray.iterator();
		JSONObject ob;
		while (iterator.hasNext()) {
			if ((ob = (JSONObject) iterator.next()).containsValue(value)) {
				remove(key, value);
			}
			updatedArray.add(ob);
		}
		UtilForAddressBook.writeData(FilePath, updatedArray);
	}

	@SuppressWarnings("unchecked")
	public void sort(String value) {
		jsonArray = UtilForAddressBook.readData(FilePath);
		@SuppressWarnings("rawtypes")
		ArrayList ar= new ArrayList();
		Iterator iterator = jsonArray.iterator();
		JSONObject ob;
		while (iterator.hasNext()) {
			if ((ob = (JSONObject) iterator.next()).containsKey(value)) {
				ar.add(ob.get(value));
			}
		}
		Collections.sort(ar);
		System.out.println(ar);

	}

}

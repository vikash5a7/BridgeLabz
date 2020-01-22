/***********************************************
 * purpose : regular Program 
 *           
 * @author  vikash kumar
 * @version 1.0
 * @since   26/12/2019          
 ***********************************************/

package com.bridgelabz.algorithm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.util.Utility;

public class RegEx {
	private static String REGEX = "<<name>>";
	private static String REGEXFULLNAME = "<<full name>>";
	private static String REGEXPHONE = "xxxxxxxxxx";
	private static String REGEXBIRTH = "01/01/2016";

	private static String msg = "Hello <<name>>,\n" + " We have your full name as <<full name>> in our system. \n "
			+ "your contact number is 91-xxxxxxxxxx.\n" + " Please,let us know in case of any clarification \n "
			+ "Thank you BridgeLabz 01/01/2016. \n";

	public static void main(String[] args) {
		System.out.println(msg);
		
		// For name.......
		System.out.println("ente your name: ");
		String name = Utility.inputName();
		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(msg);
		msg = m.replaceAll(name);
	
		
		// for full name
		System.out.println("ENTER YOUR FULL NAME");
		String replaceFullName = Utility.inputName();
		p = Pattern.compile(REGEXFULLNAME);
		// get a matcher object
		m = p.matcher(msg);
		msg = m.replaceAll(replaceFullName);
		
		
		// for the phone number
		System.out.println("ENTER YOUR PHONE NUMBER");
		String phoneNumber = Utility.inputName();
		p = Pattern.compile(REGEXPHONE);
		m = p.matcher(msg);
		msg = m.replaceAll(phoneNumber);
		
		// for date birthday
		System.out.println("Enter your date of birthday");
		String datebirthday = Utility.inputName();
		p = Pattern.compile(REGEXBIRTH);
		// get a matcher object
		m = p.matcher(msg);
		msg = m.replaceAll(datebirthday);
		System.out.println(msg);
	}

}

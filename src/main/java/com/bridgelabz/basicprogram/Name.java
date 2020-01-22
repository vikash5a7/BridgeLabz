/******************************************************************************
	 *  Compilation:  javac -d bin Primeno.java
	 *  Execution:    java -cp bin com.bridgeLabz.util.Utility
	 *  
	 *  Purpose:  User Input and Replace String Template “Hello <<UserName>>, How are you?” 
	 *
	 *  @author  VIKASH KUMAR
	 *  @version 1.0
	 *  @since   18-12-2018
	 *
	 ******************************************************************************/

package com.bridgelabz.basicprogram;
import com.bridgelabz.util.Utility;
public class Name {
	static String s1 = "Hello ";
	static String intialName = "<<UserName>> ";
	static String s2 = " ,How are you?";
	static String s3;
	public static void main(String[] args) {

		System.out.println("Please enter name which you want to replaced:");
		String name = Utility.inputName();
		s3 = s1 + intialName + s2;
		System.out.println("present name :  " + s3);
	
			System.out.println(display(name));	
	}

	
	// here pasSing the name as parameter and later we we replace the words
	public static String display(String name) {
		if(name.length()>=3)
		{
			s3 = s1 + name + s2;
			return "Name after replaced: " + s3 ;
		
		}
		else
			
			return "ENTER MORE THAN THREE CHARACTER: ";
	}
}

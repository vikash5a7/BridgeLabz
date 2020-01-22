package com.bridgelabz.datastructure.orderList;

import java.io.BufferedReader;
import java.io.FileReader;

public class UtilityDs {


	static String[] stringArray;
     static int[] intArray;
	//read integer file
		public static int[] integerFileReader()
		{
			try
			{
				String intFile = new String();
				FileReader fr = new FileReader("/home/user/Desktop/number.txt");
				BufferedReader br = new BufferedReader(fr);
			    String s;

			    while((s = br.readLine()) != null) 
				{
			        intFile += s;
			    }

			    intFile = intFile.replaceAll("\\n",",");
			    intFile = intFile.trim();
			    stringArray = intFile.split(","); 
			    intArray = new int[stringArray.length];

			    for(int i=0; i <intArray.length;i++)
			    {
			        try
			        {
			            intArray[i]= Integer.parseInt(stringArray[i]);
			        }
			        catch(NumberFormatException e)
			        {
			            System.out.println(e);
			        }
			    }
			}
			catch(Exception obj)
			{
			    System.out.println("e");
			}
	        	return intArray;
	    }
		
	public static void main(String[] args) {
		
	}
}

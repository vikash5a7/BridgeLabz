package com.BridgeLabz.DataStructure.OrderList;

import java.io.BufferedReader;
import java.io.FileReader;

public class Utility {


	String[] stringArray;
    int[] intArray;
	//read integer file
		public int[] integerFileReader()
		{
			try
			{
				String intFile = new String();
				FileReader fr = new FileReader("number.txt");
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
		//Sorting linked list in ascending order
	  	public int[] sort(int[] arr )
		{
	    	int size=arr.length;
	    	for(int i=size;i>0;i--)
			{
	      		for(int j=1;j<size;j++)
				{
	        		if(arr[j-1]>arr[j])
					{
	          			int temp=arr[j-1];
	          			arr[j-1]=arr[j];
	          			arr[j]=temp;
	        		}
	      		}
	      		size--;
	    	}
	    	return arr;
	  	}//End of sorting method

}

package com.BridgeLabz.LogicalProgram;

public class leapYear {
	public static void main(String[] args) {
		System.out.println("Please enter year : ");
		utility.inputNumber();
		int year = utility.number;
		boolean status = false;
		
		// counting  number of digit in year
		utility.numberOfDigit(year);
		
		System.out.println("year length:" + utility.count);
		if(utility.count == 4)
		{
			if(year % 4 == 0)
			{
				if(year % 100 == 0)
				{
					if(year % 400 == 0)
					{
						status = true;
					}
					else
						status = false;
				}
				else
					status = true;
			}
			else
				status = false;
		}
		else
		{
			System.out.println("please enter year of four digit:");
			return;
		}
		
		if(status)
			System.out.println("The given year  " + year +" is leap year :");
		
		else
			System.out.println("The given year  " +year +" is not leap year:");
		
		
	}


}

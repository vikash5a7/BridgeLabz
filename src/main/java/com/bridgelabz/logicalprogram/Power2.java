package com.bridgelabz.logicalprogram;
public class Power2 {
	public static void main(String[] args) {
		System.out.println("Please enter the power value:");
		int num = utility.inputNumber();
		int power = 1;
		if(num >= 0 && num < 31)
		{
			for(int i = 0; i <= num; i++)
			{
				System.out.println("2 ^" + i + " = " +power);
				power =  power * 2;
					
				
			}
		}
	
	}

}



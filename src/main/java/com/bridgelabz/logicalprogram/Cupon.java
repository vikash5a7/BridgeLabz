package com.bridgelabz.logicalprogram;

import java.util.Random;

public class Cupon 
{
	public static void main(String[] args) 
	{
		char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
		int max=100000000;
		Random rand = new Random();
		int random = rand.nextInt(max);
		 StringBuilder sb = new StringBuilder(); 
		
		while (random>0)
		{
			sb.append(chars[random % chars.length]);
			random /= chars.length;
		}

		String couponCode=sb.toString();
		System.out.println("Coupon Code: "+couponCode);	
	}
}


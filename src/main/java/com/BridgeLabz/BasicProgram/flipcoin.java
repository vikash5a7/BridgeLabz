package com.BridgeLabz.BasicProgram;
import com.bridgeLabz.util.utility;

public class flipcoin {
	public static void main(String[] args) {
		System.out.println("enter how many times do you want to print ?");
		int numberOfTime = utility.inputNumber();
		int counter = 1;
		double heads = 0;
		double tails = 0;
		double randNum = 0.0;
		double percentageOfTail;
		double percentageOfhead;

		while(counter<=numberOfTime)
		{
			randNum = Math.random();   
            if(randNum < 0.5)
            {
                heads++;
                System.out.println("\t heads");
            }
            else
            {
                tails++;
                System.out.println("\t tails");
               }
            counter++;      
			
		}
		 System.out.println();
	     System.out.println("Number of Heads = " + heads);
	     percentageOfhead = (heads/numberOfTime)*100;
	     System.out.println("Percentage of Heads = " + percentageOfhead + "%");
	     System.out.println("Number of Tails = " + tails);
	     percentageOfTail = (tails/numberOfTime)*100;
	     System.out.println("Percentage of Heads = " + percentageOfTail + "%");
		
	}

}


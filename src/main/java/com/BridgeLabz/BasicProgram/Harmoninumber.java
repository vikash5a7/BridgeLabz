/***********************************************
 * purpose : To find haramonic number
 *           
 * @author  vikash kumar
 * @version 1.0
 * @since   20/12/2019          
 ***********************************************/
package com.BridgeLabz.BasicProgram;
public class Harmoninumber
{
	public static void main(String[] args) {
		float sum = 0;
		try {
			int n = Integer.parseInt(args[0]);
			for (int i = 1; i <= n; i++) {
				sum = sum + (float) 1 / i;
				System.out.println(sum);
			}
		} catch (Exception e) {
			System.out.println(e + " \n enter commond line arguments");
		}
	}
}

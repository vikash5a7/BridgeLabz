/***********************************************
 * purpose : file Prgram: 
 *           
 * @author  vikash kumar
 * @version 1.0
 * @since   26/12/2019          
 ***********************************************/

package com.bridgelabz.algorithm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileProgram {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("/home/user/Desktop/names.txt");
		Scanner sc = new Scanner(file);
		try {
			
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		finally
		{
			sc.close();
		}
	}

}

package sortingAlogorithm.copy;

import com.bridgeLabz.util.Utility;

public class BubbleSortForInterger {
	public static void main(String[] args) {
		try {
			System.out.println("SORTING USING THE BUBBLE SORTING: ");
			System.out.println("ENTER HOW MANY NUMBER DO YOU WANT TO ENTER IN ARRAY: ");
			int num = Utility.inputNumber();
			System.out.println("ENTER YOUR ELEMENTS IN ARRAY: ");
			int [] array = Utility.inserting(num);
			Utility.scanner.close();
			int[] sortedArray = Utility.bubbleSortForIntergerValue(array);
			System.out.println("YOUR SORTED ARRAY ARE: ");
			for (int i : sortedArray) {
				System.out.print(i+ " ");
			}
		} catch (Exception e) {
			System.out.println("ENTER VALID NUMBER: ");
		}
		
		
	}

}

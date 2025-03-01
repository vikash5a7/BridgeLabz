/***********************************************
 * purpose : Bubble sorting program: 
 *           
 * @author  vikash kumar
 * @version 1.0
 * @since   26/12/2019          
 ***********************************************/


package com.BridgeLabz.Algorithm;
// Java program for implementation of Bubble Sort
	class BubbleSort
	{
		void bubbleSort(int[] arr)
		{
			int n = arr.length;
			for (int i = 0; i < n-1; i++)
				for (int j = 0; j < n-i-1; j++)
					if (arr[j] > arr[j+1])
					{
						// swap temp and arr[i]
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
		}

		/* Prints the array */
		
		// Driver method to test above
		public static void main(String[] args)
		{
			BubbleSort ob = new BubbleSort();
			int[] arr = {64, 34, 25, 12, 22, 11, 90};
			ob.bubbleSort(arr);
			System.out.println("Sorted array");
			
		}
	}


package com.bridgelabz.datastructure.orderList;


public class OrderList {
	public static void main(String[] args) {
		int[] arry = UtilityDs.integerFileReader();
		
        int size =arry.length;
        System.out.println("Array Size is "+size);
		for (int i : arry) {
			System.out.println(i);
		}
	}
}

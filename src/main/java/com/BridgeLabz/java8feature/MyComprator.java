package com.BridgeLabz.java8feature;
/*
 *  Comparator using lamda
 */
import java.util.*;
public class MyComprator {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(12);
		l.add(3);
		l.add(123);
		l.add(6);
		System.out.println(l);
		Comparator<Integer> c = (i1,i2) -> (i1<i2)?-1:(i1>i2)?1:0;
		Collections.sort(l, c);
		System.out.println(l);
		
	}
	
}

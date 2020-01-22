package com.bridgelabz.java8feature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comperator {
	public static void main(String[] args) {
		List<Student> st = new ArrayList<>();
		st.add(new Student("vikash", 12));
		st.add(new Student("Ram", 17));
		st.add(new Student("rakesh", 12));
		st.add(new Student("vikash", 12));

		System.out.println("---------Before Sorting:-----");
		for (Student student : st) {
			System.out.println(student);
		}
		System.out.println("------After sorting---------");
		Collections.sort(st, (s1, s2)-> s1.getName().compareTo(s2.getName()));
		st.forEach(System.out::println);
		
	}
}

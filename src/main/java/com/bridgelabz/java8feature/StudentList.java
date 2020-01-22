package com.bridgelabz.java8feature;

import java.util.ArrayList;
import java.util.List;
//import java.util.function.Consumer;

public class StudentList {

	public static void main(String[] args) {
		List<Student> st = new ArrayList<>();
		st.add(new Student("vikash", 12));
		st.add(new Student("Ram", 17));
		st.add(new Student("rakesh", 12));
		st.add(new Student("vikash", 12));

		
		st.forEach(s -> System.out.println(s));
		System.out.println();
		st.forEach(System.out::println);
		System.out.println();
		
		for (Student student : st) {
			System.out.println(student);
		}

	}

}
/* 
 * this method is used for printing student info:
 * consumer is used for the iterate 
 * 
class MyConsumer implements Consumer<Student> {

	@Override
	public void accept(Student student) {
		System.out.println(student);
	}
}


*/





































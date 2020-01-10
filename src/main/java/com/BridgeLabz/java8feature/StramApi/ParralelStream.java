package com.BridgeLabz.java8feature.StramApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParralelStream {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("radha", 12));
		list.add(new Student("PK", 12));
		list.add(new Student("RK", 122));
		list.add(new Student("MK", 129));
		list.add(new Student("sk", 193));
		list.add(new Student("radha", 112));
		
		// it's give in unordered way: but process will fast:
		Stream<Student> stream= list.parallelStream();
		//	stream.forEach(System.out::println);
		stream.forEach(s-> doProcess(s));
		
	}

	public static void doProcess(Student s) {
		System.out.println(s);
	}

}

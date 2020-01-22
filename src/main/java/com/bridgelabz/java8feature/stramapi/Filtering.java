package com.bridgelabz.java8feature.stramapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Filtering {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("radha", 12));
		list.add(new Student("PK", 12));
		list.add(new Student("RK", 25));
		list.add(new Student("MK", 19));
		list.add(new Student("sk", 19));
		list.add(new Student("radha", 11));
		
		Stream<Student> filter = list.stream().filter(s->s.getAge()>15);
		filter.forEach(System.out::println);
		
		
		System.out.println("-----------------------------");
		boolean allMatch = list.stream().allMatch(s->s.getName().contains("k"));
		System.out.println(allMatch);
		
		System.out.println("-----------------------------");
		boolean anyMatchAge = list.stream().anyMatch(s->s.getAge()>50);
		System.out.println(anyMatchAge);
		
		boolean noneMatch = list.stream().noneMatch(s->s.getAge()>50);
		System.out.println(noneMatch);
	}

}

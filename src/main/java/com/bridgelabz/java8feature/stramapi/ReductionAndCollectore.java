package com.bridgelabz.java8feature.stramapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReductionAndCollectore {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(12);
		Integer sum = list.stream().reduce(100,(x,y)->x+y);
		System.out.println(sum);
		
		
		System.out.println("---------------------------");
		List<String> listOfName=new ArrayList<>();
		listOfName.add("vikash");
		listOfName.add("raja");
		listOfName.add("ram");
		
		System.out.println(listOfName);
		List<String> listOfnames = listOfName.stream().map(element->element.toUpperCase()).collect(Collectors.toList());
		listOfnames.forEach(System.out::println);
		System.out.println(listOfnames);
	}

}

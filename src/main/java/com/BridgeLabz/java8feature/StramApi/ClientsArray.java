package com.BridgeLabz.java8feature.StramApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ClientsArray {
	public static void main(String[] args) {
		String arr[] = new String[] { "vikash", "ram", "ravi" };
		Stream<String> stream = Arrays.stream(arr);
		stream.forEach(System.out::println);

		System.out.println("-------------------------------------------------");
		Stream<String> of = Stream.of(arr);
		of.forEach(System.out::println);

		List<String> list = new ArrayList<String>();
		list.add("vikash");
		list.add("sanu");
		list.add("ram");
		list.add("radhe");

		System.out.println("-------------------------------------------------");
		Stream<String> streamvalue = list.stream();
		streamvalue.forEach(System.out::println);

	}
}

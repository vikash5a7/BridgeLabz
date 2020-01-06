package com.BridgeLabz.java8feature.StramApi;

import java.util.Arrays;
import java.util.stream.Stream;

public class ClientsArray {
public static void main(String[] args) {
	String arr[] = new String[] {"vikash","ram", "ravi"};
	 Stream<String> stream= Arrays.stream(arr);
	 stream.forEach(System.out::println);
	 
	 
	 System.out.println("-------------------------------------------------");
	 Stream<String> of = Stream.of(arr);
	 of.forEach(System.out::println);
	
}
}

package com.BridgeLabz.java8feature.StramApi;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamOperation {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(12);
		l.add(3);
		l.add(123);
		l.add(6);
		System.out.println(l);
		/*Stream<Integer> stream = l.stream();
		Stream<Integer> distinct = stream.distinct();
		long count = distinct.count(); */
		
		// we can perform above operation in one line
		long count = l.stream().distinct().count();
		System.out.println(count);
	}

}

package com.BridgeLabz.java8feature;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class IrarateUsingHash {
	public static void main(String[] args) {
		Map<Integer, Employe> map = new HashMap<>();
		map.put(1998, new Employe("vikash", "vikas5a@gmail.com", 122.0));
		map.put(1918, new Employe("raj", "rajk@gmail.com", 122.0));
		map.put(19918, new Employe("sunyy", "suuny@gmail.com", 10098.0));
		map.put(9928, new Employe("vikash", "vikas5a@gmail.com", 122.0));
		
		
		// Iterate using the for each and entry  
		Set<Entry<Integer, Employe>> enterySet = map.entrySet();
		for (Entry<Integer, Employe> entry : enterySet) {
			System.out.print(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		System.out.println("..................................amothe way.............");
		
		
		Set<Integer> keyset = map.keySet();
		for (Integer key : keyset) {
			System.out.print(key);
			System.out.println(map.get(key));
			
		}
		
		
		
		System.out.println("-----using lamda function printing:-----------");
		
		map.forEach((k,v)-> System.out.println(k+"\t"+v));
		
		
		
		
		
		
	}

}

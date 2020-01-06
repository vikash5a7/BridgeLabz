package com.BridgeLabz.java8feature;

public class MyinterFaceTest {
	public static void main(String[] args) {
		Myinterface myInterFace = (n1, n2) -> {
			return n1 > n2;
		};
		System.out.println(myInterFace.test(3, 7));
	}
}

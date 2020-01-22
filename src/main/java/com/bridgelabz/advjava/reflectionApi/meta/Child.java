package com.bridgelabz.advjava.reflectionApi.meta;

public class Child extends Parents implements Intest {

	private int value;

	public Child(String name, int value) {
		super(name);
		this.value = value;
	}

	@Override
	public void showValue() {
		System.out.println("value" + value);
		
	}


}

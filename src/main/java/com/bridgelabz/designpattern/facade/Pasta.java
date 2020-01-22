package com.bridgelabz.designpattern.facade;

public class Pasta implements Food {
	String preparedItem;

	@Override
	public void prepareFood(String itemRequired) {
		preparedItem = "Tomato pasta with ingredient" + itemRequired;
	}

	@Override
	public String deliveredFood() {
		return preparedItem;
	}

}

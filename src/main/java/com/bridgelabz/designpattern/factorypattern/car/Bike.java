package com.bridgelabz.designpattern.factorypattern.car;

public class Bike extends Vehical {

	int wheel;

	public Bike(int wheel) {
		super();
		this.wheel = wheel;
	}

	@Override
	public int getWheel() {

		return this.wheel;
	}

}

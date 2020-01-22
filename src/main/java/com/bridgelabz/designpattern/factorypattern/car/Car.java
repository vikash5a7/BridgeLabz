package com.bridgelabz.designpattern.factorypattern.car;

public class Car extends Vehical {
	int wheel;

	public Car(int wheel) {
		super();
		this.wheel = wheel;
	}

	@Override
	public int getWheel() {
		return this.wheel;
	}

}

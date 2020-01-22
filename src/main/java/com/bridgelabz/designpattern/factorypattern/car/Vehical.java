package com.bridgelabz.designpattern.factorypattern.car;

abstract class Vehical {
	public abstract int getWheel();

	@Override
	public String toString() {
		return "Wheel: " + this.getWheel();
	}

}

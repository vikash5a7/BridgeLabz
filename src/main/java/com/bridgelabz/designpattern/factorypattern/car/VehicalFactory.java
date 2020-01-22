package com.bridgelabz.designpattern.factorypattern.car;

public class VehicalFactory {
	public static Vehical getInstance(String type, int wheel) {
		if (type.equalsIgnoreCase("Car"))
			return new Car(wheel);
		else if (type.equalsIgnoreCase("Bike"))
			return new Bike(wheel);
		return null;

	}
}

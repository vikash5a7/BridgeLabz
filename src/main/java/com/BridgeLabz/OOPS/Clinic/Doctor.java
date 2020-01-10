package com.BridgeLabz.OOPS.Clinic;

public class Doctor {
	private String name;
	private int id;
	private String Specilization;
	private String Availability;

	@Override
	public String toString() {
		return "Doctor [name=" + name + ", id=" + id + ", Specilization=" + Specilization + ", Availability="
				+ Availability + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSpecilization() {
		return Specilization;
	}

	public void setSpecilization(String specilization) {
		Specilization = specilization;
	}

	public String getAvailability() {
		return Availability;
	}

	public void setAvailability(String availability) {
		Availability = availability;
	}

}

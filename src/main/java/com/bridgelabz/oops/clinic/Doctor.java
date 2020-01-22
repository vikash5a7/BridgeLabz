package com.bridgelabz.oops.clinic;

public class Doctor {
	private String name;
	private String id;
	private String Specilization;
	private String Availability;
	private long numberOfPatients;

	public long getNumberOfPatients() {
		return numberOfPatients;
	}

	public void setNumberOfPatients(long numberOfPatients) {
		this.numberOfPatients = numberOfPatients;
	}

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

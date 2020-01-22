package com.bridgelabz.java8feature;

public class Employe {
	private String name;
	private String email;
	private Double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Employe(String name, String email, Double salary) {
		super();
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employe [name=" + name + ", email=" + email + ", salary=" + salary + "]";
	}

}

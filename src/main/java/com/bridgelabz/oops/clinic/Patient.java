/**
 * 
 */
package com.bridgelabz.oops.clinic;

/**
 * @author Vikash kumar
 *
 */
public class Patient {
	
	private String name;
	private String ID;
	private double mobile;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String string) {
		ID = string;
	}
	public double getMobile() {
		return mobile;
	}
	public void setMobile(double mobile) {
		this.mobile = mobile;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Patient [name=" + name + ", ID=" + ID + ", mobile=" + mobile + ", age=" + age + "]";
	}
	
	

}

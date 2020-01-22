package com.bridgelabz.oops.inventrymange.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonPropertyOrder;

@SuppressWarnings("serial")
@JsonPropertyOrder(value= {
		"nameOfInventary",
		"inventaryName",
		"weaight",
		"cost"
})
public class InventaryClass implements Serializable {
	private String inventaryName;
	private String nameOfInventary;
	private double weaight;
	private double cost;

	@Override
	public String toString() {
		return "InventaryClass [inventaryName=" + inventaryName + ", nameOfInventary=" + nameOfInventary + ", weaight="
				+ weaight + ", cost=" + cost + "]";
	}

	public String getInventaryName() {
		return inventaryName;
	}

	public void setInventaryName(String inventaryName) {
		this.inventaryName = inventaryName;
	}

	public String getNameOfInventary() {
		return nameOfInventary;
	}

	public void setNameOfInventary(String nameOfInventary) {
		this.nameOfInventary = nameOfInventary;
	}

	public double getWeaight() {
		return weaight;
	}

	public void setWeaight(double weaight) {
		this.weaight = weaight;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

}

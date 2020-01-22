package com.bridgelabz.designpattern.singletone;

public class SingleTonEager {
	private static SingleTonEager instance = new SingleTonEager();

	private SingleTonEager() {

	}

	public static SingleTonEager getInstance() {
		return instance;
	}
}
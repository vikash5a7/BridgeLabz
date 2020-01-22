package com.bridgelabz.designpattern.singletone;

public class SynchSingltnBlockMain {
	public static void main(String[] args) {
		SynchSingletoneBlock instance1 = SynchSingletoneBlock.getIntance();
		System.out.println(instance1);
		SynchSingletoneBlock instance2 = SynchSingletoneBlock.getIntance();
		System.out.println(instance2);
		System.out.println(instance1.equals(instance2));
	}

}

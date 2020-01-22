package com.bridgelabz.designpattern.singletone;

/*
 *  At one time if two user try to access same resource  then  there might be chance that 
 *  creating two instance of class so for avoiding the creation of two instance we should make them as 
 *  synchronize , this Thread safe 
 *  in one thread complete then only second thread will invoke
 *  it's making whole method as synchronized 
 */
public class SynchronizedSinglTon1 {
	private static SynchronizedSinglTon1 instance;

	private SynchronizedSinglTon1() {
	}

	public static synchronized SynchronizedSinglTon1 getIntance() {
		if (instance == null) {
			instance = new SynchronizedSinglTon1();
		}
		return instance;
	}

}

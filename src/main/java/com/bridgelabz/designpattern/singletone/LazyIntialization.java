package com.bridgelabz.designpattern.singletone;
/*
 * when ever there is need then only instance will be created of the object
 *  
 */
public class LazyIntialization {
	private static LazyIntialization instance;

	private LazyIntialization() {}

	public static LazyIntialization getInstance() {
		if(instance == null)
		{
			instance = new LazyIntialization();
		}
		return instance;
	}
	

}

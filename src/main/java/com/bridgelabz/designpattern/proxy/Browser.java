package com.bridgelabz.designpattern.proxy;

public class Browser {
	public static void main(String[] args) {
		WebPageProxy webPageProxy = new WebPageProxy();
		try {
			webPageProxy.render("www.youtube.com");
		} catch (Exception e) {
			System.out.println("Exception Occured " +e.getMessage());
			e.printStackTrace();
		}
	}

}

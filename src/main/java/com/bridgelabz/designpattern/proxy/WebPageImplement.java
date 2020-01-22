package com.bridgelabz.designpattern.proxy;

public class WebPageImplement implements WebPage {

	@Override
	public void render(String url) throws Exception {
		System.out.println(url + "render SucessFully........");
	}

}

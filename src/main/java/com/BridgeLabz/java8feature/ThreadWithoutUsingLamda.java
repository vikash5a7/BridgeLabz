/* desc : implementation of Thread without using lamda function */

package com.BridgeLabz.java8feature;

class MyRunable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(" hi my child class: ");
		}
	}

}
public class ThreadWithoutUsingLamda {
	public static void main(String[] args) {
		MyRunable r = new MyRunable();
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println(" hi main class: ");
		}

	}
}

package com.BridgeLabz.DataStructure.Queue;

public class TestRunner {
	public static void main(String[] args) {
		QueueImplementation q = new QueueImplementation();
		q.enQueue(2);
		q.enQueue(4);
		q.enQueue(2);
		q.enQueue(9);
		q.show();
		System.out.println("\n after deleting elements: ");
		q.dequeue();
		q.show();
	}
}

package com.BridgeLabz.DataStructure.Queue;

public class TestRunner {
	public static void main(String[] args) {
		QueueImplementation q = new QueueImplementation();
		q.enQueue(2);
		q.enQueue(4);
		q.enQueue(2);
		q.enQueue(9);
		q.enQueue(2);
//		q.dequeue();
//		q.dequeue();
//		q.enQueue(4);
//		q.enQueue(2);
		q.show();
		System.out.println(q.getSize());
		System.out.println(q.isEmpty());
		System.out.println(q.isFull());
	}
}

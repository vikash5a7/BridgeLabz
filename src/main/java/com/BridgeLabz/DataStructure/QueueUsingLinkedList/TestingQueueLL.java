package com.BridgeLabz.DataStructure.QueueUsingLinkedList;

public class TestingQueueLL {
	public static void main(String[] args) {
		QueueLL q = new QueueLL();
		System.out.println(q.isEmpty());
		q.enQueue(12);
		System.out.println(q.isEmpty());
		q.enQueue(13);
		q.enQueue(12);
		q.enQueue(23);
		q.deQueue();
		System.out.println(q.isEmpty());
		q.display();
		System.out.println(q.size);
	}

}

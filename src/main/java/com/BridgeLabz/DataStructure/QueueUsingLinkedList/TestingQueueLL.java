package com.BridgeLabz.DataStructure.QueueUsingLinkedList;

public class TestingQueueLL {
	public static void main(String[] args) {
		QueueLL q = new QueueLL();
		System.out.println("is Queue Empty : "+q.isEmpty());
		q.enQueue(12);
		System.out.println("is Queue Empty : "+q.isEmpty());
		q.enQueue(13);
		q.enQueue(12);
		q.enQueue(23);
		q.display();
		System.out.println("deleting: " + q.deQueue());
		System.out.println("is Queue Empty : "+q.isEmpty());
		q.display();
		System.out.println("Size of List : " + q.size);
		System.out.println("Fisrt element "+ q.peek());
	}

}

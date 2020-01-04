package com.BridgeLabz.DataStructure.QueueUsingLinkedList;

public class DeQueueTest {
	public static void main(String[] args) {
		Dequeue dq = new Dequeue();
		System.out.println("Size Of list : " + dq.getSize());
		System.out.println("Is DeQueue is Empty: " + dq.getSize());
		dq.insertAtFront(12);
		System.out.println("Size Of list : " + dq.getSize());
		dq.display();
	}

}

package com.bridgelabz.datastructure.queueusinglinkedlist;

public class DeQueueTest {
	public static void main(String[] args) {
		Dequeue dq = new Dequeue();
		System.out.println("Size Of list : " + dq.getSize());
		System.out.println("Is DeQueue is Empty: " + dq.getSize());
		dq.insertAtFront(12);
		System.out.println("Size Of list : " + dq.getSize());
		dq.display();
		dq.insertAtFront(8);

		dq.insertAtFront(90);
		dq.display();
		dq.insertAtRear(123);
		dq.insertAtRear(354);
		dq.display();
		dq.removeAtFront();
		System.out.println("peek at from from " + dq.peekAtFront());
		System.out.println("peek at last" + dq.peekAtFront());

	}

}

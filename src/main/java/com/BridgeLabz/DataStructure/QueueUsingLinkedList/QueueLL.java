package com.BridgeLabz.DataStructure.QueueUsingLinkedList;

import java.util.NoSuchElementException;

public class QueueLL {
	Node front;
	Node rear;
	int size = 0;

	public QueueLL() {
		front = null;
		rear = null;
		size = 0;
	}

	// queue is empty or not
	public boolean isEmpty() {
		return rear == null;
	}

	/* Function to insert an element to the queue */
	public void enQueue(int data) {
		Node nptr = new Node(data, null);
		if (rear == null) {
			front = nptr;
			rear = nptr;
		} else {
			rear.setNext(nptr);
			rear = rear.getNext();
		}
		size++;
	}

	/****
	 *  Function to get size of queue 
	 *  @return first element of queue:
	 * ********** */
	public int size() {
		return size;
	}

	//  deleting elements from Queue
	public int deQueue() {
		if (isEmpty()) {
			System.out.println("stack is empty: ");
		}
		Node temp = front;
		front = temp.getNext();
		if (front == null)
			rear = null;
		size--;
		return temp.getData();
	}
//  deleting elements from Queue
	public int delete() {
		if (isEmpty()) {
			System.out.println("stack is empty: ");
		}
		Node temp = front;
		front = temp.getNext();
		if (front == null)
			rear = null;
		size--;
		return temp.getData();
	}

	/* Function to check Display the whole Queue */
	public void display() {
		System.out.print("\nQueue = ");
		if (size == 0) {
			System.out.print("Empty\n");
			return;
		}
		Node ptr = front;
		while (ptr != rear.getNext()) {
			System.out.print(ptr.getData() + " ");
			ptr = ptr.getNext();
		}
		System.out.println();
	}

	/****
	 *  Function to check the front element of the queue
	 *  @return first element of queue:
	 * ********** */
	public int peek() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		return front.getData();
	}

}

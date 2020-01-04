package com.BridgeLabz.DataStructure.QueueUsingLinkedList;

import java.util.NoSuchElementException;


public class UtilityForDeque {
	NodeS front;
	NodeS rear;
	int size = 0;

	public UtilityForDeque() {
		front = null;
		rear = null;
		size = 0;
	}

	// queue is empty or not
	public boolean isEmpty() {
		return rear == null;
	}

	/* Function to insert an element to the queue */
	public void enQueue(String data) {
		NodeS nptr = new NodeS(data, null);
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
	public String deQueue() {
		if (isEmpty()) {
			System.out.println("stack is empty: ");
		}
		NodeS temp = front;
		front = temp.getNext();
		if (front == null)
			rear = null;
		size--;
		return temp.getData();
	}
//  deleting elements from Queue
	public String delete() {
		if (isEmpty()) {
			System.out.println("stack is empty: ");
		}
		NodeS temp = front;
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
		NodeS ptr = front;
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
	public String peek() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		return front.getData();
	}

}

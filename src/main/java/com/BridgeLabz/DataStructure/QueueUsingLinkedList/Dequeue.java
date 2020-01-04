package com.BridgeLabz.DataStructure.QueueUsingLinkedList;

/*
* Java Program to Implement Double Ended Queue
*/

import java.util.*;

/*  Class Dequeue  */
class Dequeue {
	private Node front, rear;
	private int size;

	/* Constructor */
	public Dequeue() {
		front = null;
		rear = null;
		size = 0;
	}

	/* Function to check if queue is empty */
	public boolean isEmpty() {
		return front == null;
	}

	/* Function to get the size of the queue */
	public int getSize() {
		return size;
	}

	/* Clear dequeue */
	public void clear() {
		front = null;
		rear = null;
		size = 0;
	}

	/* Function to insert an element at begining */
	public void insertAtFront(int val) {
		Node temp = new Node(val, null);
		size++;
		if (front == null) {
			front = temp;
			rear = front;
		} else {
			temp.setNext(front);
			front = temp;
		}
	}

	/* Function to display the status of the queue */
	public void display() {
		System.out.print("\nDequeue = ");
		if (size == 0) {
			System.out.print(" Stack is empty ");
		}
		Node ptr = front;
		while (ptr != rear.getNext()) {
			System.out.print(ptr.getData() + " ");
			ptr = ptr.getNext();
		}
		System.out.println();
	}

	/* Function to insert an element at end */
	public void insertAtRear(int val) {
		Node temp = new Node(val, null);
		size++;
		if (rear == null) {
			rear = temp;
			front = rear;
		} else {
			rear.setNext(temp);
			rear = temp;
		}
	}
	
	  /*  Function to remove front element from the queue */
	   public int removeAtFront()
	   {
	       if (isEmpty() )
	           throw new NoSuchElementException("Underflow Exception");
	       Node temp = front;
	       front = temp.getNext();

	       if (front == null)
	           rear = null;
	       size-- ;

	       return temp.getData();
	   }
	   /*  Function to remove rear element from the queue */
	   public int removeAtRear()
	   {
	       if (isEmpty() )
	           throw new NoSuchElementException("Underflow Exception");
	       int ele = rear.getData();
	       Node s = front;
	       Node t = front;
	       while (s != rear)
	       {
	           t = s;
	           s = s.getNext();
	       }
	       rear = t;
	       rear.setNext(null);
	       size --;

	       return ele;
	   }        
	   /*  Function to check the front element of the queue */
	   public int peekAtFront()
	   {
	       if (isEmpty() )
	           throw new NoSuchElementException("Underflow Exception");
	       return front.getData();
	   }
	   /*  Function to check the front element of the queue */
	   public int peekAtRear()
	   {
	       if (isEmpty() )
	           throw new NoSuchElementException("Underflow Exception");
	       return rear.getData();
	   } 

}

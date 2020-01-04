package com.BridgeLabz.DataStructure.QueueUsingLinkedList;
import java.util.*;

/*  Class Dequeue  */
public class UtilityForDeque {
	private NodeS front, rear;
	private int size;

	/* Constructor */
	public UtilityForDeque() {
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
	public void insertAtFront(String val) {
		NodeS temp = new NodeS(val, null);
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
		if (size == 0) {
			System.out.print(" Stack is empty ");
		}
		NodeS ptr = front;
		while (ptr != rear.getNext()) {
			System.out.print(ptr.getData() + " ");
			ptr = ptr.getNext();
		}
		System.out.println();
	}

	/* Function to insert an element at end */
	public void insertAtRear(String val) {
		NodeS temp = new NodeS(val, null);
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
	   public String removeAtFront()
	   {
	       if (isEmpty() )
	           throw new NoSuchElementException("Underflow Exception");
	       NodeS temp = front;
	       front = temp.getNext();

	       if (front == null)
	           rear = null;
	       size-- ;

	       return temp.getData();
	   }
	   /*  Function to remove rear element from the queue */
	   public String removeAtRear()
	   {
	       if (isEmpty() )
	           throw new NoSuchElementException("Underflow Exception");
	       String ele = rear.getData();
	       NodeS s = front;
	       NodeS t = front;
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
	   public String peekAtFront()
	   {
	       if (isEmpty() )
	           throw new NoSuchElementException("Underflow Exception");
	       return front.getData();
	   }
	   /*  Function to check the front element of the queue */
	   public String peekAtRear()
	   {
	       if (isEmpty() )
	           throw new NoSuchElementException("Underflow Exception");
	       return rear.getData();
	   } 

}

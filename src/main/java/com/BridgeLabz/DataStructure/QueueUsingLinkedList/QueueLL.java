package com.BridgeLabz.DataStructure.QueueUsingLinkedList;

public class QueueLL {
	Node front;
	Node rear;
	int size=0;
	public QueueLL() {
		front = null;
		rear = null;
		size = 0;
	}
	
	// queue is empty or not
	public boolean isEmpty()
	{
		return rear ==null;
	}
	
    /*  Function to insert an element to the queue */
    public void enQueue(int data)
    {
        Node nptr = new Node(data, null);
        if (rear == null)
        {
            front = nptr;
            rear = nptr;
        }
        else
        {
            rear.setNext(nptr);
            rear = rear.getNext();
        }
        size++ ;
    }    

	// Size of the Queue
	public int size()
	{
		return size;
	}
	// displaying data 
	
	public void display()
	{
		System.out.print("\nQueue = ");
        if (size == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        Node ptr = front;
        while (ptr != rear.getNext() )
        {
            System.out.print(ptr.getData()+" ");
            ptr = ptr.getNext();
        }
        System.out.println();        
    }
	
	
	
	
	
	
	
	
}

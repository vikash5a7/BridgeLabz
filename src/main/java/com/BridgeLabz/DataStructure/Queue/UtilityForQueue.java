package com.BridgeLabz.DataStructure.Queue;

//Class for queue
public class UtilityForQueue 
{
	private int arr[];		// array to store queue elements
	private int front;		// front points to front element in the queue (if any)
	private int rear;		// rear points to last element in the queue
	private int capacity;	// maximum capacity of the queue
	private int count;		// current size of the queue
	
	
	
	// Constructor to initialize queue
	public UtilityForQueue(int size)
	{
		arr = new int[size];
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
	}

	// Utility function to add an item to the queue
		public void enqueue(int item)
		{
			// check for queue overflow
			if (isFull())
			{
				System.out.println("OverFlow\nProgram Terminated");
				System.exit(1);
			}

			System.out.println("Person Number " + item);

			rear = (rear + 1) % capacity;
			arr[rear] = item;
			count++;
		}
	
	
	// Utility function to remove front element from the queue
	public void dequeue()
	{
		// check for queue underflow
		if (isEmpty())
		{
			System.out.println("UnderFlow\nProgram Terminated");
			System.exit(1);
		}

		System.out.println("Person " + arr[front]);

		front = (front + 1) % capacity;
		count--;
	}

	

	// Utility function to return front element in the queue
	public int peek()
	{
		if (isEmpty()) 
		{
			System.out.println("UnderFlow\nProgram Terminated");
			System.exit(1);
		}
		return arr[front];
	}

	// Utility function to return the size of the queue
	public int size()
	{
		return count;
	}

	// Utility function to check if the queue is empty or not
	public Boolean isEmpty()
	{
		return (size() == 0);
	}

	// Utility function to check if the queue is empty or not
	public Boolean isFull()
	{
		return (size() == capacity);
	}
	// to show the queue
	public void show()
	{
		for(int i = 0; i<size(); i++)
		{
			System.out.print(arr[(front+i)%capacity] + " ");
		}
	}
}

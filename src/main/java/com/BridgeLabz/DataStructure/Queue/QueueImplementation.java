package com.BridgeLabz.DataStructure.Queue;

public class QueueImplementation {
	int[] queue = new int[5];
	int size;
	int front;
	int rear;
	
	// getting size 
		public int getSize()
		{
			return size;
		}
	
	// checking the Queue is empty or not
	public boolean isEmpty()
	{
		return getSize() == 0;
	}
	
	
	// checking queue is full or not
	public boolean isFull()
	{
		return getSize()== 5;
	}
	
	
	// inserting value in queue 
	public void enQueue(int data)
	{
		queue[rear]= data;
		rear++;
		size++;
	}
	// delete elements
	public int dequeue()
	{
		int data = queue[front];
		front = (front+1)%5;
		size--;
		return data;
	}
	
	
	
	// printing elements 
	public void show()
	{
		System.out.println("Elements are: ");
		for(int i = 0; i<size; i++)
		{
			System.out.print(queue[(front+i)%5] + " ");
		}
	}
}

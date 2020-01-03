package com.BridgeLabz.DataStructure.Queue;

public class QueueImplementation {
	int[] queue = new int[5];
	int size;
	int front;
	int rear;
	
	// inserting value in queue 
	public void enQueue(int data)
	{
		queue[rear]= data;
		rear++;
		size++;
	}
	// printing elements 
	public void show()
	{
		System.out.println("Elements are: ");
		for(int i = 0; i<size; i++)
		{
			System.out.print(queue[i] + " ");
		}
	}
}

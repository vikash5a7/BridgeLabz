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
}

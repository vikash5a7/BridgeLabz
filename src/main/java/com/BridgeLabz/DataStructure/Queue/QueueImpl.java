package com.BridgeLabz.DataStructure.Queue;
class QueueImpl
{	
	// main function
	public static void main (String[] args)
	{
		// create a queue of capacity 5
		UtilityForQueue q = new UtilityForQueue(5);

		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(2);
		
		System.out.println("Front element is: " + q.peek());
		q.dequeue();
		System.out.println("Front element is: " + q.peek());

		System.out.println("Queue size is " + q.size());

		q.dequeue();
		q.dequeue();
		
		if (q.isEmpty())
			System.out.println("Queue Is Empty");
		else
			System.out.println("Queue Is Not Empty");
	}
}

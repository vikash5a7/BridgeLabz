package com.BridgeLabz.DataStructure.QueueUsingLinkedList;

/*
* Java Program to Implement Double Ended Queue
*/

import java.util.*;
/*  Class Dequeue  */
class Dequeue
{
   private Node front, rear;
   private int size;

   /* Constructor */
   public Dequeue()
   {
       front = null;
       rear = null;
       size = 0;
   }    
   /*  Function to check if queue is empty */
   public boolean isEmpty()
   {
       return front == null;
   }    
   /*  Function to get the size of the queue */
   public int getSize()
   {
       return size;
   }
   
   /* Clear dequeue */
   public void clear()
   {
       front = null;
       rear = null;
       size = 0;
   }
   
   /*  Function to insert an element at begining  */
   public void insertAtFront(int val)
   {
       Node temp = new Node(val, null);    
       size++ ;    
       if (front == null) 
       {
           front = temp;
           rear = front;
       }
       else 
       {
           temp.setNext(front);
           front = temp;
       }
   }
   /*  Function to display the status of the queue */
   public void display()
   {
       System.out.print("\nDequeue = ");
       if (size == 0)
       {
           System.out.print(" Stack is empty ");
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

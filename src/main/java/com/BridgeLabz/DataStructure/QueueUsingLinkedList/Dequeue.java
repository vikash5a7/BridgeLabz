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
  
}

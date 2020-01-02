package com.BridgeLabz.DataStructure.LinkedListProgram;
//A complete working Java program to demonstrate all insertion methods 
//on linked list 
class LinkedList {
	Node head; // head of list

	/* Linked list Node */
	class Node {
		String data;
		Node next;

		Node(String d) {
			data = d;
			next = null;
		}
	}

	/* Inserts a new Node at front of the list. */
	public void push(String new_data) {
		/*
		 * 1 & 2: Allocate the Node & Put in the data
		 */
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	/* Inserts a new node after the given prev_node. */
	public void insertAfter(Node prev_node, String new_data) {
		/* 1. Check if the given Node is null */
		if (prev_node == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}

		/*
		 * 2 & 3: Allocate the Node & Put in the data
		 */
		Node new_node = new Node(new_data);

		/* 4. Make next of new Node as next of prev_node */
		new_node.next = prev_node.next;

		/* 5. make next of prev_node as new_node */
		prev_node.next = new_node;
	}

	/*
	 * Appends a new node at the end. This method is defined inside LinkedList class
	 * shown above
	 */
	public void append(String new_data) {
		/*
		 * 1. Allocate the Node & 2. Put in the data 3. Set next as null
		 */
		Node new_node = new Node(new_data);

		/*
		 * 4. If the Linked List is empty, then make the new node as head
		 */
		if (head == null) {
			head = new Node(new_data);
			return;
		}

		/*
		 * 4. This new node is going to be the last node, so make next of it as null
		 */
		new_node.next = null;

		/* 5. Else traverse till the last node */
		Node last = head;
		while (last.next != null)
			last = last.next;

		/* 6. Change the next of last node */
		last.next = new_node;
		return;
	}

	/*
	 * This function prints contents of linked list starting from the given node
	 */
	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}
	public boolean search(Node head, String x) 
	{ 
      // Base case 
      if (head == null) 
          return false; 

      // If key is present in current node, 
      // return true 
      if (head.data == x) 
          return true; 

      // Recur for remaining list 
      return search(head.next, x); 
  } 

	public static void main(String[] args) {
		/* Start with the empty list */
		LinkedList llist = new LinkedList();

		// Insert 6. So linked list becomes 6->NUllist
		llist.append("vikash");
		System.out.println("\nCreated Linked list is: ");
		llist.printList();
		
	}
	
	
}

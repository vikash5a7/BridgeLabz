package com.BridgeLabz.DataStructure.StackUsingLinkedList;

public class StackLL {
	private Node head;

	public StackLL() {
		this.head = null;
	}

	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = this.head;
		this.head = newNode;
	}

	public void display() {
		if (head == null) {
			System.out.println("stack is empty");
		} else {
			Node temp = this.head;
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}

	public int peek() {
		if (head == null)
			System.out.println("Stack is empty: ");
		else
			return this.head.data;
		return 0;
	}

	public int pop() {
		if (head == null) {
			System.out.println("Stack is empty");
		} else {
			Node temp = head;
			this.head = head.next;
			return temp.data;
		}
		return 0;
	}

	public int size() {
		if(head ==null)
			return 0;
		Node temp = this.head;
		int count =0;
		while(temp!= null)
		{
			count ++;
			temp = temp.next;
		}
		return count;
		
	}

}

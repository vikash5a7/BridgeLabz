package com.BridgeLabz.DataStructure.OrderList;

public class Node {
	private int data;
	private Node next;
	public Object nextNode;
	
	public Node() {
		data =0;
		next = null;
	}
	
	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public Node(int data) {
		super();
		this.data = data;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}

package com.BridgeLabz.DataStructure.LinkedList;

public class Node {
	private String data;
	private Node next;
	
	public Node() {
		data =null;
		next = null;
	}
	
	public Node(String data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public Node(String data) {
		super();
		this.data = data;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}

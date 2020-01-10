package com.BridgeLabz.DataStructure.QueueUsingLinkedList;
/***********************************************
 * purpose : Node class
 *           
 * @author  vikash kumar
 * @version 1.0
 * @since   4-01-2020         
 ***********************************************/

public class Node {
	private int data;
	private Node next;
	
	public Node() {
		data =0;
		next = null;
	}
	/****** constructor***/
	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	/*Getter and setter.....*/

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


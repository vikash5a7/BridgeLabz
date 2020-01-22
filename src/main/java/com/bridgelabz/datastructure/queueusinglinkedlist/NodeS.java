package com.bridgelabz.datastructure.queueusinglinkedlist;

public class NodeS {
	private String data;
	private NodeS next;
	
	public NodeS() {
		data =null;
		next = null;
	}
	/****** constructor***/
	public NodeS(String data, NodeS next) {
		super();
		this.data = data;
		this.next = next;
	}

	/****Getter and setter.....*/

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public NodeS getNext() {
		return next;
	}

	public NodeS(String data) {
		super();
		this.data = data;
	}

	public void setNext(NodeS next) {
		this.next = next;
	}
}
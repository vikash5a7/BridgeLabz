package com.BridgeLabz.DataStructure.StackUsingLinkedList;

public class Main {
	public static void main(String[] args) {
	StackLL s = new StackLL();
	s.display();
	s.push(3);
	s.push(4);
	s.push(6);
	s.push(23);
	s.display();
	System.out.println(s.peek());
	}
}

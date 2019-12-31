package com.BridgeLabz.DataStructure.stack;

import java.util.EmptyStackException;

public class StackClass {

	private int arr[];
	private int size;
	private int top = 0;

	public StackClass(int size) {
		this.size = size;
		arr = new int[size];
	}
	public int peek() {
		
		return arr[top-1];
		
	}
	public void push(int element) {

		if (isFull()) {
			throw new StackOverflowError("Stack is full");
		}

		arr[top] = element;
		top++;
	}

	public int pop() {

		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return arr[--top];
	}

	public boolean isEmpty() {
		if (top == 0) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (top == size) {
			return true;
		}
		return false;
	}

	public int size() {
		return top;
	}
}

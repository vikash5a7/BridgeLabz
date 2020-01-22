package com.bridgelabz.datastructure.stack;

import java.util.EmptyStackException;

public class StackClass {
	private String stringarray[];
	private int arr[];
	private int size;
	private int top = -1;
	char items[] = new char[100];
	
	// push the string into stack
	public void push(String element) {

		if (isFull()) {
			throw new StackOverflowError("Stack is full");
		}

		stringarray[top] = element;
		top++;
	}
	
	
	
	
	
	
	// Contractor for main
	public StackClass(int size) {
		this.size = size;
		arr = new int[size];
	}
	
	// pushing  elements for char
	void push(char x) {
		if (top == 99) {
			System.out.println("Stack full");
		} else {
			items[++top] = x;
		}
	}
	
	// poping character from character array
	public char popchar() {
		if (top == -1) {
			System.out.println("Underflow error");
			return '\0';
		} else {
			char element = items[top];
			top--;
			return element;
		}
	}
	// checking is empty of full
	boolean isEmpty() {
		return (top == -1) ? true : false;
	}
	
	// peek elements for number
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
	
	// pop the elements
	public int pop() {

		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return arr[--top];
	}
	
	// stack is full are not 
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

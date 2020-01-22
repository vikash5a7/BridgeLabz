package com.bridgelabz.datastructure.linkedlistprogram;

public class LinkedList {
	private int size;
	private Node start;

	public LinkedList() {
		size = 0;
		start = null;
	}

	// for checking the list is empty or not
	public boolean isEmpty() {
		if (start == null)
			return true;
		else
			return false;
	}

	// for getting size of the list
	public int getListSize() {
		return size;
	}

	// view list
	public void viewList() {
		Node t;
		if (isEmpty())
			System.out.print("List is empty: \n ");

		else 
		{
			t = start;
			for (int i = 1; i <=size; i++) {
				System.out.print(" " + t.getData());
				t = t.getNext();
			}
		}
	}
Node head;
// inserting node at first
	public void insertAtFirst(String val) {
		Node n= new Node(val);
		n.setData(val);
		n.setNext(start);
		start = n;
		size++;
	}

// inserting at last
	public void insertAtLast(String val) {
		Node n, t;
		n = new Node();
		n.setData(val);
		t = start;
		if (t == null)
			start = n;
		else {
			while (t.getNext() != null) {
				t = t.getNext();
				t.setNext(n);
				
			}
			
			size++;
			}
		
		
	}

	public void insertAtPos(String val, int pos) {
		if (pos == 1)
			insertAtFirst(val);
		else if (pos == size + 1)
			insertAtLast(val);
		else if (pos > 1 && pos <= size) {
			Node n, t;
			n = new Node();
			t = start;
			for (int i = 0; i < pos - 1; i++) {
				t = t.getNext();
			}
			n.setNext(t.getNext());
			t.setNext(n);
			size++;

		} else
			System.out.println("insertion is not possible at postion number: " + pos);

	}

	// deleting at fisrt postioin
	public void deleteAtFirst() {
		if (start == null)
			System.out.println("List is already empty: ");
		else {
			start = start.getNext();
			size--;
		}
	}

	// delete at last
	public void deleteAtLast() {

		if (start == null)
			System.out.println("List is already empty: ");
		else if (size == 1) {
			start = null;
			size--;
		} else {
			Node t;
			t = start;
			for (int i = 0; i < size - 1; i++) {
				t = t.getNext();
			}
			t.setNext(null);
			size--;
		}
	}

	public int searchString(String search)
	{
		Node t;
		if (isEmpty())
			return 0;

		else 
		{
			t = start;
			for (int i = 1; i <=size; i++) {
				if(t.getData().equals(search))
				{	
					return i;
				}
					t = t.getNext();
			}
		}
	return 0;
}
	// delete at Position
	public void deleteAtPosition(int pos) {
		if (start == null)
			System.out.println("List is already empty: ");
		else if (size == 1) {
			start = null;
			size--;
		} else if (pos < 1 || pos > size) {
			System.out.println("Invalide postion");
		} else if (pos == size) {
			deleteAtLast();
		} else {
			Node t, t1;
			t = start;
			for (int i = 1; i < pos - 1; i++) {
				t = t.getNext();
			}
			t1 = t.getNext();
			t.setNext(t1.getNext());
			size--;
		}

	}

}

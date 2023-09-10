package com.example.SinglyLinkedlist;

public class SinglyLinkedList {

	Node head;
	Node tail;
	int size =0;
	
	public void printSinglyLinkedList() {
		System.out.println("size : " + size);

		Node node = head;
		for(int i=0; i<size; i++) {
			System.out.print(node.value + " : " + node.next + (node.next == null ? "" : " -> ")) ;
			node = node.next;
		}
		System.out.println();
	}
	
	public void createSinglyLinkedList(int nodeValue) {
		Node node = new Node();
		node.value = nodeValue;
		node.next = null;
		head = node;
		tail = node;
		size = 1;
	}

	public void insertIntoSinglyLinkedList(int nodeValue, int position) {
		if(head == null) {
			System.out.println("SinglyLinkedList is empty");
		}
		else {
			if(position == 0) {
				Node node = new Node();
				node.next = head;
				node.value = nodeValue;
				head = node;
				tail = node.next;
			}
			else if(position>=size) {
				Node node = new Node();
				node.value = nodeValue;
				node.next = null;
				tail.next = node;
				tail = node;
			}
			else {
				Node tempNode = head;
				for(int i=0; i< position-1;i++) {
					tempNode = head.next;
				}
				Node node = new Node();
				node.value = nodeValue;
				node.next = tempNode.next;
				tempNode.next = node;
			}
			size++;
		}
	}
	
	public void deleteSinglyLinkedList(int position) {
		if(head == null) {
			System.out.println("SinglyLinkedList is empty");
		}
		else if(position == 0) {
			head = head.next;
			size--;
			if(size == 0) 
				tail = null;
		}
		else if(position > size-1) {
			System.err.println("Cannot delete node with index more than the size");
		}
		else {
			Node node = head;
			for(int i=0; i< position - 1; i++) {
				node = node.next;
			}
			Node nodeToDelete = node.next;
			node.next = nodeToDelete.next;
			size--;
		}
	}
	
	public void deleteEntireSinglyLinkedList() {
		head = tail = null;
		size = 0;
		System.out.println("Entire SinglyLinkedList deleted successfully");
	}
}

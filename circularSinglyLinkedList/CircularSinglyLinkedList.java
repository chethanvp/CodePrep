package com.example.circularSinglyLinkedList;

public class CircularSinglyLinkedList {

	Node head;
	Node tail;
	int size = 0;
	
	public void printCircularSinglyLinkedList() {
		System.out.println("CircularSinglyLinkedList");
		Node node = head;
		for(int i=0; i< size; i++) {
			System.out.print(node.value  + " : " + node.next + (i >= size-1 ? "" : " -> "));
			node = node.next;
		}
		System.out.println();
		System.out.println();
	}
	
	public void createCircularSinglyLinkedList(int nodeValue) {
		System.out.println("Creating CircularSinglyLinkedList");
		
		Node node = new Node();
		node.value = nodeValue;
		node.next = node;
		
		head = node;
		tail = node;
		size = 1;
	}
	
	public void insertIntoCircularSinglyLinkedList(int nodeValue, int position) {
		System.out.println("Inserting into CircularSinglyLinkedList : " + nodeValue + " at " + position);
		Node node = new Node();
		node.value = nodeValue;
		if(head == null) {
			System.out.println("CircularSinglyLinkedList is empty");
			createCircularSinglyLinkedList(nodeValue);
		}
		else if(position == 0) {
			node.next = head;
			head = node;
			tail.next = head;
		}
		else if(position >= size) {
			tail.next = node;
			tail = node;
			tail.next = head;
		}
		else {
			Node tempNode = head;
			for(int i=0; i<position-1; i++) {
				tempNode = tempNode.next;
			}
			node.next = tempNode.next;
			tempNode.next = node;
		}
		size++;
	}
	
	public void searchCircularSinglyLinkedList(int nodeValue) {
		if(size == 0) {
			System.out.println("CircularSinglyLinkedList is empty");
		}
		else {
			Node node = head;
			Boolean found = false;
			for(int i=0; i<size; i++) {
				if(node.value == nodeValue) {
					found = true;
					break;
				}
				node = node.next;
			}
			if(found)
				System.out.println("Element found");
			else
				System.out.println("Element not found");
		}
	}

	public void deleteCircularSinglyLinkedList(int position) {
		if(head == null) 
			System.out.println("CircularSinglyLinkedList is empty");
		else if(position == 0) {
			head = head.next;
			tail.next = head;
			size--;
			if(size == 0) {
				head.next = null;
				head = null;
				tail = null;
			}
		}
		else if(position >= size-1) {
			Node tempNode = head;
			for(int i=0; i<size-1; i++) {
				tempNode = tempNode.next;
			}
			if(tempNode == head) {
				tempNode.next = null;
				head = null;
				tail = null;
			}
			tempNode.next = head;
			tail = tempNode;
			size--;
			
		}
		else {
			Node tempNode = head;
			for(int i=0; i<position-1; i++) {
				tempNode = tempNode.next;
			}
			tempNode.next = tempNode.next.next;
			size--;
		}
	}
	
	public void deleteEntireCircularLinkedList() {
		tail.next = null;
		tail = null;
		head = null;
		size = 0;
	}
}

package com.example.circularSinglyLinkedList;

public class Main {

	public static void main(String args[]) {
		CircularSinglyLinkedList list = new CircularSinglyLinkedList();
		list.createCircularSinglyLinkedList(4);
		list.printCircularSinglyLinkedList();
		
		list.insertIntoCircularSinglyLinkedList(1, 0);
		list.printCircularSinglyLinkedList();
		
		list.insertIntoCircularSinglyLinkedList(2, 2);
		list.printCircularSinglyLinkedList();
		
		list.insertIntoCircularSinglyLinkedList(3, 4);
		list.printCircularSinglyLinkedList();
		
		list.searchCircularSinglyLinkedList(9);
		
		list.deleteCircularSinglyLinkedList(0);
		list.printCircularSinglyLinkedList();
		
		list.insertIntoCircularSinglyLinkedList(1, 0);
		list.printCircularSinglyLinkedList();
		
		list.deleteCircularSinglyLinkedList(1);
		list.printCircularSinglyLinkedList();
		
		list.deleteCircularSinglyLinkedList(4);
		list.printCircularSinglyLinkedList();
		
		list.deleteCircularSinglyLinkedList(2);
		list.printCircularSinglyLinkedList();
		System.out.println(list.head.next);
	}
}

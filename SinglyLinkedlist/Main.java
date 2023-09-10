package com.example.SinglyLinkedlist;

public class Main {

	public static void main(String args[]) {
		System.out.println("-------------------- Linked List ------------------");
		SinglyLinkedList();
	}
	
	public static void SinglyLinkedList() {
		System.out.println("Creating SinglyLinkedList");
		SinglyLinkedList list = new SinglyLinkedList();
		list.createSinglyLinkedList(2);
		list.printSinglyLinkedList();
		
		
		System.out.println("Inserting into SinglyLinkedList");
		list.insertIntoSinglyLinkedList(1, 0);
		list.insertIntoSinglyLinkedList(4, 4);
		list.insertIntoSinglyLinkedList(3, 2);
		list.printSinglyLinkedList();
		
		System.out.println("Deleting SinglyLinkedList");
		list.deleteSinglyLinkedList(3);
		list.printSinglyLinkedList();
		
		list.deleteEntireSinglyLinkedList();
		list.printSinglyLinkedList();
	}
}

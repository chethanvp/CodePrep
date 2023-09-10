public class DoublyLinkedList {

	Node head;
	Node tail;
	int size = 0;
	
	public void printDLL() {
		System.out.println();
		Node node = head;
		if(size == 0) {
			System.out.println("DLL is empty");
		}
		for(int  i=0; i<size; i++) {
			System.out.print(node.prev + " : " + node.value + " : " + node.next + (i >= size - 1 ? "" :  " -> "));
			node = node.next;
		}
		
		System.out.println();
	}
	
	public void printReverseDLL() {
		System.out.println();
		Node node = tail;
		for(int  i=0; i<size; i++) {
			System.out.print(node.prev + " : " + node.value + " : " + node.next + (i >= size - 1 ? "" :  " <- "));
			node = node.prev;
		}
		
		System.out.println();
	}
	
	public void createDLL(int nodeValue) {
		System.out.println("Creating DoublyLinkedList");
		Node node = new Node();
		node.value = nodeValue;
		node.next = node.prev = null;
		head = tail = node;
		size = 1;

		System.out.println("Size : " + size);
	}
	
	public void insertIntoDLL(int nodeValue, int position) {
		System.out.println("Inserting into DoublyLinkedList");
		Node node = new Node();
		node.value = nodeValue;
		if(head == null) {
			createDLL(nodeValue);
		}
		else if(position == 0) {
			node.next = head;
			node.prev = null;
			head.prev = node;
			head = node;
			size++;
		}
		else if(position >= size) {
			node.next = null;
			tail.next = node;
			node.prev = tail;
			tail = node;
			size++;
		}
		else {
			Node tempNode = head;
			for(int i=0; i<position-1; i++) {
				tempNode = tempNode.next;
			}
			
			node.next = tempNode.next;
			node.prev = tempNode;
			tempNode.next.prev = node;
			tempNode.next = node;
			size++;
		}

				System.out.println("Size : " + size);

	}
	
	public void deleteNodeInDLL(int position) {
		System.out.println();
		if(head == null) {
			System.out.println("DLL is already empty");
		}
		else if(position == 0) {
			System.err.println("Deleting starting node");
			if(size == 1) {
				head = tail = null;
			}
			else {
				head = head.next;
				head.prev = null;
			}
			size--;
		}
		else if(position >= size-1) {
			System.err.println("Deleting ending node");
			if(size == 1) {
				head = tail = null;
			}
			else {
				tail.prev.next = null;
				tail = tail.prev;
			}
			size--;
		}
		else {
			System.out.println("Deleting node in between");
			Node tempNode = head;
			for(int i=0; i< position-1; i++) {
				tempNode = tempNode.next;
			}

			tempNode.next = tempNode.next.next;
			tempNode.next.prev = tempNode;
			size--;
		}

				System.out.println("Size : " + size);

	}


	public void deleteAllDLL() {
		Node tempNode = head;
		for(int i=0; i<size; i++) {
			tempNode.prev = null;
			tempNode = tempNode.next;
		}
		head = tail = null;
		size = 0; 
		System.out.println("DLL Deleted Successfully");
	}
}

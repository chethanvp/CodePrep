public class Main {

	public static void main(String args[]) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.createDLL(1);
		list.printDLL();
		
		list.insertIntoDLL(0, 0);
		list.printDLL();
		
		list.insertIntoDLL(4, 4);
		list.insertIntoDLL(3, 3);
		list.printDLL();
		
		list.insertIntoDLL(2, 2);
		list.printDLL();
//		list.printReverseDLL();
		
		list.deleteNodeInDLL(5);
		list.printDLL();

		list.deleteAllDLL();
		list.printDLL();
	}
}

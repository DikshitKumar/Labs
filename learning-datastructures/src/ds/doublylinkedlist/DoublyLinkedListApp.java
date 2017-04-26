package ds.doublylinkedlist;

public class DoublyLinkedListApp {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.insertAtBeginning(10);
		list.insertAtBeginning(30);
		list.insertAtBeginning(50);
		list.insertAtEnd(20);
		list.insertAtEnd(40);
		list.insertAtEnd(60);
		list.displayForward();
		list.deleteAtEnd();
		list.deleteKey(20);
		list.displayForward();
		list.deleteAtBeginning();
		list.displayForward();
		list.insertAfter(30, 70);
		list.displayForward();
	}

}

package ds.linkedlist;

public class SinglyLinkedList {
	private Node first;
	private Node last;
	
	public SinglyLinkedList() {

	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	//Used to insert Node at beginning.
	public void insertAtBeginning(int data) {
		Node newNode = new Node();
		newNode.dataValue = data;
		if(isEmpty()){
			last = newNode;		
		}		
		newNode.nextNode = first;
		first = newNode;		
	}
	
	public Node deleteFromBeginning() {
		Node temp = first;
		first = last.nextNode;
		return temp;
	}
	
	public void displayList() {
		System.out.println("List (first --> last)");
		Node current = first;
		while (current != null) {
			current.displayNode();
			current = current.nextNode;
		}
		System.out.println(" ");
	}
	
	//Used to insert Node at end.
	public void insertAtEnd(int data) {
		//Node cuNode = last;
		//We need to traverse the list until nextNode value is null.
//		while (cuNode.nextNode != null) {
//			cuNode = cuNode.nextNode;
//		}
		Node newNode = new Node();
		newNode.dataValue = data;
		if(isEmpty()){
			first = newNode;
		}else {
			last.nextNode = newNode;
			last = newNode;
		}
	}

}

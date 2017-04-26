package ds.doublylinkedlist;

public class DoublyLinkedList {

	private Node first;
	private Node last;
	
	public DoublyLinkedList() {
		this.first = null;
		this.last = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertAtBeginning(int data) {
		Node newNode = new Node();
		newNode.dataValue = data;
		if(isEmpty()){
			last = newNode; //if there is not any node present then last node becomes added node.
		} else {
			first.previousNode = newNode;
		}
		
		newNode.nextNode = first;
		this.first = newNode;		
	}
	
	public void insertAtEnd(int data) {
		Node newNode = new Node();
		newNode.dataValue = data;
		if(isEmpty()){
			first = newNode;
		} else {
			last.nextNode = newNode; //assigning old last to newnode.
			newNode.previousNode = last; // the old last will be the new nodes previous.
		}		
		this.last = newNode;
	}
	
	public Node deleteAtBeginning() {
		Node temp = first;
		if(first.nextNode == null){
			last = null;
		} else {
			first.nextNode.previousNode = null;
		}
		first = first.nextNode;
		return temp;		
	}
	
	public Node deleteAtEnd() {
		Node temp = last;
		if(first.nextNode == null){ // we only have one node in list.
			first = null;
		} else {
			last.previousNode.nextNode = null;
		}
		last = last.previousNode;
		return temp;
	}
	
	public boolean insertAfter(int key, int data) {
		Node cuNode = first;
		while (cuNode.dataValue != key) {
			cuNode = cuNode.nextNode;
			if(cuNode == null){
				return false;
			}
		}		
		Node newNode = new Node();
		newNode.dataValue = data;
		
		if(cuNode == last){
			cuNode.nextNode = null;
			last = newNode;
		} else {
			newNode.nextNode = cuNode.nextNode;
			cuNode.nextNode.previousNode = newNode;
		}		
		newNode.previousNode = cuNode;
		cuNode.nextNode = newNode;
		
		return true;
	}
	
	public Node deleteKey(int key) {
		Node temp = first;
		while (temp.dataValue != key) {
			temp = temp.nextNode;
			if(temp == null){
				return null;
			}
		}
		if(temp == first){
			first = temp.nextNode;
		} else {
			temp.previousNode.nextNode = temp.nextNode;
		}
		
		return temp;
	}
	
	public void displayForward() {
		System.out.println("List (first --> last): ");
		Node cuNode =first;
		while (cuNode != null) {
			cuNode.displayNode();
			cuNode = cuNode.nextNode;
		}
		System.out.println(" ");
	}
	
	public void displayBackward() {
		System.out.println("List (last --> first): ");
		Node cuNode = last;
		while (cuNode != null) {
			cuNode.displayNode();
			cuNode = cuNode.previousNode;
		}
		System.out.println(" ");
	}
	
	
	
	
}

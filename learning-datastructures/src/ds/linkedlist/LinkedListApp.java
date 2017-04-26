package ds.linkedlist;

public class LinkedListApp {

	public static void main(String[] args) {
		
		SinglyLinkedList linkedList = new SinglyLinkedList();
		
		linkedList.insertAtBeginning(20);
		linkedList.insertAtBeginning(30);
		linkedList.insertAtBeginning(50);
		
		linkedList.insertAtEnd(96);
		
		linkedList.displayList();
		
/*		Node nodeA = new Node();
		nodeA.dataValue = 4;
		
		Node nodeB = new Node();
		nodeB.dataValue = 3;
		
		Node nodeC = new Node();
		nodeC.dataValue = 7;
		
		Node nodeD = new Node();
		nodeD.dataValue = 8;
		
		nodeA.nextNode = nodeB;
		nodeB.nextNode = nodeC;
		nodeC.nextNode = nodeD;
		
		System.out.println(listLength(nodeA));
		System.out.println(listLength(nodeB));*/
	}

	/*private static int listLength(Node aNode) {
		int length = 0;
		Node currNode = aNode;
		while(currNode != null){
			length++;
			currNode = currNode.nextNode;
		}		
		return length;
	}*/

}

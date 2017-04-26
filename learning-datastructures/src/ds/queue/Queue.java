package ds.queue;

public class Queue {

	private int maxSize;//used to initialize the Queue length.
	private long[] queArray;//used to store the data.
	private int front;//maintain the data position which are inserted.
	private int rear;//index position for element from back side.
	private int nItems;//Number of element present in queue.
	
	public Queue(int size) {
		this.maxSize = size;
		this.queArray = new long[maxSize];
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
	}
	
	public void insert(long element) {
		if(rear == maxSize-1){
			rear = -1;
		}
		rear++;
		queArray[rear] = element;
		nItems++;
	}
	
	public long remove() {
		long temp = queArray[front];
		front++;
		if(front == maxSize){
			front = 0;
		}
		nItems--;
		return temp;
	}
	
	public long peak() {
		return queArray[front];
	}
	
	public boolean isEmpty() {
		return (nItems == 0);
	}
	
	public boolean isFull() {
		return (nItems == maxSize);
	}
	
	public void view() {
		System.out.print("[ ");
		for (int i = 0; i < queArray.length; i++) {
			System.out.print(queArray[i]+" ");
		}
		System.out.print("]");
	}
	
	
}

package ds.queue;

public class QueueApp {

	public static void main(String [] args) {
		Queue newQueue = new Queue(5);
		newQueue.insert(10);
		newQueue.insert(20);
		newQueue.insert(30);
		newQueue.insert(40);
		newQueue.insert(50);
		newQueue.insert(60);
		newQueue.view();
	}
	
}

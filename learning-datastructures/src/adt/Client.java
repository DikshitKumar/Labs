package adt;

public class Client {

	public static void main(String[] args) {
		Counter count = new Counter("Counter 1");
		count.increment();
		count.getCurrentValue();
		System.out.println(count.toString());
	}

}

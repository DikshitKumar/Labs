package adt;

public class Counter {
	
	private int num=0;
	private String str=null;
	
	public Counter(String str) {
		this.str = str;
	}
	
	public void increment() {
		num++;
	}
	
	public int getCurrentValue() {
		return num;
	}

	@Override
	public String toString() {
		return "Counter [num=" + num + ", str=" + str + "]";
	}

	
}

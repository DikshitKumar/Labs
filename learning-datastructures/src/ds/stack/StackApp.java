package ds.stack;

public class StackApp {

	public static void main(String[] args) {
//		Stack myStack = new Stack(4);
//		
//		myStack.push(10);
//		myStack.push(20);
//		myStack.push(30);
//		myStack.push(40);
//		myStack.push(50);
//		
//		while (!myStack.isEmpty()) {
//			long value = myStack.pop();
//			System.out.println("Popped element : "+value);
//		}
		System.out.println(reverseString("Jai"));
		
	}
	
	public static String reverseString(String str) {
		String revStr = "";
		Stack myStack = new Stack(str.length());
		for(int i = 0;i<str.length();i++){
			char ch = str.charAt(i);
			myStack.push(ch);
		}
		
		while (!myStack.isEmpty()) {
			char value = myStack.pop();
			revStr += value;
		}
		return revStr;
	}

}

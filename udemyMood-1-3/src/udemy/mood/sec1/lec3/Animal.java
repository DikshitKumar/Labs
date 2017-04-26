package udemy.mood.sec1.lec3;

public class Animal {

	int age;
	String gender;
	int wightInlbs;
	
	public Animal(int age, String gender, int wightInlbs) {
		this.age = age;
		this.gender = gender;
		this.wightInlbs = wightInlbs;
	}
	
	public void eat() {
		System.out.println("Eating......");
	}
	
	public void sleep() {
		System.out.println("Sleeping...");
	}
	
}

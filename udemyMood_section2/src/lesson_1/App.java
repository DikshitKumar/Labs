package lesson_1;

public class App {

	public static void main(String[] args) {

		Vehicle myCar = new Vehicle();
		Vehicle myBike = new Vehicle();
		
		myCar.accelerate();//It sending message to Vehicle class to accelerate
		myBike.startEngine();
		
	}

}

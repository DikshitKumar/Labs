package lesson_1;

public class Driver {
	
	//here Driver class depends on the Vehicle class as it is used as parameter in drive method.
	// It is called dependency association.
	public void drive(Vehicle raceCar) {
		raceCar.accelerate();		
	}

}

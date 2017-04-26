package vehicleExample;

import userExample.User;

public class VehicleApp {
	
	public static void main(String[] args) {
		Vehicle myVehicle = new Vehicle.Builder()
							.price(50312.2)
							.type("car")
							.make("Maruti")
							.horsePower(250)
							.model("Accord")
							.color("brown")
							.doors(2)
							.build();
		System.out.println(myVehicle);
	}


}

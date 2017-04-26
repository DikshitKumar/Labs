
public class App {

	public static void main(String[] args) {
		VehicleFactory vf = new VehicleFactory();
		Vehicle vehicle = vf.getVehicle(vehicleType.Bus);
		vehicle.startEngine();
		
	}

}

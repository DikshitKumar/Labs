
public class VehicleFactory {
	public Vehicle getVehicle(vehicleType vehicleType) {		
		return vehicleType.getVehicle();
	}
}

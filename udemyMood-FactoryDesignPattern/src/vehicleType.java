
public enum vehicleType {
	Car{
		public Vehicle getVehicle() {
			return new Car();		
		}
	}, Bus{
		public Vehicle getVehicle() {
			return new Bus();		
		}
	}, Truck{
		public Vehicle getVehicle() {
			return new Truck();		
		}
	};
	
	abstract Vehicle getVehicle();

	
}

package lesson_5;

public class EmergencyRoomProcess {

	public static void main(String[] args) {
		HospitalManagement MD = new HospitalManagement();
		Employee dr = new Doctor(1, "shah", "emergency", true);
		MD.callUpon(dr);
		
		Employee nurse = new Nurse(2, "Marry", "emegency", true);
		MD.callUpon(nurse);
	}

}

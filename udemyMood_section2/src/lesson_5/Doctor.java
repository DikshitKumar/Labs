package lesson_5;

public class Doctor extends Employee {

	public Doctor(long id, String name, String department, boolean working) {
		super(id, name, department, working);
		System.out.println("Doctor in action...");
	}
	
	private void prescibeMedicine() {
		System.out.println("Prescibe Medicine..");
	}
	
	private void diagnosePatients() {
		System.out.println("Daignosing Patients..");
	}

	@Override
	public void performDuties() {
		prescibeMedicine();
		diagnosePatients();
	}

}

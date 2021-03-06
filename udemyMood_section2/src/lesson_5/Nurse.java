package lesson_5;

public class Nurse extends Employee {

	public Nurse(long id, String name, String department, boolean working) {
		super(id, name, department, working);
		System.out.println("Nurse in action...");
	}
	
	private void checkVitalSigns() {
		System.out.println("Checking Vitals..");
	}
	
	private void drawBlood() {
		System.out.println("Drawing Bloods..");
	}

	private void cleanPatientArea() {
		System.out.println("cleaning patient area..");
	}

	@Override
	public void performDuties() {
		checkVitalSigns();
		drawBlood();
		cleanPatientArea();
	}
}

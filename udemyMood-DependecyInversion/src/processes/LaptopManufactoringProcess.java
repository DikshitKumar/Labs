package processes;

public class LaptopManufactoringProcess extends GeneralManufactringProcess {

	public LaptopManufactoringProcess(String processName) {
		super(processName);
	}

	@Override
	public void assemble() {
		System.out.println("Assemble Laptop Device");

	}

	@Override
	public void testing() {
		System.out.println("Test Laptop Device");

	}

	@Override
	public void packaging() {
		System.out.println("Package Laptop Device");

	}

	@Override
	public void storage() {
		System.out.println("Storing Laptop Device");

	}

}

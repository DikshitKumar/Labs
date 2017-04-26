package processes;

public class SmartPhoneManufactoringProcess extends GeneralManufactringProcess {

	public SmartPhoneManufactoringProcess(String processName) {
		super(processName);
	}

	@Override
	public void assemble() {
		System.out.println("Assemble Smart Phone");
	}

	@Override
	public void testing() {
		System.out.println("Test Smart Phone");
	}

	@Override
	public void packaging() {
		System.out.println("Package Smart Phone");
	}

	@Override
	public void storage() {
		System.out.println("Storeing Smart Phone");
	}

}

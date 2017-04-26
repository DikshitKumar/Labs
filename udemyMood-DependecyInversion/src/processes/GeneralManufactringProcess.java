package processes;

public abstract class GeneralManufactringProcess {

	private String processName;
	
	public GeneralManufactringProcess(String processName) {
		this.processName = processName;
	}
//Template method design pattern
	public void lauchProcess(){
		if(processName !=null && !processName.isEmpty()){
			assemble();
			testing();
			packaging();
			storage();
		} else {
			System.out.println("process name is empty");
		}
	}
	
	protected abstract void assemble();
	protected abstract void testing();
	protected abstract void packaging();
	protected abstract void storage();
	
}

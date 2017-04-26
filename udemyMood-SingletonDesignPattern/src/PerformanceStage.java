
public class PerformanceStage {

	private static PerformanceStage INSTANCE = null;
	private static int counter;
	//Private Constructor for singleton.
	public PerformanceStage(){
		counter++;		
	};
	
	public static PerformanceStage  getInstance() {
		if(INSTANCE == null){
			INSTANCE = new PerformanceStage();
		}
		return INSTANCE;
	}
	
	public void turnOnLights() {
		System.out.println("Turning on lights...");
	}
	
	public int getCounter() {
		return counter;
	}
}


public class Application {

	public static void main(String[] args) {
		PerformanceStage stage = PerformanceStage.getInstance();
		
//		stage.turnOnLights();
//		System.out.println(stage.getCounter());
		
		PerformanceStage stage2 = new PerformanceStage();
		System.out.println(stage2.getCounter());
	}

}

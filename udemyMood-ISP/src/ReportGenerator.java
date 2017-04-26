
public class ReportGenerator {

	Reporting transactionObj;
	
	public void generateReport() {
		System.out.println(transactionObj.getName()+ " " +transactionObj.getProductBreakdown()+" "+transactionObj.getDate());
	}
}

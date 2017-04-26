package clients;
import observer.HRDepartment;
import observer.IObserver;
import observer.PayrollDepartment;
import subjects.EmployeeManagementSystem;
import domain.Employee;


public class App {
	
	public static void main(String [] args) {
		IObserver payroll = new PayrollDepartment();
		IObserver hrSystem = new HRDepartment();
		
		EmployeeManagementSystem ems = new EmployeeManagementSystem();
		
		ems.registerObserver(payroll);
		ems.registerObserver(hrSystem);
		
		//Employee NA = new Employee("NA", null, 8000, true);
		//ems.hireEmployee(NA);
		
		ems.modifyEmployeeName(3, "JB");
	}

}

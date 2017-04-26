package observer;

import domain.Employee;


public class PayrollDepartment implements IObserver {

	@Override
	public void callMe(Employee emp, String msg) {
		System.out.println("Payroll System Notified");
		System.out.println(msg+" "+emp.getName());
	}

}

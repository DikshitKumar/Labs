package subjects;
import java.util.ArrayList;
import java.util.List;

import observer.IObserver;
import domain.EmpDAO;
import domain.Employee;


public class EmployeeManagementSystem implements ISubject {
	
	private List<IObserver> observers;
	private List<Employee> employees;
	
	private EmpDAO empDAO;
	private Employee emp;
	private String msg;
	
	public EmployeeManagementSystem() {
		observers = new ArrayList<IObserver>();
		empDAO = new EmpDAO();
		employees = empDAO.generateEmployees();
	}

	@Override
	public void registerObserver(IObserver o) {
		observers.add(o);		
	}
	
	@Override
	public void removeObserver(IObserver o) {
		observers.remove(o);		
	}

	@Override
	public void notifyObserver() {
		for(IObserver departmets : observers){
			departmets.callMe(emp, msg);
		}
	}

	public void hireEmployee(Employee nA) {
		emp = nA;
		msg = "New Hire :";
		employees.add(nA);
		notifyObserver();
	}

	public void modifyEmployeeName(int id, String newName) {
		boolean notify = false;
		for (Employee emp:employees){
			if(id == emp.empId){
				emp.setName(newName);
				this.emp = emp;
				this.msg = "Employee Name has been Changed : ";
				notify = true;
			}
		}
		if(notify){
			notifyObserver();
		}
	}

	

}

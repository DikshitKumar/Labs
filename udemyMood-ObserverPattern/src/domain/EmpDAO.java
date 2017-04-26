package domain;
import java.util.ArrayList;
import java.util.List;


public class EmpDAO {
	Employee emp1 = new Employee("DJ", null, 6000, false);
	Employee emp2 = new Employee("BJ", null, 8000, false);
	Employee emp3 = new Employee("HA", null, 9000, false);
	
	List<Employee> employees;
	
	public List<Employee> generateEmployees() {
		employees = new ArrayList<Employee>();
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		
		return employees;
	}
	
	public void addEmployee(Employee emp) {
		employees.add(emp);
	}

}

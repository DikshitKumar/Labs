package com.einfo.udemy.client;

import com.einfo.udemy.dao.EmployeeDAO;
import com.einfo.udemy.model.Employee;
import com.einfo.udemy.report.EmployeeReportFormatter;
import com.einfo.udemy.report.FormatType;

public class ClientModule {

	public static void main(String[] args) {
		Employee emp = new Employee(1,"xyz","Dr",true);
		Employee emp1 = new Employee(2,"abc","staff",true);
		hireNewEmployee(emp);
		//terminateEmployee(emp1);
		printEmployeeReport(emp1,FormatType.XML);
		
	}
	
	public static void hireNewEmployee(Employee emp) {
		EmployeeDAO empDao = new EmployeeDAO();
		empDao.saveEmployee(emp);
	}
	
	public static void terminateEmployee(Employee emp) {
		EmployeeDAO empDao = new EmployeeDAO();
		empDao.deleteEmployee(emp);
	}
	
	public static void printEmployeeReport(Employee emp, FormatType formatType) {
		EmployeeReportFormatter formatter = new EmployeeReportFormatter(emp, formatType);
		
		System.out.println(formatter.getFormattedEmployee());
		
	}

}

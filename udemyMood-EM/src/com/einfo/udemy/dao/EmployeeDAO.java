package com.einfo.udemy.dao;

import com.einfo.udemy.model.Employee;

public class EmployeeDAO {

	public void saveEmployee(Employee emp){
		System.out.println("Employee saved into database..."+ emp);
	}
	
	public void deleteEmployee(Employee emp) {
		System.out.println("Employee Removed from database...." + emp);		
	}
}

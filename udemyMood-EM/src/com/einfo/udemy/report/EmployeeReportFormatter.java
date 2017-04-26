package com.einfo.udemy.report;

import com.einfo.udemy.model.Employee;

public class EmployeeReportFormatter extends ReportFormatter {
	
	public EmployeeReportFormatter(Employee emp, FormatType formatType) {
		super(emp, formatType);
	}
	
	public String getFormattedEmployee(){
		return getFormattedValue();
	}

}

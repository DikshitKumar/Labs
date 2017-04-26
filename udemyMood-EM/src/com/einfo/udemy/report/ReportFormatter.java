package com.einfo.udemy.report;

public class ReportFormatter {
	
	String formattedValue;
	
	public String getFormattedValue() {
		return formattedValue;
	}

	public ReportFormatter(Object obj,FormatType formatType){
		switch(formatType){
		case XML : 
				formattedValue =convertObjectToXML(obj);
				break;
		case CSV :
				formattedValue =convertObjectToCSV(obj);
				break;
		
		}
	}
	
	private String convertObjectToXML(Object obj) {		
		return "Object Converted to XML : <title>"+obj.toString()+"</title>";		
	}
	
	private String convertObjectToCSV(Object obj) {
		return "Object converted to CSV,,, "+obj.toString();
	}
	

}

package com.einfo.udemy.databse;

public class DatabaseConnectionmanager {
	
	public void getManagerInstance(){
		System.out.println("Instance is here");
	}
	
	public void connect() {
		System.out.println("database connected");
	}
	
	public void getConnectionObject() {
		System.out.println("Connection Object");		
	}
	
	public void disconnect() {
		System.out.println("database disconnected");
	}

}

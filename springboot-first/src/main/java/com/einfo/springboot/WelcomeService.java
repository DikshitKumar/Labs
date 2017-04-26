package com.einfo.springboot;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService {
	public String retrieveMessgae(){
		return "Service";
	}
}

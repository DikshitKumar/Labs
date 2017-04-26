package com.einfo.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@Autowired
	WelcomeService service;
	
	@RequestMapping("/Welcome")
	public String welcome() {
		return service.retrieveMessgae();
	}

}



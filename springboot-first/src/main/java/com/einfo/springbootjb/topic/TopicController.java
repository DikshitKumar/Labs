package com.einfo.springbootjb.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
							new Topic("001","SQL","databse"),
							new Topic("002","JAVA","language"));
	}

}

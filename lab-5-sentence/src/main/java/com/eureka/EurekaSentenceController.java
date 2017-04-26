package com.eureka;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurekaSentenceController {
	
	@Autowired LoadBalancerClient discoveryClient;

	@RequestMapping("/sentence")
	  public @ResponseBody String getSentence() {
	    return 
	      getWord("LAB-4-SUBJECT") + " "
	      + getWord("LAB-4-VERB") + " "
	      + getWord("LAB-4-ARTICLE") + " "
	      + getWord("LAB-4-ADJECTIVE") + " "
	      + getWord("LAB-4-NOUN") + "."
	      ;
	  }
	  
	  public String getWord(String service) {
	    ServiceInstance instance = discoveryClient.choose(service);
	    return (new RestTemplate()).getForObject(instance.getUri(),String.class);
	  }
}

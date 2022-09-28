package com.ishaq.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ishaq.microservices.limitsservice.bean.LimitConfiguration;

//Exposure to all service
@RestController
public class LimitsConfigurationController {
	
	@Autowired
	public Configuration configuration;
	//This annotation is used to map to Http Get Request
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfiguration() {
		return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
	}

}

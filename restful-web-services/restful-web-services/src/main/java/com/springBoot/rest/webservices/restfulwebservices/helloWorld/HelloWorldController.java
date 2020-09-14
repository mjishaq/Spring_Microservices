package com.springBoot.rest.webservices.restfulwebservices.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HelloWorldController {
	
	@GetMapping(path = "/hello-World")
	public String helloWorld()
	{
		return "Hello-World";
	}
	
	
	@GetMapping(path = "/hello-World-bean")
	public HelloWorldBean helloWorldBean()
	{
		return new HelloWorldBean("Hello-World");
	}
	
	@GetMapping(path = "/hello-World/path-variable/{name}")
	public HelloWorldBean helloWorldpathVariable(@PathVariable String name)
	{
		return new HelloWorldBean(String.format("Hello-World %s",name));
	}

}

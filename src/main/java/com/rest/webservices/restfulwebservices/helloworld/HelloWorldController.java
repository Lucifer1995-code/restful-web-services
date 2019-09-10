package com.rest.webservices.restfulwebservices.helloworld;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

//controller
@RestController
public class HelloWorldController {
	
	//Get
	//uri - /hello-world
	//method -"Hello-World"
	@GetMapping(path = "/hello-world")
	public String HelloWorld() {
		return "Hello-World";
	}
	
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloBean() {
		return new HelloWorldBean("hello world bean !!");
	}
	
	@GetMapping(path = "/hello-world/{name}")
	public HelloWorldBean helloPathvarable(@PathVariable String name) {
		return new HelloWorldBean(String.format("My Name is , %s", name));
	}

}

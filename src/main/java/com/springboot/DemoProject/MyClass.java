package com.springboot.DemoProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {

	@GetMapping("abc")
	public String sayHello() {
		return "Hello";
		
	}
	
}

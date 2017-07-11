package com.infotech.app.StudentSpringBootApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping(value="/")
	//@RequestMapping(value="/",method=RequestMethod.GET)
	public String hello(){
		return "Hello World!!";
	}
}

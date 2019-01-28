package com.delin.springboot.SpringBootDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 	//responseBody+Controller
@RequestMapping("/hello")
public class HelloController {
	//	/hello/index
	@GetMapping("/index")
	public String showIndex(){
		return "hello, springBoot";
	}
	
	
}

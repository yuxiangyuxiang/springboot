package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HellosController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		
		return "this is springboot hello world!";
	}
}

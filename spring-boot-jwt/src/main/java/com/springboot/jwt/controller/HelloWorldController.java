package com.springboot.jwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping({ "/hello" })
	public String firstPage() {
		return "Hello TestYantra Floks...";
	}
	
	@RequestMapping("/home")
	public String homePage() {
		return "This is the home url...";
	}
}

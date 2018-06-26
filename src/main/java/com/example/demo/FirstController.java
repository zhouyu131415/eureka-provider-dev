package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@RequestMapping(value = "/person/{personId}",  method = RequestMethod.GET)
	public String index() {
		return "test";
	}
}

package com.example.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/hello")
	public ResponseEntity<String> sayHello(@RequestParam("name") String name ) {
		return new ResponseEntity<String>("Hello, "+ name, HttpStatus.OK);
	}
	
}

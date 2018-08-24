package com.example.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	private static final Logger LOGGER = LoggerFactory.getLogger(SampleController.class);
	
	@GetMapping("/hello")
	public ResponseEntity<String> sayHello(@RequestParam("name") String name ) {
		LOGGER.info("Request Parametere is {}", name);
		return new ResponseEntity<String>("Hello, "+ name, HttpStatus.OK);
	}
	
	@GetMapping("/helloNew")
	public ResponseEntity<String> sayHelloNew(@RequestParam("name") String name ) {
		LOGGER.info("Request Parametere is {}", name);
		return new ResponseEntity<String>("Hello, "+ name + ". How are you?", HttpStatus.OK);
	}
	
}

package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired 
	CustomerService customerService;
	
	@GetMapping( value = "/subscribe")
	public ResponseEntity<String>  receive() {
		String result = customerService.getMessage();
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}

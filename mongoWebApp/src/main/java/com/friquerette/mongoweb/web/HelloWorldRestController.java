package com.friquerette.mongoweb.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.friquerette.mongoweb.entity.Customer;

@RestController
public class HelloWorldRestController {

	@RequestMapping(value = "/user", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Customer> getUser() {
		System.out.println("Fetching Customer with id ");
		Customer customer = new Customer("Franck", "Martin");
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}

	@RequestMapping(value = "/user/{firstname}/{lastname}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Customer> createUser(//
			@PathVariable("firstname") String firstname, //
			@PathVariable("lastname") String lastname) {
		System.out.println("Fetching Customer with id ");
		Customer customer = new Customer(firstname, lastname);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
}

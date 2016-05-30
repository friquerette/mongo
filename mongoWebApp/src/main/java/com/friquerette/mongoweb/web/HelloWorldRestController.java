package com.friquerette.mongoweb.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.friquerette.mongoweb.entity.User;

@RestController
public class HelloWorldRestController {

	@RequestMapping(value = "/user", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> getUser() {
		System.out.println("Fetching User with id ");
		User user = new User(1l, "Franck", 34, 1500d);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
}

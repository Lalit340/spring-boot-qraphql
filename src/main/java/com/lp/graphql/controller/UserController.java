package com.lp.graphql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lp.graphql.dto.CreateUserDto;
import com.lp.graphql.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping
	public ResponseEntity<String> createUser(@RequestBody CreateUserDto createUserDto) {
		String response = userService.createUser(createUserDto);
		System.out.println("hii");
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
	
	@PostMapping("/addaddress")
	public ResponseEntity<String> addAddressToUser(@RequestParam int userId,@RequestParam int addressId) {
		String response = userService.addAddressToUser(userId, addressId);
		return new ResponseEntity<String>(response,HttpStatus.OK);
	}

}

package com.irctc.rail.connect.controller;



import org.apache.logging.log4j.Logger;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.irctc.rail.connect.User;
import com.irctc.rail.connect.service.IrctcService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/irctc")
@Validated
public class IrctcController {
	
	private static final Logger LOGGER=LogManager.getLogger(IrctcController.class);
	
	@Autowired
	IrctcService irctcService;
	
	@PostMapping("/registerUser")
	public String registerUser(@RequestBody @Valid  User registerUser) {
		return irctcService.registerUser(registerUser);
	}
	
	@GetMapping("/fetchUserDetails")
	public User fetchUserDetails(@RequestParam int userId) {
		LOGGER.info("FETCH USER FROM PG ADMIN");
		return	irctcService.fetchUserDetails(userId);		
	}
	
	@PostMapping("/loginUser")
	public String loginUser(@RequestBody User user)  {
		return irctcService.loginUser(user);		
	}
	
	@PostMapping("/sendMail")
	public String sendMail() {
		return irctcService.sendMail();
	}

}

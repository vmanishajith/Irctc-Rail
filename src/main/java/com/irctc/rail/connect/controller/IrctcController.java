package com.irctc.rail.connect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irctc.rail.connect.User;
import com.irctc.rail.connect.repository.IrctcRepository;
import com.irctc.rail.connect.service.IrctcService;

@RestController
@RequestMapping("/irctc")
public class IrctcController {
	
	
	
	@Autowired
	IrctcService irctcService;
	
	@GetMapping("/validateLogin")
	public boolean validateLogin() {
		
		return false;
	}
	
	@PostMapping("/saveUserLogin")
	public String saveUserLogin(@RequestBody User saveUser) {
		return irctcService.saveUserLogin(saveUser);
	}

}
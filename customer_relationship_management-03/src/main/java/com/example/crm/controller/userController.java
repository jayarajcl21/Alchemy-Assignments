package com.example.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.crm.entity.userLogin;
import com.example.crm.entity.userRegistration;
import com.example.crm.service.userService;

public class userController {

	
	
	@Autowired
	private userService userservice  ;
	@PostMapping("/save")
	public String saveBuyer(@RequestBody userRegistration user) {
		return userservice.saveRegistration(user);
	}
	
	@PostMapping("/login")
	public String loginBuyer(@RequestBody userLogin login) {
		return userservice.loginuser(login);
	}
}

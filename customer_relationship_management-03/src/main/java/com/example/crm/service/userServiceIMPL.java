package com.example.crm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crm.entity.userLogin;
import com.example.crm.entity.userRegistration;
import com.example.crm.repo.UserRegistrationRepo;

@Service
public class userServiceIMPL implements userService{
	@Autowired
	private UserRegistrationRepo userRepo;

	@Override
	public String saveRegistration(userRegistration user) {
		
		userRegistration u1= userRepo.findByEmail(user.getEmail());
		if(u1 == null) {
		userRepo.save(user);
		return "success";
		}
		return "already registered";
	}


	@Override
	public String loginuser(userLogin login) {
		userRegistration u2=userRepo.findByEmail(login.getEmail());
		if(u2 == null ) {
			return"not registered";
		}
		if(u2.getPassword().equals(u2.getPassword())) {
			return "logged in";
			
		}
		return "login failed";
	}
	
	


}
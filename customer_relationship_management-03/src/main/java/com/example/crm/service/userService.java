package com.example.crm.service;

import com.example.crm.entity.userLogin;
import com.example.crm.entity.userRegistration;

public interface userService {

	public String saveRegistration(userRegistration user);
	
	public String loginuser(userLogin login);
//

}

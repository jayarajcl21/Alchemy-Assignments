package com.example.crm.entity;

public class userLogin {

	private String email;
	private String password;
	public userLogin(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public userLogin() {
		super();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//userlogin
}

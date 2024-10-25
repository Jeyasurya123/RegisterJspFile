package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class Alien {
	private String email;
	private String password;
	private String repassword;
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
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	@Override
	public String toString() {
		return "Alien [email=" + email + ", password=" + password + ", repassword=" + repassword + "]";
	}
	
	
}

package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {

	@RequestMapping("/")
	public String register()
	{
		return "index";		
	}
	
	@GetMapping("addAlien")
	public ModelAndView addAlien(String email,String psw,String repeat,ModelAndView m)
	{
		Alien alien=new Alien();
		alien.setEmail(email);
		alien.setPassword(psw);
		alien.setRepassword(repeat);
		
		m.addObject("alien", alien);
		
		m.setViewName("index1");
		
		return m;
	}
}

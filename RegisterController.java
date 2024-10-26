package com.example.demo;

import java.util.HashSet;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
	
	HashSet<Alien> setalien=new HashSet<Alien>();

	@GetMapping("/")
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
		
		setalien.add(alien);
		m.addObject("alien", alien);
		
		m.setViewName("index1");
		
		return m;
	}
	
	 @PostMapping("/loginAlien1")
	    public ModelAndView loginAlien(String uname, String psw,ModelAndView m) {
	        Optional<Alien> check=setalien.stream().filter(e->e.getEmail().equals(uname)&&e.getPassword().equals(psw)).findAny();
	        if(check.isPresent())
	        {
	        	   m.setViewName("index2");
	        }
	        else {
	        		m.setViewName("index3");
	        }
	        return m;
	    }
}

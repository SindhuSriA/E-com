package com.stackshop.controller;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.stackshop.model.*;
import com.stackshop.service.*;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MyController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String getLogin() {
		return "login";
	}
	
	@GetMapping("/register")
	public String register(){
		//model.addAttribute("user", new UserModel());
		return "register";
	}
	
	@PostMapping("/save")
	public String save(ModelMap model, UserModel user) {
		System.out.println(user.toString());
		UserModel userNew =  userService.saveUser(user);
		if (userNew != null) {
			model.addAttribute("user", userNew);
			model.addAttribute("msg", "Successfully Registered");
		}
		
		System.out.println(userNew.toString());
		return "register";
	}
	

}

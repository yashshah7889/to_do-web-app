package com.webapplication.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.webapplication.login.UserValidation;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	@Autowired
	UserValidation service;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String name,@RequestParam String password, ModelMap model) {
		if(!service.isUserValid(name, password)) {
			model.put("error_message", "INVALID CREDENTIALS!!");
			return "login";
		}
		
		model.put("name", name);
		model.put("password",password);	
		return "welcome";
		
		
	}
}

package com.webapplication.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.webapplication.login.UserValidation;

@Controller
public class LoginController {
	
	UserValidation service= new UserValidation();
	
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

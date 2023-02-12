package com.webapplication.todo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.webapplication.login.UserValidation;

@Controller
public class TodoController {
	
	@Autowired
	TodoService service;
	
	@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
	
		model.addAttribute("todos",service.retrieveTodos("in28Minutes"));
		return "list-todos";
	}
	
	
	@RequestMapping(value = "/add-todo", method = RequestMethod.GET)
	public String showTodoPage() {
		return "todo";
	}
	
	@RequestMapping(value = "/add-todo", method = RequestMethod.POST)
	public String addTodo(ModelMap model, @RequestParam String desc) {
		service.addTodo("yash", desc, new Date(), false);
		model.clear();
		return "redirect:list-todos";
	}
	
}

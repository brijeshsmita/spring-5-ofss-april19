package com.mahendra.demojsp;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
//Store attribute "msg" is session and others in 
//request scope
@SessionAttributes("msg")
public class HomeController {
	
	@RequestMapping("/")
	public String doSomething(Map<String,Object> map) {
		map.put("msg","Welcome to Spring Boot MVC Project");
		map.put("author", "Mahendra Shinde");
		return "hello"; //Logical VIEW name	
	}
	
	@RequestMapping(value="/product")
	public String doSomething2(@RequestParam Integer id, Model map) {
		map.addAttribute("msg","Product ID "+id+" not found!");
		return "hello";
	}
}

package com.mahendra.demojsp;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class UserRegistrationController {

	@GetMapping
	// Earlier Version
	// @RequestMapping(method=RequestMethod.GET)
	public String showForm(Model map) {
		map.addAttribute("user",new User());
		return "form";
	}
	@PostMapping
	// Earlier Version
	// @RequestMapping(method=RequestMethod.POST)
	public String submitForm(@Valid @ModelAttribute("user") User user,
				BindingResult result,
				Model map) {
		
		// validator.validate(user,result);
		if(result.hasErrors()) {
			return "form";//Go back to FORM incase of error!
		}
		map.addAttribute("msg","Registration was successful!");
		return "success";
	}
}

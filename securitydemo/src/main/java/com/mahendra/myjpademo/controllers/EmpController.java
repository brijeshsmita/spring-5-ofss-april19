package com.mahendra.myjpademo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmpController {

	@GetMapping
	public String admin() {
		return "Welcome employee";
	}
}

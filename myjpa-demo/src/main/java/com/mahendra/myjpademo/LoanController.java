package com.mahendra.myjpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loans")
public class LoanController {
	@Autowired private LoanService service;
	
	@GetMapping
	public Loan findLoan(@RequestParam String acc) {
		return service.findByAccountNumber(acc);
	}
	
	
}

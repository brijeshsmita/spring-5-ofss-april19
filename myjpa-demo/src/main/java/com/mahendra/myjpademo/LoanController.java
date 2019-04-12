package com.mahendra.myjpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loans")
public class LoanController {
	@Autowired private LoanService service;
	
	@GetMapping(produces= {"application/json","application/xml"})
	public ResponseEntity<Loan> findLoan(@RequestParam String acc) {
		return new ResponseEntity<>(service.findByAccountNumber(acc),HttpStatus.OK);
	}
	
	@PostMapping(consumes= {"application/json"})
	public ResponseEntity<String> create(@RequestBody Loan acc){
		try {
		service.save(acc);
		return new ResponseEntity<>("Success",HttpStatus.OK);
		}catch(Exception ex) {
			return new ResponseEntity<>("Failed",HttpStatus.CONFLICT);
		}
	}
	
	
}

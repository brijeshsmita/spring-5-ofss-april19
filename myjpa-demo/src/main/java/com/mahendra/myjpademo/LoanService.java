package com.mahendra.myjpademo;

import java.util.*;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanService {

	@Autowired private LoanRepository repository;
	
	@PostConstruct
	public void init() {
		repository.save(new Loan("123333","Rahul",new Date(),60,400000D));
		
		
	}
	
	public void save(Loan loan) {
		repository.save(loan);
	}
	
	public Loan findByAccountNumber(String acc) {
		Optional<Loan> loan= repository.findById(acc);
		if(! loan.isPresent()) {
			throw new RuntimeException("Loan not found!");
		}
		return loan.get();
	}
}

package com.example.restcontroller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.AccountEntity;
import com.example.service.AccountService;

@RestController
public class AccountController {
	
	private AccountService  accService;

	public AccountController(AccountService accService) {
		
		this.accService = accService;
	}
	
	@PostMapping("/createAccount")
	public void createAccount(AccountEntity account) {
		this.accService.createAccount(account);
		
	}
	
	

}

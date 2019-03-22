package com.qa.example.restcontroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;

import org.springframework.http.HttpMethod;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.example.entities.AccountEntity;
import com.qa.example.service.AccountService;
import com.qa.example.entities.Account;

@RestController
public class AccountController {

	private AccountService accService;

	public AccountController(AccountService accService) {

		this.accService = accService;
	}

	@Autowired
	RestTemplateBuilder restTemplate;

	@PostMapping("/createAccount")
	public void createAccount(@RequestBody AccountEntity account) {
		this.accService.createAccount(account);
	}
	
	

	@PostMapping("template/prizes")
	public String accountApi(@RequestBody AccountEntity account) {
		return restTemplate.build().exchange("http://localhost:8883/", HttpMethod.POST,
				new HttpEntity<AccountEntity>(account, null), String.class).getBody();
	}
	
	@GetMapping("template/generateNumber")
	public String accountApiGet() {
		return restTemplate.build().exchange("http://localhost:8882/genNumber", HttpMethod.GET,
				null, String.class).getBody();
	}

}

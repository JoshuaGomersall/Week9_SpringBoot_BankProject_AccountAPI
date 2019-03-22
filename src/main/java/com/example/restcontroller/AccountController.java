package com.example.restcontroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;

import org.springframework.http.HttpMethod;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.entities.AccountEntity;
import com.example.service.AccountService;

@RestController
public class AccountController {

	
	private AccountService accService;
	
	private RestTemplate restTemplate;

	@Autowired
	public AccountController(AccountService accService, RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
		this.accService = accService;
	}

	@PostMapping("template/prizes")
	public String accountApi(@RequestBody AccountEntity account) {
		return restTemplate.exchange("http://localhost:8883/", HttpMethod.POST,
				new HttpEntity<AccountEntity>(account, null), String.class).getBody();
	}

	@GetMapping("template/generateNumber")
	public String accountApiGet() {
		return restTemplate.exchange("http://localhost:8882/genNumber", HttpMethod.GET,
				null, String.class).getBody();
	}
	
	@PostMapping("/createAccount")
	public String createAccount(@RequestBody AccountEntity account) {
		this.accService.createAccount(account);
		return "Success";

	}

}

package com.example.restcontroller;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.entities.AccountEntity;
import com.example.service.AccountService;

@RestController
public class AccountController {

	private AccountService accService;

	public AccountController(AccountService accService) {

		this.accService = accService;
	}

	@Autowired
	RestTemplateBuilder restTemplate;

	@PostMapping("/createAccount")
	public void createAccount(AccountEntity account) {
		this.accService.createAccount(account);

	}

	@PostMapping("template/createAccount")
	public String AccountApi(@RequestBody AccountEntity account) {
		return restTemplate.build().exchange("http://localhost:8883/", HttpMethod.POST,
				new HttpEntity<AccountEntity>(account, null), String.class).getBody();
	}
	
	@PostMapping("template/generateNumber")
	public String AccountApiGet(@RequestBody AccountEntity account) {
		return restTemplate.build().exchange("http://localhost:8882/", HttpMethod.GET,
				null, String.class).getBody();
	}

}

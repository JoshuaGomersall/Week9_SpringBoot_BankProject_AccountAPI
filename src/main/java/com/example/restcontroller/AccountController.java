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
	
	private AccountService  accService;

	public AccountController(AccountService accService) {
		
		this.accService = accService;
	}
	
	@PostMapping("/createAccount")
	public void createAccount(AccountEntity account) {
		this.accService.createAccount(account);
		
	}
	  @Autowired
	   RestTemplateBuilder restTemplate;

	
	  @RequestMapping(value = "template/createAccount", method = RequestMethod.POST)
	   public String AccountApi(@RequestBody AccountEntity account) {
	      HttpEntity<AccountEntity> entity = new HttpEntity<AccountEntity>(account,null);
	      
	      return restTemplate.build().exchange(
	         "http://localhost:8883/", HttpMethod.POST, entity , String.class).getBody();
	   
	      
	  }
	 
	  @RequestMapping(value = "template/createAccount", method = RequestMethod.POST)
	   public String createProducts(@RequestBody AccountEntity account) {
	      HttpEntity<AccountEntity> entity = new HttpEntity<AccountEntity>(account,null);
	      
	      return restTemplate.build().exchange(
	         "http://localhost:8882/", HttpMethod.GET, entity , String.class).getBody();
	   
	  }
	

}

package com.qa.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.qa.example.entities.Account;
import com.qa.example.entities.AccountEntity;
import com.qa.example.repo.AccountRepo;

@Service
public class AccountService {

	private AccountRepo accRepo;
	
	@Autowired
	JmsTemplate jmsTemplate;
	
	public AccountService(AccountRepo accRepo) {
		this.accRepo = accRepo;
	}
	
	public void createAccount(AccountEntity account) {
		this.accRepo.save(account);
		Account sendAccount = new Account(account.getId(),account.getForeName(),account.getFamilyName(),account.getAccNumber());
        jmsTemplate.convertAndSend("MY shit", sendAccount);
	}
	
}

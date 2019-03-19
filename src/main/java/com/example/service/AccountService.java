package com.example.service;

import org.springframework.stereotype.Service;

import com.example.entities.AccountEntity;
import com.example.repo.AccountRepo;

@Service
public class AccountService {

	private AccountRepo accRepo;
	
	
	public AccountService(AccountRepo accRepo) {
		this.accRepo = accRepo;
	}
	
	public void createAccount(AccountEntity account) {
		this.accRepo.save(account);
	}
	
}

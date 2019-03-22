package com.qa.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.example.entities.AccountEntity;

@Repository
public interface AccountRepo extends JpaRepository<AccountEntity, Long>{
	
}

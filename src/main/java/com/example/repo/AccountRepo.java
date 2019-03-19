package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.AccountEntity;

@Repository
public interface AccountRepo extends JpaRepository<AccountEntity, Long>{
	
}

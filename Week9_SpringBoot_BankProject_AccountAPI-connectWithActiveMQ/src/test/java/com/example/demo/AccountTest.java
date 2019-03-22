package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.example.ProjechtApplication;
import com.qa.example.entities.Account;
import com.qa.example.entities.AccountEntity;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=ProjechtApplication.class)
public class AccountTest {
	
	@Test
	public void setterTest() {
		Account acc = new Account(1L,"a","a","a");
		acc.setAccNumber("a");
		assertEquals(acc.getAccNumber(),"a");
		acc.setForeName("a");
		assertEquals(acc.getForeName(),"a");
		acc.setFamilyName("a");
		assertEquals(acc.getFamilyName(),"a");
		assertEquals("AccountEntity [id=1, foreName=, familyName=, accNumber=a]",acc.toString());
	}

}

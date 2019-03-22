package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.example.ProjechtApplication;
import com.qa.example.entities.AccountEntity;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=ProjechtApplication.class)
public class EntityTest {
	
	@Test
	public void setterTest() {
		AccountEntity acc = new AccountEntity();
		acc.setAccNumber("a");
		assertEquals(acc.getAccNumber(),"a");
		acc.setForeName("a");
		assertEquals(acc.getForeName(),"a");
		acc.setFamilyName("a");
		assertEquals(acc.getFamilyName(),"a");
		assertEquals("AccountEntity [id=0, foreName=, familyName=, accNumber=a]",acc.toString());
	}

}

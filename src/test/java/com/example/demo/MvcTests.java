package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import java.net.URI;

import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.example.entities.AccountEntity;
import com.example.repo.AccountRepo;
import com.example.restcontroller.AccountController;
import com.example.service.AccountService;

@RunWith(SpringRunner.class)
@WebMvcTest(AccountController.class)
@AutoConfigureMockMvc
@SpringBootTest
public class MvcTests {
	private MockMvc mockMvc;
	
	@Autowired
	private AccountRepo repoMan;

	@MockBean
	AccountService service;
	@MockBean
	RestTemplateBuilder restTemplateBuilder;

	private static final String MOCK_FNAME = "Joe";
	private static final String MOCK_LNAME = "Cur";
	private static final AccountEntity ent = new AccountEntity(MOCK_FNAME, MOCK_LNAME);
//		private static final String MOCK_ACCNUM = "b123456";

	private static final URI MOCK_HOST = null;

	private static final ResponseEntity<String> MOCK_ACCENT = null;

	@Before(value = "")
	public void setup() {
		// MOCK_HTTPGET = Mockito.mock(HttpGet.class);

	}

	@Test
	public void contextLoads() {

	}

	@Test
	public void testCreateAccountAPI() {

		Mockito.when(service.createAccount(ent)).thenReturn("Success");
//		assertEquals("Success", accroller.createAccount(ent));

	}

	@Test
	public void testAccountGetAPI() {
		/*
		when(restTemplateBuilder.build().exchange(MOCK_HOST, HttpMethod.GET, null, String.class))
				.thenReturn(MOCK_ACCENT);
		mockMvc.perform(get("/generateNumber")).andExpect(content().String("1234"));
			Mockito.when(accroller.accountApiGet()).thenReturn(MOCK_ACCNUM);
		assertEquals(MOCK_ACCENT, accroller.accountApiGet());
		 Mockito.verify(accroller).accountApiGet();
		*/

	}

}

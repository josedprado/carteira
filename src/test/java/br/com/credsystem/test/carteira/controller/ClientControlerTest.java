package br.com.credsystem.test.carteira.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
//@AutoConfigureMockMvc
public class ClientControlerTest {

	@Autowired
	private MockMvc mvc;

	//@Test
	public void listAllClient() throws Exception {
		mvc.perform( MockMvcRequestBuilders
			      .get("/client/all")
			      .accept(MediaType.APPLICATION_JSON))
			      .andExpect(status().isOk());
	}
	
	//@Test
	public void listClient() throws Exception {
		mvc.perform( MockMvcRequestBuilders
			      .get("/client/{clientId}",1)
			      .accept(MediaType.APPLICATION_JSON))
			      .andExpect(status().isOk());
	}
	
}

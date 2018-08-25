package com.example.demo.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(SampleController.class)
public class SampleControllerTest {

	@Autowired
	private MockMvc mvc;

	@Test
	public void testSayHello() throws Exception {
		mvc.perform(get("/hello?name=Priyesh").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(content().string("Hello, Priyesh"));
	}
	
	@Test
	public void testSayHelloNew() throws Exception {
		mvc.perform(get("/helloNewWorld?firstName=Priyesh").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(content().string("Hello, Priyesh. How are you?"));
	}
	
	@Test
	public void testSayJenkins() throws Exception {
		mvc.perform(get("/helloJenkins?name=Priyesh").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(content().string("Hello From Jenkins, Priyesh. How are you?"));
	}

}

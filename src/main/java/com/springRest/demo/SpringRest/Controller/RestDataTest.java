package com.springRest.demo.SpringRest.Controller;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.springRest.demo.SpringRest.service.RestServiceEnd;


public class RestDataTest {
	@Autowired
	private MockMvc mvc;

	@MockBean
	private RestServiceEnd restServiceEnd;
	@MockBean
	private RestData restdata;

	@Before
	public void steUP() {
		
	}

	@Test
	public void testGetNthFibonacci() throws Exception {
		
		when(restServiceEnd.getNthFebbonic(10L)).thenReturn(55);
		mvc.perform(get("api//Fibonacci")
				.requestAttr("n", 10)
				.contentType("Long"))
		.andExpect(status().isOk())
		.andExpect(content().contentType("application/json;charset=UTF-8"))
		.andExpect(header().string("pragma", "no-cashe"))
		.andDo(print());
//		
		
	}

	@Test
	public void testGetReverse() throws Exception{
		fail("Not yet implemented");
	}

	@Test
	public void testGetTriangle() throws Exception {
		fail("Not yet implemented");
	}

	@Test
	public void testMakeOneArray() throws Exception{
		fail("Not yet implemented");
	}

}

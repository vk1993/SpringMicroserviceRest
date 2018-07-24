package com.springRest.demo.springRest.ControllerTest;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.springRest.demo.SpringRest.Controller.RestData;
import com.springRest.demo.SpringRest.service.RestServiceEnd;

@RunWith(SpringJUnit4ClassRunner.class)
public class RestDataTest {

	
	private MockMvc mvc;

	@MockBean
	private RestServiceEnd restServiceEnd;

	@InjectMocks
	private RestData restdata;

	@Before
	public void steUP() throws Exception {
		mvc = MockMvcBuilders.standaloneSetup(restdata).build();
	}

	@Test
	public void testGetNthFibonacci() throws Exception {

//		//when(restServiceEnd.getNthFebbonic(10L)).thenReturn(55);
//
//		mvc.perform(get("/api/Fibonacci?n=10")).andExpect(status().isOk())
//				.andExpect(content().contentType("application/json;charset=UTF-8"))
//				.andExpect(header().string("pragma", "no-cashe"))
//				.andExpect(content().json(AbstractRestControllerTest.asJsonString(55)));
		fail("Not yet implemented");

	}

	@Test
	public void testGetReverse() throws Exception {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTriangle() throws Exception {
		fail("Not yet implemented");
	}

	@Test
	public void testMakeOneArray() throws Exception {
		fail("Not yet implemented");
	}

}

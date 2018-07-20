package com.springRest.demo.springRest.AssignmentTest;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.configuration.MockAnnotationProcessor;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.springRest.demo.SpringRest.Controller.RestData;
import com.springRest.demo.SpringRest.service.RestServiceEnd;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestDataTest {
	
	@Mock
	private RestServiceEnd restServiceEnd;
	@MockBean
	private RestData restData;
	

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		MockMvcBuilders.standaloneSetup(restData).build();
	}

	@Test
	public void testGetNthFibonacci() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetReverse() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTriangle() {
		fail("Not yet implemented");
	}

	@Test
	public void testMakeOneArray() {
		fail("Not yet implemented");
	}

}

	



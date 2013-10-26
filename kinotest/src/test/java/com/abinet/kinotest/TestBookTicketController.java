package com.abinet.kinotest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={WebConfig.class})
@WebAppConfiguration
public class TestBookTicketController {
	@Autowired
    WebApplicationContext wac;

    MockMvc mockMvc;
    
    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).dispatchOptions(true).build();
    }	
    
	@Test
	public void testAll() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/booking")).andExpect(MockMvcResultMatchers.status().isOk());
	}
}

package com.ksj.controller;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.ksj.model.SampleVO;

@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
	})
public class RestSampleControllerTests {
	@Autowired
	private WebApplicationContext ctx;
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	@Test
	public void testConvert() throws Exception{
			SampleVO sv = new SampleVO();
			sv.setMno(1);
			sv.setFirstname("길동");
			sv.setLastname("홍");
			
	//		String jsonStr = new Gson().toJson(sv);
			
	//		Logger.getLogger(jsonStr);
			
	//		mockMvc.perform(post("/sample/memberRequestBody").contentType(MediaType.APP))
	//														.content(jsonStr)		
	//														.andExpect(status().is(200))		
			
	}
	
	
}

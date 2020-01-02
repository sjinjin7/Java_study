package com.ksj.controller;



import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



import com.ksj.model.ReplyVO;
import com.ksj.service.ReplyService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class ReplyServiceMapperTest {

	@Autowired
	private ReplyService rbservice;
	
	/*	@Test
		public void testreptrepService() throws Exception {
			ReplyVO rv	= new ReplyVO();
			rv.setBno(1);
			rv.setReplytext("댓글입니다.");
			rv.setReplyer("관리자");
			
	rbservice.RepWrite(rv);
	
	
			
		}
	
		@Test
		public void testrepServiceUp() throws Exception {
			ReplyVO rv	= new ReplyVO();
			
			rv.setReplytext("댓글수정합니다.");
			rv.setRno(1);
			
			rbservice.RepModify(rv);
	
	
			
		}*/
	/*@Test
	public void testrepServiceSe() throws Exception {
		ReplyVO rv	= new ReplyVO();
		
		rv.setBno(1);
		
		rbservice.RepList(rv);


		
	}*/
	
	/*@Test
	public void testrepServiceDel() throws Exception {
		ReplyVO rv	= new ReplyVO();
		
		rv.setRno(2);
		
		rbservice.RepDel(rv);


		
	}*/
	
	
}

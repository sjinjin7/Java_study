package com.ksj.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ksj.model.Criteria;
import com.ksj.model.PageVO;
import com.ksj.model.ReplyVO;
import com.ksj.service.ReplyService;

@RestController
@RequestMapping("/replies")
public class ReplyController {

	@Autowired
	private ReplyService reservice;
	
	private static final Logger logger = LoggerFactory.getLogger(ReplyController.class);
	
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public ResponseEntity<String> register(@RequestBody ReplyVO vo){
		
		logger.info("ReplyVO : " + vo);
		ResponseEntity<String> entity = null;
		try {
			reservice.RepWrite(vo);
			entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		} catch(Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		
		return entity;
	}
	
	// 댓글 리스트보기(페이징 x)
	@RequestMapping(value="/all/{bno}", method=RequestMethod.GET)
	public ResponseEntity<List<ReplyVO>> list(@PathVariable("bno") int bno){
		logger.info("ReplyVO : " + bno);
		ResponseEntity<List<ReplyVO>>entity=null;
		try {
			entity = new ResponseEntity<List<ReplyVO>>(reservice.RepList(bno),HttpStatus.OK); 
		}catch(Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<List<ReplyVO>>(HttpStatus.BAD_REQUEST);
		}
		
		return entity;
		
	}
	
	// 댓글 리스트보기(페이징 o)
		@RequestMapping(value="/{bno}/{page}", method=RequestMethod.GET)
		public ResponseEntity<Map<String,Object>> listPage(
				@PathVariable("bno") int bno,
				@PathVariable("page") int page){
			
			logger.info("ReplyVO : " + bno);
			logger.info("ReplyVO : " + page);
			ResponseEntity<Map<String,Object>> entity = null;
			try {
				Criteria cri = new Criteria();//페이징에 필요한 페이지 번호와, 한 페이지당 리스트 갯수,
				cri.setPageNum(page);
				
				int cnt = reservice.RepCount(bno);
				PageVO pv = new PageVO(cri, cnt);
				
				
				Map<String, Object> map = new HashMap<String, Object>();
				List<ReplyVO> list = reservice.ReplistPage(bno, cri);
				
				map.put("list",  list);// 게시판 리스트
				map.put("pv", pv);// 페이징 관련
				
				entity = new ResponseEntity<Map<String,Object>>(map,HttpStatus.OK);
			} catch(Exception e) {
				e.printStackTrace();
				entity = new ResponseEntity<Map<String,Object>>(HttpStatus.BAD_REQUEST);
			}
			return entity;
		}

	
	
	
	@RequestMapping(value="/{rno}", method= {RequestMethod.PUT, RequestMethod.PATCH})
	public ResponseEntity<String> update(@PathVariable("rno")Integer rno, @RequestBody ReplyVO vo){
		
		logger.info("ReplyVO : " + rno);
		ResponseEntity<String> entity = null;
		try {
			vo.setRno(rno);;
			reservice.RepModify(vo);
			
			entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
			
		} catch(Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		return entity;
	
	
	
	
	}
	
	@RequestMapping(value="/{rno}", method= {RequestMethod.DELETE})
	public ResponseEntity<String> remove(@PathVariable("rno")Integer rno){
		
		logger.info("ReplyVO : " + rno);
		ResponseEntity<String> entity = null;
		try {
			reservice.RepDel(rno);
			entity=new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
}

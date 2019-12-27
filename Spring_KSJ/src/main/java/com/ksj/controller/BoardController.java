package com.ksj.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ksj.model.BoardVO;
import com.ksj.model.Criteria;
import com.ksj.model.PageVO;
import com.ksj.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {


	@Autowired
	private BoardService bservice;
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
			
	
		/*게시글 목록 리스트*/
		//@RequestMapping(value = "/list", method = RequestMethod.GET)
		//public void listGET(Model model) throws Exception{
				
		/* logger.info("list 결과=" + bservice.boardList()); *///select 전체목록
			//select 전체 목록을 Model객체에 저장후 list.jsp에 실어서 보낸다.
		//	model.addAttribute("list", bservice.boardList());
			
			
		/* return "board/list"; */
				
	//	}
	
	
		//페이징된 게시글 목록 리스트
		@RequestMapping(value = "/list", method = RequestMethod.GET)
		public void listGET(Criteria cri, Model model) throws Exception{
			int total = bservice.boardCount();
			PageVO pv = new PageVO(cri, total);
			logger.info("tpta; = " + total);
			logger.info("bservice.boardListPaging()" + bservice.boardListPaging(cri));
			model.addAttribute("list",bservice.boardListPaging(cri));
			model.addAttribute("page",  pv);
			
		
				
		}
		
		
		
		
	
		/* 글쓰기를 위한 controller */
			@RequestMapping(value = "/register" , method = RequestMethod.GET)
			public String registGET() throws Exception{
				logger.info("regist get........");
				return "board/write";
			}
			
			@RequestMapping(value = "/register" ,  method = RequestMethod.POST)
			public String registPOST(BoardVO board) throws Exception{
				logger.info("regist post......."+board);
				
				bservice.boardWrite(board);
					
				
				return "redirect:list";
			}
			
			
			@RequestMapping(value = "/detail", method = RequestMethod.GET)
			public String detailGET(@RequestParam int bnum, Model model) throws Exception{
				logger.info("detail GET......" + bnum);
				model.addAttribute("bom", bservice.boardDetail(bnum));
		 return "board/detail"; 
			}
		
			
			@RequestMapping(value = "/modify", method = RequestMethod.GET)
			public String modifyGET(int bnum, Model model) throws Exception{
				logger.info("modify GET......" + bnum);
				model.addAttribute("bom", bservice.boardDetail(bnum));
				
		 return "board/modify"; 
			}
			
			@RequestMapping(value = "/modify", method = RequestMethod.POST)
			public String modifyPOST(BoardVO bom) throws Exception{

				logger.info("modify POST......");
				bservice.boardModify(bom);
				
		 //return "redirect:list"; 
				return "redirect:detail?bnum="+bom.getNumber(); 
		 
			}
			/*@RequestMapping(value = "/modify", method = RequestMethod.POST)
			public String modifyPOST(BoardVO bom,RedirectAttributes rttr) throws Exception{
				logger.info("modify POST......");
				bservice.boardModify(bom);
				rttr.addFlashAttribute("bnum", bom.getNumber());
				
				return "redirect:detail";
		 
			}*/
			
			
			
			@RequestMapping(value = "/delete", method = RequestMethod.GET)
			public String deleteGET(@RequestParam int bnum, Model model) throws Exception{
				logger.info("delete GET......" + bnum);
				bservice.boardDel(bnum);
				
		 return "redirect:list"; 
		 
			}
	

	
	
	
	
	
}

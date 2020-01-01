package com.ksj.service;

import java.util.List;

import com.ksj.model.BoardVO;
import com.ksj.model.Criteria;
import com.ksj.model.RepBoardVO;

public interface RepBoardService {

	// 게시판 리스트
	public List<RepBoardVO> repboardList() throws Exception;
	
	// 게시판 리스트
	public List<RepBoardVO> repboardListPaging(Criteria cri) throws Exception;
	
	
	public int repboardCount(Criteria cri) throws Exception;
	
	// 게시판 제목을 클릭하였을 경우
	public RepBoardVO repboardDetail(int number) throws Exception;
	
	//게시판 글수정
	public void repboardModify(RepBoardVO board) throws Exception;
	
	//게시판 글삭제
	/* public void boardDel(BoardVO board) throws Exception; */
	public void repboardDel(RepBoardVO board) throws Exception;
	
	//게시판 글쓰기
	public void repboardWrite(RepBoardVO board) throws Exception; 
	
}

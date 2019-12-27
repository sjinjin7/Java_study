package com.ksj.service;

import java.util.List;

import com.ksj.model.BoardVO;
import com.ksj.model.Criteria;

public interface BoardService {

	// 게시판 리스트
	public List<BoardVO> boardList() throws Exception;
	
	// 게시판 리스트
	public List<BoardVO> boardListPaging(Criteria cri) throws Exception;
	
	
	public int boardCount() throws Exception;
	
	// 게시판 제목을 클릭하였을 경우
	public BoardVO boardDetail(int number) throws Exception;
	
	//게시판 글수정
	public void boardModify(BoardVO board) throws Exception;
	
	//게시판 글삭제
	/* public void boardDel(BoardVO board) throws Exception; */
	public void boardDel(int number) throws Exception;
	
	//게시판 글쓰기
	public void boardWrite(BoardVO board) throws Exception; 
	
}

package com.ksj.mapper;

import java.util.List;

import com.ksj.model.BoardVO;
import com.ksj.model.Criteria;

public interface BoardMapper  {
	//전체 목록 리스트
	public List<BoardVO> boardList();
	
	//전체 목록 리스트(페이징 처리)
	//public List<BoardVO> boardListPaging(페이지 수, 한 페이지당 데이터 처리 갯수) throws Exception;
	public List<BoardVO> boardListPaging(Criteria cri) throws Exception;
	
	//Board테이블의 레코드 전체 갯수 : 페이징의 realEnd를 알기 위해서
	public int boardCount() throws Exception; 
	
	
	// 제목을 클릭했을 때 상세 페이지
	public BoardVO boardDetail(int number) throws Exception;
	
	// 게시판 글쓰기
	//public void boardWrite(String subject, String name, String content, int cnt); //도가능
	 public void boardWrite(BoardVO board) throws Exception; 
	
	//게시판 글수정 
	public void boardModify(BoardVO board) throws Exception;
	//public void boardModify(String subject, String content, int number);
	
	//게시판 글삭제
	/* public void boardDel(BoardVO board) throws Exception; */
	public void boardDel(int number) throws Exception;
	
	
}

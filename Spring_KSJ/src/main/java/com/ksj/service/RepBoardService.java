package com.ksj.service;

import java.util.List;

import com.ksj.model.RepBoardVO;

public interface RepBoardService {
	// 댓글 조회
	public List<RepBoardVO> repboardList() throws Exception;
	// 댓글 쓰기
	public void repboardWrite(RepBoardVO vo) throws Exception;
	// 댓글 수정
	public void repboardModify(RepBoardVO vo) throws Exception;	
	// 댓글 삭제
	public void repboardDel(RepBoardVO vo) throws Exception;
}

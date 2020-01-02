package com.ksj.service;

import java.util.List;

import com.ksj.model.Criteria;
import com.ksj.model.RepBoardVO;
import com.ksj.model.ReplyVO;

public interface ReplyService {
	// 댓글 조회
	public List<ReplyVO> RepList(int bno) throws Exception;
	// 댓글 쓰기
	public void RepWrite(ReplyVO vo) throws Exception;
	// 댓글 수정
	public void RepModify(ReplyVO vo) throws Exception;	
	// 댓글 삭제
	public void RepDel(int rno) throws Exception;
	// 댓글 조회 페이징
	public List<ReplyVO> ReplistPage(int bno, Criteria cri) throws Exception;
	// 댓글 갯수
	public int RepCount(int bno) throws Exception;
	
}

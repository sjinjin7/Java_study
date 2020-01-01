package com.ksj.service;

import java.util.List;

import com.ksj.model.RepBoardVO;
import com.ksj.model.ReplyVO;

public interface ReplyService {
	// 댓글 조회
	public List<ReplyVO> RepList(ReplyVO vo) throws Exception;
	// 댓글 쓰기
	public void RepWrite(ReplyVO vo) throws Exception;
	// 댓글 수정
	public void RepModify(ReplyVO vo) throws Exception;	
	// 댓글 삭제
	public void RepDel(ReplyVO vo) throws Exception;
}

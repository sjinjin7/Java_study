package com.ksj.mapper;

import java.util.List;

import com.ksj.model.Criteria;
import com.ksj.model.ReplyVO;

public interface ReplyMapper {
	// 댓글 조회
	public List<ReplyVO> Replist(int bno) throws Exception;
	// 댓글 쓰기
	public void RepWrite(ReplyVO vo) throws Exception;
	// 댓글 수정
	public void RepModify(ReplyVO vo) throws Exception;
	// 댓그 삭제
	public void RepDel(int rno) throws Exception;
	//댓글 조회(페이징 처리)
	public List<ReplyVO> ReplistPage(int bno, Criteria cri) throws Exception;
	// 댓글 갯수 
	public int Repcount(int bno)throws Exception;
	
	
}

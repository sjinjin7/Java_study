package com.ksj.mapper;

import java.util.List;

import com.ksj.model.ReplyVO;

public interface ReplyMapper {

	public List<ReplyVO> list(ReplyVO vo) throws Exception;
	
	public void RepWrite(ReplyVO vo) throws Exception;
	
	public void RepModify(ReplyVO vo) throws Exception;
	
	public void RepDel(ReplyVO vo) throws Exception;
	
}

package com.ksj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksj.mapper.ReplyMapper;
import com.ksj.model.ReplyVO;

@Service
public class ReplyServiceImpl implements ReplyService {

	@Autowired
	private ReplyMapper rm;
	
	@Override
	public List<ReplyVO> RepList(ReplyVO vo) throws Exception {
		
		return rm.list(vo);
	}

	@Override
	public void RepWrite(ReplyVO vo) throws Exception {
		rm.RepWrite(vo);
		
	}

	@Override
	public void RepModify(ReplyVO vo) throws Exception {
		rm.RepModify(vo);
		
		
	}

	@Override
	public void RepDel(ReplyVO vo) throws Exception {
		rm.RepDel(vo);
		
	}


}

package com.ksj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksj.mapper.ReplyMapper;
import com.ksj.model.Criteria;
import com.ksj.model.ReplyVO;

@Service
public class ReplyServiceImpl implements ReplyService {

	@Autowired
	private ReplyMapper rm;
	
	@Override
	public List<ReplyVO> RepList(int bno) throws Exception {
		
		return rm.Replist(bno);
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
	public void RepDel(int rno) throws Exception {
		rm.RepDel(rno);
		
	}

	@Override
	public List<ReplyVO> ReplistPage(int bno, Criteria cri) throws Exception {
		
		return rm.ReplistPage(bno, cri);
	}

	@Override
	public int RepCount(int bno) throws Exception {
		return rm.Repcount(bno);
	}


}

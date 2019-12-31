package com.ksj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ksj.mapper.RepBoardMapper;
import com.ksj.model.RepBoardVO;

public class RepBoardServiceImpl implements RepBoardService {

	@Autowired
	private RepBoardMapper rbm;
	
	@Override
	public List<RepBoardVO> repboardList() throws Exception {
		// TODO Auto-generated method stub
		return rbm.repboardList();
	}

	@Override
	public void repboardWrite(RepBoardVO vo) throws Exception {
		rbm.repboardWrite(vo);
		
	}

	@Override
	public void repboardModify(RepBoardVO vo) throws Exception {
		rbm.repboardModify(vo);
		
	}

	@Override
	public void repboardDel(RepBoardVO vo) throws Exception {
		rbm.repboardDel(vo);
		
	}

}

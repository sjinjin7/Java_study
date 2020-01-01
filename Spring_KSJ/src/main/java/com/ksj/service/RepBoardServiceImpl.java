package com.ksj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksj.mapper.BoardMapper;
import com.ksj.mapper.RepBoardMapper;
import com.ksj.model.BoardVO;
import com.ksj.model.Criteria;
import com.ksj.model.RepBoardVO;

@Service
public class RepBoardServiceImpl implements RepBoardService {

	@Autowired
	RepBoardMapper rbm;
	
	@Override
	public List<RepBoardVO> repboardList() throws Exception {
		
		return rbm.repboardList();
	}
	
	@Override
	public List<RepBoardVO> repboardListPaging(Criteria cri) throws Exception {
		
		return rbm.repboardListPaging(cri);
	}

	@Override
	public RepBoardVO repboardDetail(int number) throws Exception {
		
		return rbm.repboardDetail(number);
	}

	@Override
	public void repboardModify(RepBoardVO board) throws Exception {
		rbm.repboardModify(board);
		
	}

	/*
	 * @Override public void boardDel(BoardVO board) throws Exception {
	 * bm.boardDel(board);
	 * 
	 * }
	 */
	@Override
	public void repboardDel(RepBoardVO board) throws Exception {
		rbm.repboardDel(board);
		
	}

	@Override
	public void repboardWrite(RepBoardVO board) throws Exception {
		rbm.repboardWrite(board);
		
	}

	@Override
	public int repboardCount(Criteria cri) throws Exception {
		
		return rbm.repboardCount(cri);
	}

}

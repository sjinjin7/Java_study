package com.ksj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksj.mapper.BoardMapper;
import com.ksj.model.BoardVO;
import com.ksj.model.Criteria;


@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	BoardMapper bm;
	
	@Override
	public List<BoardVO> boardList() throws Exception {
		
		return bm.boardList();
	}
	
	@Override
	public List<BoardVO> boardListPaging(Criteria cri) throws Exception {
		
		return bm.boardListPaging(cri);
	}

	@Override
	public BoardVO boardDetail(int number) throws Exception {
		
		return bm.boardDetail(number);
	}

	@Override
	public void boardModify(BoardVO board) throws Exception {
		bm.boardModify(board);
		
	}

	/*
	 * @Override public void boardDel(BoardVO board) throws Exception {
	 * bm.boardDel(board);
	 * 
	 * }
	 */
	@Override
	public void boardDel(int number) throws Exception {
		bm.boardDel(number);
		
	}

	@Override
	public void boardWrite(BoardVO board) throws Exception {
		bm.boardWrite(board);
		
	}

	@Override
	public int boardCount() throws Exception {
		
		return bm.boardCount();
	}

}

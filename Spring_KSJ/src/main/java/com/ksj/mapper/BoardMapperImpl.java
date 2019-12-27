package com.ksj.mapper;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.ksj.model.BoardVO;
import com.ksj.model.Criteria;




@Repository
public class BoardMapperImpl implements BoardMapper {

	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace="com.ksj.mapper.BoardMapper";

	
	
	
	@Override
	public List<BoardVO> boardList() {
		//selectList는 select된 결과가 여러 건 일때 사용하는 메서드
		List list = sqlSession.selectList(namespace+".boardList");
		return list;
	}

	@Override
	public List<BoardVO> boardListPaging(Criteria cri) throws Exception {
		List list = sqlSession.selectList(namespace+".boardListPage", cri);
		return list;
	}
	
	@Override
	public int boardCount() throws Exception {
		int bcnt = sqlSession.selectOne(namespace+".boardCount");
		return bcnt;
	}
	
	@Override
	public BoardVO boardDetail(int number) throws Exception{
			//selectOne은 select된 결과가 한 건 일대 사용하는 메서드
			BoardVO boardvo = sqlSession.selectOne(namespace+".boardDetail",number);
		return boardvo;
	}

	@Override
	public void boardWrite(BoardVO board) {
		sqlSession.insert(namespace+".boardWrite",board);
		
	}

	@Override
	public void boardModify(BoardVO board) {
		sqlSession.update(namespace+".boardModify",board);
		
	}

	/*
	 * @Override public void boardDel(BoardVO board) {
	 * 
	 * sqlSession.delete(namespace+".boardDel",board); }
	 */
	@Override
	public void boardDel(int number) {
		
		sqlSession.delete(namespace+".boardDel",number);
	}



	

}

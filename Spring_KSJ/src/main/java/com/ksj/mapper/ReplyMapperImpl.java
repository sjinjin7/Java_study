package com.ksj.mapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.ksj.model.ReplyVO;

public class ReplyMapperImpl implements ReplyMapper {

	@Autowired
	private SqlSession sqlSession;
	private static final String namespace="com.ksj.mapper.ReplyMapper";
	
	
	@Override
	public List<ReplyVO> list(ReplyVO vo) throws Exception {
		List list = sqlSession.selectList(namespace+".repboardList");
		return list;
	}

	@Override
	public void RepWrite(ReplyVO vo) throws Exception {
		sqlSession.insert(namespace+".boardWrite",vo);
		
	}

	@Override
	public void RepModify(ReplyVO vo) throws Exception {
		sqlSession.update(namespace+".boardModify",vo);
		
	}

	@Override
	public void RepDel(ReplyVO vo) throws Exception {
		sqlSession.delete(namespace+".boardDel", vo);
		
	}

}

package com.human.dao;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.human.vo.BBSVO;

@Repository
public class IF_BBS04DAOImpl implements IF_BBS04DAO{
private static String mapperQuery  ="com.human.dao.IF_BBS04DAO";
	
	@Inject  // 컨테이너에 있는 객체를 주입받는 어노테이션
	private SqlSession sqlSession;

	@Override
	public List<BBSVO> selectAll() throws Exception {
		return sqlSession.selectList(mapperQuery+".selectAll");
	}

	@Override
	public void insert(BBSVO bbsvo) throws Exception {
		sqlSession.insert(mapperQuery+".insert", bbsvo);
		
	}

	@Override
	public void delete(String no) throws Exception {
		sqlSession.delete(mapperQuery+".delete", no);
		
	}

	@Override
	public BBSVO view(String no) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(mapperQuery+".view", no);
	}

	@Override
	public void updatecnt(String no) throws Exception {
		sqlSession.update(mapperQuery+".updatecnt", no);
		
	}

	@Override
	public void update(BBSVO bbsvo) throws Exception {
		System.out.println("짜증나");
		sqlSession.update(mapperQuery+".update", bbsvo);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

package com.human.dao;
import java.util.HashMap;

import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.human.vo.Member04VO;

@Repository      //dao단이라고 스프링에게 알려 줌..
public class Member04DAOImpl implements IF_Member04DAO{   // 실제 객체
	private static String mapperQuery  ="com.human.dao.IF_Member04DAO";
	
	@Inject  // 컨테이너에 있는 객체를 주입받는 어노테이션
	private SqlSession sqlSession;
	
	@Override
	public void insert(Member04VO member04vo) throws Exception {
		sqlSession.insert(mapperQuery+".insert", member04vo);
		// mapperQuery+".insert"   >> com.human.dao.Member04DAO.insert
	}

	@Override
	public Member04VO selectOne(HashMap userinfo) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(mapperQuery+".selectOne", userinfo);  //  매개변수는 1개만 올수 있다.
		// 그런데 실제로 넘겨야 하는 변수는  username과  pwd이다. 그래서 이 두개를 넘길때는  hashmap으로 만들어서 한 번에 보내는다
	}

}

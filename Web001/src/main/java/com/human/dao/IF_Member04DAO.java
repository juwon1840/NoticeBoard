package com.human.dao;

import java.util.HashMap;

import com.human.vo.Member04VO;

public interface IF_Member04DAO {   
	/***
	 *   1. dao의미를 이해
	 *   2. 인터페이스 특징?
	 *   3. 왜 인터페이스를 쓰라고 하는 걸까?  의존도를 낮추기, 다형성.프 로그램의 업그레이드 유지보수를 잘하기 
	 */
	public void insert(Member04VO member04vo) throws Exception;
	// select * from member04 where 
	public Member04VO selectOne(HashMap userinfo) throws Exception;
}

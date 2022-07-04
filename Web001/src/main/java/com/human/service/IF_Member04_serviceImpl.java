package com.human.service;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.human.dao.IF_Member04DAO;
import com.human.vo.BBSVO;
import com.human.vo.Member04VO;

@Service
public class IF_Member04_serviceImpl implements IF_Member04_service{
	@Inject
	IF_Member04DAO mdao;

	@Override
	public void insert(Member04VO mvo) throws Exception {
		// TODO Auto-generated method stub
		mdao.insert(mvo);
	}

	@Override
	public Member04VO login(String username, String pwd) throws Exception {
		HashMap<String, String> userinfo = new HashMap<String, String>();
		userinfo.put("username", username);
		userinfo.put("pwd", pwd);
		/* 리스트는 순서가 있다. 인덱스가 있다.
		 * 맵은  순서가 없다. 인덱스가 없다. 키와 값으로 구성되어있다.. 검색은 맵이 더 빠르다.
		 */
		
		return mdao.selectOne(userinfo);
	}
	
	

}

package com.human.service;

import com.human.vo.Member04VO;

public interface IF_Member04_service {
	public void insert(Member04VO mvo) throws Exception;
	public Member04VO login(String username, String pwd) throws Exception;

}

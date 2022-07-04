package com.human.service;

import java.util.List;

import com.human.vo.BBSVO;
public interface IF_BBS04_service {
		// 메서드 정의는 컨트롤러가 호출하고 , 컨트롤러에게 리턴하기 위한 메서드를 생각해라.. 
	public void insert(BBSVO bbsvo) throws Exception;	
	public List<BBSVO> selectAll() throws Exception;
	public void deleteOne(String no) throws Exception;
	public BBSVO viewDetail(String no) throws Exception;
	public BBSVO mod(String no) throws Exception;
	public void update(BBSVO bbsvo) throws Exception;
	

}

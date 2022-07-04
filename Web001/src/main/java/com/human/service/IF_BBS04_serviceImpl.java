package com.human.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.human.dao.IF_BBS04DAO;
import com.human.vo.BBSVO;

@Service
public class IF_BBS04_serviceImpl implements IF_BBS04_service{

	@Inject
	IF_BBS04DAO bbsdao;
	
	@Override
	public void insert(BBSVO bbsvo) throws Exception {
		// TODO Auto-generated method stub
		if(bbsvo.getScheck() == null) {
			bbsvo.setScheck("2");
		}
		bbsdao.insert(bbsvo);
	}

	@Override
	public List<BBSVO> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return bbsdao.selectAll();
	}

	@Override
	public void deleteOne(String no) throws Exception {
		// TODO Auto-generated method stub
		bbsdao.delete(no);
		
	}

	@Override
	public BBSVO viewDetail(String no) throws Exception {
		// TODO Auto-generated method stub
		bbsdao.updatecnt(no);
		BBSVO bbsvo = bbsdao.view(no);
		return bbsvo;
	}

	@Override
	public void update(BBSVO bbsvo) throws Exception {
		// TODO Auto-generated method stub
		if(bbsvo.getScheck() == null) {
			bbsvo.setScheck("2");
		}
		bbsdao.update(bbsvo);
	}

	@Override
	public BBSVO mod(String no) throws Exception {
		// TODO Auto-generated method stub
		BBSVO bbsvo = bbsdao.view(no);
		return bbsvo;
	}
}

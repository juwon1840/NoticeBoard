package com.human.dao;

import java.util.List;

import com.human.vo.BBSVO;

public interface IF_BBS04DAO {
	public List<BBSVO> selectAll() throws Exception;
	// select * from bbs04;
	// select * from bbs04 where id=?;   id는 유니크하다
	//public BBSVO selectOne(String id) throws Exception;
	
	// 기능을 구현할 쿼리
	// 저장
	// insert into bbs04 values (bbs04_seq.nextval,?,?,?,?,?,sysbdate);
	public void insert(BBSVO bbsvo) throws Exception;
	
	// delete from bbs04 where no=4;
	public void delete(String no) throws Exception;
	
	// select * from bbs04 where no=?;
	public BBSVO view(String no) throws Exception;
	
	//4번 기능을 수행할 때는 조회수를 1씩 증가한다.    update bbs04 set cnt=cnt+1 where no=6;
	public void updatecnt(String no) throws Exception;
	
	// update bbs04 set pass=?, title=?, memo=?, scheck=? where no=?
	public void update(BBSVO bbsvo) throws Exception;

	
	
	
	
	
	
	
	
}

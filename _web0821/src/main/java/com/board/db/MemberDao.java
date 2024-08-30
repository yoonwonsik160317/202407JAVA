package com.board.db;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.SqlMapConfig;

public class MemberDao {
	
	SqlSessionFactory sqlsession_f = SqlMapConfig.getSqlMapInstance();
	SqlSession session;

	public MemberDao() {
		session = sqlsession_f.openSession(true);
	}
	
	public BoardDto selectOne(int num) {

		return session.selectOne("MemberMapper.selectOne", num);
	}
	
	public boolean checkLogin(String email, String pss) {
		session.selectOne("MemberMapper.selectOne", pss);
		return true;
	}

}

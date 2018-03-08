package edu.iot.contact.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import edu.iot.contact.db.ConnectionFactory;
import edu.iot.contact.model.Member;

public class MemberDaoImpl implements MemberDao {
	static final String namespace="edu.iot.contact.dao.MemberDao.";
	
	SqlSession sqlSession;
	
	public MemberDaoImpl() {
		sqlSession = ConnectionFactory.getSqlSession();
	}
	
	@Override
	public int getCount() throws Exception {
		return sqlSession.selectOne(namespace + "getCount");
	}

	@Override
	public List<Member> selectList(Map map) throws Exception {
		//단 하나의 매개변수만 전달할 수 있으므로 여러 개의 매개변수를 전달해야 한다면 Map을 이용
		return sqlSession.selectList(namespace + "selectList", map); //없을 경우 비어있는 리스트 리턴
	}

	@Override
	public Member selectOne(String userId) throws Exception {
		return sqlSession.selectOne(namespace + "selectOne", userId); //없을 경우 null 리턴
	}

	@Override
	public int insert(Member member) throws Exception {
		return sqlSession.insert(namespace + "insert", member);
	}

	@Override
	public int update(Member member) throws Exception {
		return sqlSession.update(namespace + "update", member);
	}

	@Override
	public int delete(String userId) throws Exception {
		return sqlSession.delete(namespace + "delete", userId); 
	}

}

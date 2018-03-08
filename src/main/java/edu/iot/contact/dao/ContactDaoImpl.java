package edu.iot.contact.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import edu.iot.contact.db.ConnectionFactory;
import edu.iot.contact.model.Contact;

public class ContactDaoImpl implements ContactDao {
	static final String namespace = "edu.iot.contact.dao.ContactDao.";

	SqlSession sqlSession;

	public ContactDaoImpl() {
		sqlSession = ConnectionFactory.getSqlSession();
	}

	@Override
	public int getCount(Map map) throws Exception {
		return sqlSession.selectOne(namespace + "getCount", map);
	}

	@Override
	public List<Contact> selectList(Map map) throws Exception {
		// 단 하나의 매개변수만 전달할 수 있으므로 여러 개의 매개변수를 전달해야 한다면 Map을 이용
		return sqlSession.selectList(namespace + "selectList", map); // 없을 경우 비어있는 리스트 리턴
	}

	@Override
	public Contact selectOne(Map map) throws Exception {
		return sqlSession.selectOne(namespace + "selectOne", map);
	}

	@Override
	public int insert(Contact contact) throws Exception {
		return sqlSession.insert(namespace + "insert", contact);
	}

	@Override
	public int update(Contact contact) throws Exception {
		return sqlSession.update(namespace + "update", contact);
	}

	@Override
	public int delete(Map map) throws Exception {
		return sqlSession.delete(namespace + "delete", map);
	}

	@Override
	public List<Contact> search(Map map) throws Exception {
		return sqlSession.selectList(namespace + "search", map);
	}

}

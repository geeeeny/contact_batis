package edu.iot.contact.dao;

import java.util.List;
import java.util.Map;

import edu.iot.contact.model.Contact;

public interface ContactDao {
	
	/*int getCount() throws Exception;
	
	int getCount(String userId) throws Exception;
	
	List<Contact> selectList(int start, int end) throws Exception;
	
	List<Contact> selectList(String owner, int start, int end) throws Exception;
	
	Contact selectOne(String owner, int contactId) throws Exception;
	
	int insert(Contact contact) throws Exception;
	
	int update(Contact contact) throws Exception;
	
	//선택한 행 하나만 삭제
	int delete(String owner, int contactId) throws Exception;
	
	//선택한 사용자가 소유한 연락처 모두 삭제(멤버 삭제시 외래키 제약조건 때문에 필요)
	int delete(String owner) throws Exception; 
	
	//자기 소유 연락처중에서 해당 이름을 가진 사람의 연락처 출력
	List<Contact> search(String owner, String keyword) throws Exception;*/
	
	/*map을 전달하면 오버로딩하지 않고 하나의 메서드로 운용가능*/
	int getCount(Map map) throws Exception;
	
	List<Contact> selectList(Map map) throws Exception;
	
	Contact selectOne(Map map) throws Exception;
	
	int insert(Contact contact) throws Exception;
	
	int update(Contact contact) throws Exception;
	
	int delete(Map map) throws Exception;
	
	List<Contact> search(Map map) throws Exception;
}

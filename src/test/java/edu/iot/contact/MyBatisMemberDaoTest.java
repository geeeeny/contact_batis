package edu.iot.contact;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.iot.contact.dao.MemberDao;
import edu.iot.contact.dao.MemberDaoImpl;
import edu.iot.contact.db.ConnectionFactory;
import edu.iot.contact.model.Member;

public class MyBatisMemberDaoTest {

	public static void main(String[] args) {
		MemberDao dao = new MemberDaoImpl();
		
		try {
			Map<String, Integer> map = new HashMap<>();
			map.put("start", 1);
			map.put("end", 5);
			List<Member> list = dao.selectList(map);
			for(Member m : list) {
				System.out.println(m);
			}
			
			System.out.println("=======================================================");
			Member m2 = dao.selectOne("hong");
			System.out.println(m2);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		ConnectionFactory.getSqlSession().close();
		
		System.out.println("완료");
	}

}

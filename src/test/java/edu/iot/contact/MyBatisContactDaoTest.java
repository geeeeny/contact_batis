package edu.iot.contact;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.iot.contact.dao.ContactDao;
import edu.iot.contact.dao.ContactDaoImpl;
import edu.iot.contact.model.Contact;

public class MyBatisContactDaoTest {

	public static void main(String[] args) {
		ContactDao dao = new ContactDaoImpl();
		
		try {
			//int count = dao.getCount();
			int count = dao.getCount(null);
			System.out.println("관리자: "+count);
			Map<String, Object> map = new HashMap<>();
			map.put("userId", "go");
			count = dao.getCount(map);
			System.out.println("go :"+count );
			System.out.println("========================================================");
			
			Map<String, Object> map2 = new HashMap<>();
			map2.put("start", 1);
			map2.put("end", 5);
			List<Contact> list = dao.selectList(map2);
			System.out.println("관리자");
			for(Contact c : list) {
				System.out.println(c);
			}
			
			map2.put("userId", "go");
			list = dao.selectList(map2);
			System.out.println("go");
			for(Contact c : list) {
				System.out.println(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

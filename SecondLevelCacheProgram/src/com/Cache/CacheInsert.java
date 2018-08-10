package com.Cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class CacheInsert {

	public static void main(String[] args) {
		

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		Transaction t = session.beginTransaction();
				
				UserDTO obj = new UserDTO();
				obj.setName("Shubham");
				obj.setAge(69);
				obj.setSalary(545599);
				obj.setLocation("up");
				session.save(obj);
				t.commit();
				session.close();
				System.out.println("Record Insert Successfully");
	}

}

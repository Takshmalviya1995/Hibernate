package com.Taksh;

import org.hibernate.cfg.*; 
import org.hibernate.*; 
public class Test {
		public static void main(String[] args)throws Exception
		{
			/*Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory sessionFactory = cfg.buildSessionFactory();*/
			
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			Transaction t = session.beginTransaction();
			
			UserDTO obj = new UserDTO();
			obj.setFirstName("sumit");
			obj.setLastName("tiwari");
			obj.setLogin("sumittiwari@gmail.com");
			obj.setPassword("6545");
			// session.persist(t);
			session.save(obj);
			t.commit();
			session.close();
			System.out.println("saved successfully");
		}

		
}

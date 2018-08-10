package com.Taksh;
import org.hibernate.cfg.*;

import org.hibernate.*; 

public class TestUpdate {
	
	public static void main(String[] args)
	{
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session s = sessionFactory.openSession();
		
		Transaction tr = s.beginTransaction();
		
		UserDTO obj = new UserDTO();
		
		obj.setId(4);
		obj.setFirstName("harish");
		obj.setLastName("sharma");
		obj.setLogin("harishsharma@gmail.com");
		obj.setPassword("123456");
		
		s.merge(obj);
		tr.commit();
		s.close();
		System.out.println("Update successfully");
		
		
	}

}

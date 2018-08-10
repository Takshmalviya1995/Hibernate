package com.Taksh;
import org.hibernate.cfg.*;

import org.hibernate.*;
public class TestDelete {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session s = sessionFactory.openSession();
		Transaction tr = s.beginTransaction();
		
		UserDTO obj = new UserDTO();
		
		obj.setId(6);
		
		s.delete(obj);
		tr.commit();
		s.close();
		System.out.println("Delete Successfully");
		
	}

}

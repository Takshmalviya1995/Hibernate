package com.Taksh;
import org.hibernate.cfg.*;

import org.hibernate.*;
public class TestGetMethod {
	
	public static void main(String[] args)
	{
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session s = sessionFactory.openSession();
		
		
		
		UserDTO obj = (UserDTO)s.get(UserDTO.class,4);
		
		
		System.out.println(obj.getId());
		System.out.println(obj.getFirstName());
		System.out.println(obj.getLastName());
		
		s.close();
	}

}

package com.Cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CacheSecondTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionfac = new Configuration().configure().buildSessionFactory();
		
		
		Session s1 = sessionfac.openSession();
		System.out.println("Session 1");
		UserDTO obj1 = (UserDTO) s1.load(UserDTO.class, 2);
		System.out.println(obj1.getId()+"..."+obj1.getName()+"..."+obj1.getAge()+"..."+obj1.getSalary()+"..."+obj1.getLocation());
		s1.close();
		
		

		Session s2 = sessionfac.openSession();
		System.out.println("Session 2");
		UserDTO obj2 = (UserDTO) s2.load(UserDTO.class, 2);
		System.out.println(obj2.getId()+"..."+obj2.getName()+"..."+obj2.getAge()+"..."+obj2.getSalary()+"..."+obj2.getLocation());
		s2.close();
		
		

		/*Session s3 = sessionfac.openSession();
		System.out.println("Session 1");
		UserDTO obj3 = (UserDTO) s3.load(UserDTO.class, 2);
		System.out.println(obj3.getId()+"..."+obj3.getName()+"..."+obj3.getAge()+"..."+obj3.getSalary()+"..."+obj3.getLocation());
		s3.close();*/
	}

}

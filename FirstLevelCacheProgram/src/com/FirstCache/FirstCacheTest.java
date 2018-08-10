package com.FirstCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FirstCacheTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
SessionFactory sessionfac = new Configuration().configure().buildSessionFactory();
Session s1 = sessionfac.openSession();
		for(int i=0;i<=4;i++)
		{
		UserDTO obj1 = (UserDTO) s1.load(UserDTO.class, 2);
		Thread.sleep(100);
		System.out.println(obj1.getId()+"..."+obj1.getName()+"..."+obj1.getAge()+"..."+obj1.getSalary()+"..."+obj1.getLocation());	
		}
		s1.close();
	}

}

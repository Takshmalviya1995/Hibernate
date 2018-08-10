package com.Cache;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class QLCWithUpdateSecond {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

SessionFactory sessionfac = new Configuration().configure().buildSessionFactory();
		
		
		Session s1 = sessionfac.openSession();
		Transaction tr = s1.beginTransaction();
		System.out.println("Session 1");
		UserDTO obj1 = (UserDTO) s1.load(UserDTO.class, 2);
		System.out.println("Name is "+obj1.getName());
		
		obj1.setId(2);
		obj1.setName("shri");
		s1.update(obj1);
		tr.commit();
		s1.close();
		
		Session s2 = sessionfac.openSession();
		System.out.println("Session 2");
		UserDTO obj2 = (UserDTO) s2.load(UserDTO.class, 2);
		System.out.println("Name of Second Session "+obj2.getName());
		s2.close();
	}

}

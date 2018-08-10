package com.Cache;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class QueryLevelCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionfac = new Configuration().configure().buildSessionFactory();
		
		
		Session s = sessionfac.openSession();
		Query query = s.createQuery("FROM UserDTO where id=1");
		query.setCacheable(true);
		List users = query.list();
		Iterator itr = users.iterator();
		UserDTO obj;
		while(itr.hasNext())
		{
			obj=(UserDTO)itr.next();
			System.out.println(obj.getId()+"..."+obj.getName()+"..."+obj.getAge()+"..."+obj.getSalary()+"..."+obj.getLocation());
		}
		
		Query query2 = s.createQuery("FROM UserDTO where id=1");
		query2.setCacheable(true);
		//query.setCacheRegion("UserDTO");
		List users2 = query2.list();
		Iterator itr2 = users2.iterator();
		UserDTO obj2;
		while(itr2.hasNext())
		{
			obj2=(UserDTO)itr2.next();
			System.out.println(obj2.getId()+"..."+obj2.getName()+"..."+obj2.getAge()+"..."+obj2.getSalary()+"..."+obj2.getLocation());
		}
		s.close();
	
		Session s3 = sessionfac.openSession();
		Query query3 = s3.createQuery("FROM UserDTO where id=1");
		query3.setCacheable(true);
		List users3 = query3.list();
		Iterator itr3 = users3.iterator();
		UserDTO obj3;
		while(itr3.hasNext())
		{
			obj3=(UserDTO)itr3.next();
			System.out.println(obj3.getId()+"..."+obj3.getName()+"..."+obj3.getAge()+"..."+obj3.getSalary()+"..."+obj3.getLocation());
		}
		s3.close();
	}
}

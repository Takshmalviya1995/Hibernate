package com.takshQuery;

import java.util.Iterator;
import java.util.List;

import org.hibernate.*;

import org.hibernate.cfg.*;

public class ClauseOrderBy {
	
	public static void sqlQuery()
	{
		
		SessionFactory session = new Configuration().configure().buildSessionFactory();
		Session s = session.openSession();
		
		Query q = s.createSQLQuery("Select * from faculty order by location");
		((SQLQuery)q).addEntity(UserDTO.class);
		List l = q.list();
		
		Iterator itr = l.iterator();
		System.out.println("SQL Query");
		UserDTO obj;
		while(itr.hasNext())
		{
			obj=(UserDTO)itr.next();
			System.out.println(obj.getId()+"..."+obj.getName()+"..."+obj.getAge()+"..."+obj.getSalary()+"..."+obj.getLocation());
		
		}
	}
	
	public static void hqlQuery()
	{
		
		SessionFactory session = new Configuration().configure().buildSessionFactory();
		Session s = session.openSession();
		
		Query q = s.createQuery("from UserDTO order by location");
		
		List l = q.list();
		
		Iterator itr = l.iterator();
		System.out.println("HQL Query");
		UserDTO obj;
		while(itr.hasNext())
		{
			obj=(UserDTO)itr.next();
			System.out.println(obj.getId()+"..."+obj.getName()+"..."+obj.getAge()+"..."+obj.getSalary()+"..."+obj.getLocation());
		
		}
	}

}

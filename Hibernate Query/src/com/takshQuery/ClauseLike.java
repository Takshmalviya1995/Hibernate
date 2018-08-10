package com.takshQuery;
import java.util.*;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.criterion.Restrictions;

public class ClauseLike {
	
	public static void sqlQuery()
	{
		SessionFactory session = new Configuration().configure().buildSessionFactory();
		Session s = session.openSession();
		Query q = s.createSQLQuery("select * from faculty where location like 'b%'");
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
		Query q = s.createQuery("from UserDTO where location like 'b%'");
		
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
	public static void LikeCriteria()
	{

		SessionFactory session = new Configuration().configure().buildSessionFactory();
		Session s = session.openSession();
		Criteria cri = s.createCriteria(UserDTO.class);
		cri.add(Restrictions.like("location", "b%"));
		List l = cri.list();
		Iterator itr = l.iterator();
		System.out.println("****...........Criteria Query..............*****");
		UserDTO obj;
		while(itr.hasNext())
		{
			obj=(UserDTO)itr.next();
			System.out.println(obj.getLocation());
		
		}
		
	}
}

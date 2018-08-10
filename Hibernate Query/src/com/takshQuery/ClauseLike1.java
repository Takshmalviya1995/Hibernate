package com.takshQuery;
import java.util.*;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class ClauseLike1 {
	
	public static void sqlQuery()
	{
		SessionFactory session = new Configuration().configure().buildSessionFactory();
		Session s = session.openSession();
		Query q = s.createSQLQuery("select name,salary from faculty where location like 'b%'");
		
	 
		List<Object[]> l = q.list();
	 
		Iterator itr = l.iterator();
		
		for(Object[] o:l)
		{
			UserDTO obj = new UserDTO();
			obj.setName(o[0].toString());
			obj.setSalary(Integer.parseInt(o[1].toString()));
			System.out.println(obj.getName()+"..."+obj.getSalary());
		
		}
	}
	
	public static void hqlQuery()
	{
		SessionFactory session = new Configuration().configure().buildSessionFactory();
		Session s = session.openSession();
		Query q = s.createQuery("select name,salary from UserDTO where location like 'b%'");
		
		List l = q.list();
		Object[] row;
		Iterator itr = l.iterator();
		System.out.println("HQL Query");
		UserDTO obj;
		while(itr.hasNext())
		{
			row=(Object[])itr.next();
			String name = (String)row[0];
			Integer loc = (Integer)row[1];
			//obj=(UserDTO)itr.next();
			System.out.println(name+"..."+loc);
		}
		
	}
}

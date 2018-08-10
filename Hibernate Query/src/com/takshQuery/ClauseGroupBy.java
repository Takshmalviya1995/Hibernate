package com.takshQuery;

import java.util.*;
import java.lang.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class ClauseGroupBy {
	
	public static void sqlGroupBy()
	{
		SessionFactory session = new Configuration().configure().buildSessionFactory();
		Session s = session.openSession();
		Query q = s.createSQLQuery("select count(f.name),location  from faculty f group by location");
		
		List<Object[]> l = q.list();
		
		System.out.println("Sql Group By Query");
		
		for(Object[] o:l)
		{
			UserDTO obj = new UserDTO();
			obj.setName(o[0].toString());
			obj.setLocation(o[1].toString());
			//obj=(UserDTO)itr.next();
			System.out.println(obj.getName()+"..."+obj.getLocation());
		}
		
	}


	public static void hqlGroupBy()
	{
		SessionFactory session = new Configuration().configure().buildSessionFactory();
		Session s = session.openSession();
		Query q = s.createQuery("select count(u.name),location from UserDTO u group by u.location");
		
		List l = q.list();
		Object[] row;
		Iterator itr = l.iterator();
		System.out.println("Hql Group By Query");
		//UserDTO obj;
		while(itr.hasNext())
		{
			row = (Object[])itr.next();
			Long name = (Long)row[0];
			String loc = (String)row[1];
			
			System.out.println(name+"..."+loc);
		}
		
	}
}

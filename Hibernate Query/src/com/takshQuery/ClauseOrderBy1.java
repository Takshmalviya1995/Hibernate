package com.takshQuery;

import java.util.Iterator;
import java.util.List;

import org.hibernate.*;

import org.hibernate.cfg.*;

public class ClauseOrderBy1 {
	
	public static void sqlQuery()
	{
		
		SessionFactory session = new Configuration().configure().buildSessionFactory();
		Session s = session.openSession();
		
		Query q = s.createSQLQuery("select id,age from faculty order by location");
		//((SQLQuery)q).addEntity(UserDTO.class);
		List<Object[]> l = q.list();
		
		Iterator itr = l.iterator();
		System.out.println("SQL Query");
		
		for(Object[] o:l)
		{
			UserDTO obj = new UserDTO();
			obj.setId(Integer.parseInt(o[0].toString()));
			obj.setAge(Integer.parseInt(o[1].toString()));
			System.out.println(obj.getId()+"..."+obj.getAge());
		
		}
	}
	
	public static void hqlQuery()
	{
		
		SessionFactory session = new Configuration().configure().buildSessionFactory();
		Session s = session.openSession();
		
		Query q = s.createQuery("select id,age from UserDTO order by location");
		
		List l = q.list();
		Object[] row;
		Iterator itr = l.iterator();
		System.out.println("HQL Query");
		UserDTO obj;
		while(itr.hasNext())
		{
			row=(Object[])itr.next();
			Integer id = (Integer)row[0];
			Integer age = (Integer)row[1];
			System.out.println(id+"..."+age);
		
		}
	}

}

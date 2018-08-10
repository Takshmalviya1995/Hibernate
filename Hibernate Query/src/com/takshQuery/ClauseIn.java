package com.takshQuery;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClauseIn {
	static SessionFactory session = new Configuration().configure().buildSessionFactory();
	static Session s = session.openSession();
	
	public static void sqlIn()
	{
		Query q = s.createSQLQuery("select name,id from faculty where location in('bhopal','indore')");
		
		List<Object[]> l=q.list();
		
		Iterator itr = l.iterator();
		System.out.println("//.....Sql IN Clause.....//");
		for(Object[] o:l)
		{
			UserDTO obj = new UserDTO();
			obj.setName(o[0].toString());
			obj.setId(Integer.parseInt(o[1].toString()));
			
			System.out.println(obj.getName()+"..."+obj.getId());
		}
	}
	public static void hqlIn()
	{
		String hql=("select name,id from UserDTO where location in(:location)");
		/*List l = q.list();
		Object[] row;
		Iterator itr = l.iterator();
		System.out.println("//.....Hql IN Query.....//");
		//UserDTO obj;
		while(itr.hasNext())
		{
			row = (Object[])itr.next();
			String name = (String)row[0];
			Integer id = (Integer)row[1];
			
			System.out.println(name+"..."+id);
		}*/
		Query q = s.createQuery(hql);
		q.setParameter("location", "bhopal");
		int result = q.executeUpdate();
		System.out.println("HQL IN clause Query");
		
		System.out.println("Row affected: "+result);
	
	}
}

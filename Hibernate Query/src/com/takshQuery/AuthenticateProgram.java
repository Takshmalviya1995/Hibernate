package com.takshQuery;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AuthenticateProgram {
	
	static SessionFactory sessionfac = new Configuration().configure().buildSessionFactory();
	static Session s = sessionfac.openSession();
	
	public static void authentic()
	{
		Query q = s.createQuery("from UserDTO where name=?");
		q.setParameter(0,"lata");
		
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

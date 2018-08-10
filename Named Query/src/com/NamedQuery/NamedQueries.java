package com.NamedQuery;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class NamedQueries {
	static SessionFactory sessionfac = new Configuration().configure().buildSessionFactory();
	static Session s = sessionfac.openSession();

		public static void selectquery()
		{
			Query q = s.getNamedQuery("selectquery");
		
			List l = q.list();
			Iterator itr = l.iterator();
		
			UserDTO obj;
			while(itr.hasNext())
			{
				obj=(UserDTO)itr.next();
				System.out.println(obj.getId()+"..."+obj.getName()+"..."+obj.getAge()+"..."+obj.getSalary()+"..."+obj.getLocation());
			}
		}
		
		public static void selectOneAttribute()
		{
			Query q = s.getNamedQuery("selectoneattribute");
			q.setParameter(0,4);
			
			
			
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
			
		
		public static void authentic()
		{
			Query q = s.getNamedQuery("authentic");
			q.setParameter(0,"hari");
			
			List l = q.list();
			Iterator itr = l.iterator();
			UserDTO obj;
			while(itr.hasNext())
			{
				
				obj=(UserDTO)itr.next();
				System.out.println(obj.getId()+"..."+obj.getName()+"..."+obj.getAge()+"..."+obj.getSalary()+"..."+obj.getLocation());
			}
		}
}


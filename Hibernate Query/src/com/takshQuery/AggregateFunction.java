package com.takshQuery;

import java.math.*;

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class AggregateFunction {

	public static void sum()
	{
		SessionFactory session = new Configuration().configure().buildSessionFactory();
		Session s = session.openSession();
		
		Query q = s.createSQLQuery("select sum(f.salary) from faculty f");
		
		List l = q.list();
	
		Iterator itr = l.iterator();
		
		System.out.println("Sum SQL Query");
		
		while(itr.hasNext())
		{
			BigDecimal sala = (BigDecimal)itr.next();
			System.out.println(sala);
		}
	}
	
	
	
	
	public static void minimum()
	{
		SessionFactory session = new Configuration().configure().buildSessionFactory();
		Session s = session.openSession();
		
		Query q = s.createSQLQuery("select min(f.salary) from faculty f");
		List l = q.list();
		Iterator itr = l.iterator();
		System.out.println("MIN SQL Query");
		
		while(itr.hasNext())
		{
			Integer sala = (Integer)itr.next();
			System.out.println(sala);
		}
	}
	public static void maximum()
	{
		SessionFactory session = new Configuration().configure().buildSessionFactory();
		Session s = session.openSession();
		
		Query q = s.createSQLQuery("select max(f.salary) from faculty f");
		List l = q.list();
		Iterator itr = l.iterator();
		System.out.println("MAX SQL Query");
		while(itr.hasNext())
		{
			Integer sal = (Integer)itr.next();
			System.out.println(sal);
		}
		
	}
	public static void average()
	{

		SessionFactory session = new Configuration().configure().buildSessionFactory();
		Session s = session.openSession();
		
		Query q = s.createSQLQuery("select avg(f.salary) from faculty f");
		List l = q.list();
		Iterator itr = l.iterator();
		System.out.println("AVERAGE SQL Query");
		while(itr.hasNext())
		{
			BigDecimal sal = (BigDecimal)itr.next();
			System.out.println(sal);
		}
	}
	
	public static void count()
	{
		SessionFactory session = new Configuration().configure().buildSessionFactory();
		Session s = session.openSession();
		
		Query q = s.createSQLQuery("select count(f.salary) from faculty f");
		List l = q.list();
		Iterator itr = l.iterator();
		System.out.println("Count SQL Query");
		while(itr.hasNext())
		{
			BigInteger sal=(BigInteger)itr.next();
			
			System.out.println(sal+"...");
		}
	}
	
	
	public static void sumHql()
	{
		SessionFactory session = new Configuration().configure().buildSessionFactory();
		Session s = session.openSession();
		
		Query q = s.createQuery("select sum(u.salary) from UserDTO u");
		List l = q.list();
		Iterator itr = l.iterator();
		System.out.println("SUM hql Query");
		while(itr.hasNext())
		{
			Long sal=(Long)itr.next();
			
			System.out.println(sal+"...");
		}
	}
	
	public static void minHql()
	{
		SessionFactory session = new Configuration().configure().buildSessionFactory();
		Session s = session.openSession();
		
		Query q = s.createQuery("select min(u.salary) from UserDTO u");
		List l = q.list();
		Iterator itr = l.iterator();
		System.out.println("Min hql Query");
		while(itr.hasNext())
		{
			Integer sal = (Integer)itr.next();
			System.out.println(sal);
		}
	}
	

	public static void maxHql()
	{
		SessionFactory session = new Configuration().configure().buildSessionFactory();
		Session s = session.openSession();
		
		Query q = s.createQuery("select max(u.salary) from UserDTO u");
		List l = q.list();
		Iterator itr = l.iterator();
		System.out.println("Max hql Query");
		while(itr.hasNext())
		{
			Integer sal = (Integer)itr.next();
			System.out.println(sal);
		}
	}
	
	public static void avgHql()
	{
		SessionFactory session = new Configuration().configure().buildSessionFactory();
		Session s = session.openSession();
		
		Query q = s.createQuery("select avg(u.salary) from UserDTO u");
		List l = q.list();
		Iterator itr = l.iterator();
		System.out.println("Average hql Query");
		while(itr.hasNext())
		{
			Double sal = (Double)itr.next();
			System.out.println(sal);
		}
	}
	

	public static void countHql()
	{
		SessionFactory session = new Configuration().configure().buildSessionFactory();
		Session s = session.openSession();
		
		Query q = s.createQuery("select count(u.salary) from UserDTO u");
		List l = q.list();
		Iterator itr = l.iterator();
		System.out.println("Count hql Query");
		while(itr.hasNext())
		{
			Long sal = (Long)itr.next();
			System.out.println(sal);
		}
	}
	
}

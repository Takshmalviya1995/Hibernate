package com.takshQuery;
import java.math.*;

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
public class UpdateQuery {

	public static void sqlUpdate()
	{
		SessionFactory session = new Configuration().configure().buildSessionFactory();
		Session s = session.openSession();
		Transaction tr = s.beginTransaction();
		String sql = "update faculty set salary = :salary where id=:id";
		Query q = s.createSQLQuery(sql);
		
		q.setParameter("salary", 1000);
		q.setParameter("id", 5);
		int result = q.executeUpdate();
		System.out.println("Rows affected: " + result);
		tr.commit();
		System.out.println("Sql Update Query");
		
		
	}
	
	public static void hqlUpdate()
	{
		SessionFactory session = new Configuration().configure().buildSessionFactory();
		Session s = session.openSession();
		Transaction tr = s.beginTransaction();
		String hql = "update UserDTO set salary = :salary where id=:id";
		Query q = s.createQuery(hql);
		
		q.setParameter("salary", 5);
		q.setParameter("id", 4);
		int result = q.executeUpdate();
		System.out.println("Rows affected: "+result);
		tr.commit();
		System.out.println("Hql Update Query");
	}
	
}

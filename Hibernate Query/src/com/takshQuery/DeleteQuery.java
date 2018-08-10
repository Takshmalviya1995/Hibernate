package com.takshQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteQuery {
	
	public static void sqlDelete()
	{
		SessionFactory session = new Configuration().configure().buildSessionFactory();
		Session s = session.openSession();
		Transaction tr = s.beginTransaction();
		String sql = "delete from faculty where name= ':name' ";
			Query q = s.createQuery(sql);
			q.setParameter("name", "Ayushi");
			int result = q.executeUpdate();
			System.out.println("Row affected: "+result);
			//tr.commit();
			System.out.println("SQL Delete Query");
	}
	
	public static void hqlDelete()
	{
		SessionFactory session = new Configuration().configure().buildSessionFactory();
		Session s = session.openSession();
		Transaction tr = s.beginTransaction();
		String hql = "delete from UserDTO where id=:id ";
		Query q = s.createQuery(hql);
		q.setParameter("id", 2);
		int result = q.executeUpdate();
		System.out.println("HQL Delete Query");
		tr.commit();
		System.out.println("Row affected: "+result);
	}
	

}

package com.Criteria;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.takshQuery.UserDTO;

import java.util.Iterator;
import java.util.List;

public class RestrictionAndProjection {
	static SessionFactory session = new Configuration().configure().buildSessionFactory();
	static Session s = session.openSession();
	
	public static void whereAndLike()
	{
		Criteria cri = s.createCriteria(UserDTO.class);
		ProjectionList p = Projections.projectionList();
		p.add(Projections.property("name"));
		p.add(Projections.property("age"));
		p.add(Projections.property("location"));
		cri.add(Restrictions.like("location", "b%"));
		
		cri.setProjection(p);
		List l =  cri.list();
		Object[] row;
		Iterator itr  = l.iterator();
		while(itr.hasNext())
		{
			row = (Object[])itr.next();
			String name = (String)row[0];
			Integer age = (Integer)row[1];
			String loc = (String)row[2];
			
			System.out.println(name+"...."+age+"...."+loc);
		}
	}
	public static void whereAndBetween()
	{
		Criteria cri = s.createCriteria(UserDTO.class);
		ProjectionList p = Projections.projectionList();
		p.add(Projections.property("name"));
		p.add(Projections.property("id"));
		p.add(Projections.property("age"));
		cri.add(Restrictions.between("age", 19, 26));
		cri.setProjection(p);
		
		List l = cri.list();
		Object[] row;
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			row = (Object[])itr.next();
			String name=(String)row[0];
			Integer id = (Integer)row[1];
			Integer age = (Integer)row[2];
			System.out.println(name+"...."+id+"...."+age);
		}
	}
	public static void whereAndGreaterThan()
	{
		Criteria cri = s.createCriteria(UserDTO.class);
		ProjectionList p = Projections.projectionList();
		p.add(Projections.property("name"));
		p.add(Projections.property("age"));
		p.add(Projections.property("id"));
		cri.add(Restrictions.gt("id", 6));
		cri.setProjection(p);
		
		List l = cri.list();
		Object[] row;
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			row=(Object[])itr.next();
			String name = (String)row[0];
			Integer age = (Integer)row[1];
			Integer id = (Integer)row[2];
			
			System.out.println(name+"..."+age+"..."+id);
		}
		
	}
	public static void whereAndLessThan()
	{
		Criteria cri = s.createCriteria(UserDTO.class);
		ProjectionList p = Projections.projectionList();
		p.add(Projections.property("name"));
		p.add(Projections.property("age"));
		p.add(Projections.property("id"));
		cri.add(Restrictions.lt("id", 10));
		cri.setProjection(p);
		
		List l = cri.list();
		Object[] row;
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			row=(Object[])itr.next();
			String name = (String)row[0];
			Integer age = (Integer)row[1];
			Integer id = (Integer)row[2];
			
			System.out.println(name+"..."+age+"..."+id);
		}
	}
	public static void whereAndOrderBy()
	{
		Criteria cri = s.createCriteria(UserDTO.class);
		ProjectionList p = Projections.projectionList();
		p.add(Projections.property("name"));
		p.add(Projections.property("location"));
		p.add(Projections.property("age"));
		cri.add(Restrictions.like("location", "b%"));
		cri.addOrder(Order.asc("age"));
		cri.setProjection(p);
		
		List l = cri.list();
		Object[] row;
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
		row=(Object[])itr.next();
		String name = (String)row[0];
		String address = (String)row[1];
		Integer age = (Integer)row[2];
		
		System.out.println(name+"..."+address+"...."+age);
		}
		
	}
	public static void whereAndIlike()
	{
		Criteria cri = s.createCriteria(UserDTO.class);
		ProjectionList p = Projections.projectionList();
		p.add(Projections.property("id"));
		p.add(Projections.property("name"));
		p.add(Projections.property("location"));
		cri.add(Restrictions.ilike("location", "b%"));
		cri.setProjection(p);
		List l = cri.list();
		Object[] row;
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
		row=(Object[])itr.next();
		Integer id = (Integer)row[0];
		String name = (String)row[1];
		String loc = (String)row[2];
		
		
		System.out.println("..."+name+"...."+loc);
		}
	}
}

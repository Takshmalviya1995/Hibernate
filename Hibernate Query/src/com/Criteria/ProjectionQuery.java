package com.Criteria;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.takshQuery.UserDTO;



public class ProjectionQuery {
	static SessionFactory session = new Configuration().configure().buildSessionFactory();
	static Session s = session.openSession();
	
	public static void sumProjection()
	{
		Criteria cri = s.createCriteria(UserDTO.class);
		cri.setProjection(Projections.sum("salary"));
		List<Object[]> l= cri.list();
		System.out.println(l.get(0));
	}
	public static void minProjection()
	{
		Criteria cri = s.createCriteria(UserDTO.class);
		cri.setProjection(Projections.min("salary"));
		List<Object> l = cri.list();
		System.out.println(l.get(0));
	}
	public static void maxProjection()
	{
		Criteria cri = s.createCriteria(UserDTO.class);
		cri.setProjection(Projections.max("salary"));
		List<Object> l = cri.list();
		System.out.println(l.get(0));
	}
	public static void averageProjection()
	{
		Criteria cri = s.createCriteria(UserDTO.class);
		cri.setProjection(Projections.avg("salary"));
		List<Object> l = cri.list();
		System.out.println(l.get(0));
	}
	public static void countProjection()
	{
		Criteria cri = s.createCriteria(UserDTO.class);
		cri.setProjection(Projections.count("salary"));
		List<Object[]> l = cri.list();
		System.out.println(l.get(0));
	}
	
	public static void selectedAttrubuteProjection()
	{
		Criteria cri = s.createCriteria(UserDTO.class);
		ProjectionList p = Projections.projectionList();
		p.add(Projections.property("id"));
		p.add(Projections.property("name"));
		cri.setProjection(p);
		List l = cri.list();
		Object[] row;
		Iterator itr = l.iterator();
		//UserDTO obj;
		while(itr.hasNext())
		{
			row=(Object[])itr.next();
			Integer id = (Integer)row[0];
			String name = (String)row[1];
			//obj=(UserDTO)itr.next();
			System.out.println(id+"..."+name);
		}
	}
	public static void groupByProjection()
	{
		Criteria cri = s.createCriteria(UserDTO.class);
		ProjectionList p = Projections.projectionList();
		p.add(Projections.property("name"));
		p.add(Projections.property("location"));
		p.add(Projections.groupProperty("location"));
		p.add(Projections.count("location"));
		
		cri.setProjection(p);
		List l = cri.list();
		Object[] row;
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			row = (Object[])itr.next();
			String name = (String)row[0];
			String loc = (String)row[1];
			Integer loc1 = (Integer)row[3];
			System.out.println(name+"....."+loc+"..."+loc1);
		}
	}
	
}

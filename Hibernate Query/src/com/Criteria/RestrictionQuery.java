package com.Criteria;

import java.util.*;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.takshQuery.UserDTO;

public class RestrictionQuery {
	static SessionFactory session = new Configuration().configure().buildSessionFactory();
	static Session s = session.openSession();
	public static void selectCriteria()
	{
		Criteria cri = s.createCriteria(UserDTO.class);
		List l = cri.list();
		Iterator itr = l.iterator();
		UserDTO obj;
		while(itr.hasNext())
		{
			obj=(UserDTO)itr.next();
			System.out.println(obj.getId()+"..."+obj.getName()+"..."+obj.getAge()+"..."+obj.getSalary()+"..."+obj.getLocation());
		
		}
		
	}
	public static void LikeCriteria()
	{
		Criteria cri = s.createCriteria(UserDTO.class);
		cri.add(Restrictions.like("location", "b%"));
		List l = cri.list();
		Iterator itr = l.iterator();
		System.out.println("****...........Like Criteria Query..............*****");
		UserDTO obj;
		while(itr.hasNext())
		{
			obj=(UserDTO)itr.next();
			System.out.println(obj.getLocation());
		
		}
	}
	public static void equalsCriteria()
	{
		Criteria cri = s.createCriteria(UserDTO.class);
		cri.add(Restrictions.eq("age", 26));
		List l  = cri.list();
		Iterator itr = l.iterator();
		System.out.println("****...........Equlas Criteria Query..............*****");
		UserDTO obj;
		while(itr.hasNext())
		{
			obj=(UserDTO)itr.next();
			System.out.println(obj.getId()+"..."+obj.getName()+"..."+obj.getAge()+"..."+obj.getSalary()+"..."+obj.getLocation());
		}
	}
	public static void greaterCriteria()
	{
		Criteria cri = s.createCriteria(UserDTO.class);
				cri.add(Restrictions.gt("age", 19));
		List l = cri.list();
		Iterator itr = l.iterator();
		System.out.println("****...........GreaterThan Criteria Query..............*****");
		UserDTO obj;
		while(itr.hasNext())
		{
		obj=(UserDTO)itr.next();
		System.out.println(obj.getId()+"..."+obj.getName()+"..."+obj.getAge()+"..."+obj.getSalary()+"..."+obj.getLocation());
		}
	}
	public static void lessCriteria()
	{
		Criteria cri = s.createCriteria(UserDTO.class);
		cri.add(Restrictions.lt("age", 26));
		List l = cri.list();
		Iterator itr = l.iterator();
		UserDTO obj;
		while(itr.hasNext())
		{
			obj=(UserDTO)itr.next();
			System.out.println(obj.getId()+"..."+obj.getName()+"..."+obj.getAge()+"..."+obj.getSalary()+"..."+obj.getLocation());
		}
	}
	public static void ilike()
	{
		Criteria cri = s.createCriteria(UserDTO.class);
		cri.add(Restrictions.ilike("name", "ayush"));
		List l = cri.list();
		Iterator itr = l.iterator();
		UserDTO obj;
		while(itr.hasNext())
		{
			obj=(UserDTO)itr.next();
			System.out.println(obj.getId()+"..."+obj.getName()+"..."+obj.getAge()+"..."+obj.getSalary()+"..."+obj.getLocation());
		}
	}
	public static void betweenCriteria()
	{
		Criteria cri = s.createCriteria(UserDTO.class);
				cri.add(Restrictions.between("id", 3, 8));
		List l = cri.list();
		Iterator itr = l.iterator();
		UserDTO obj;
		while(itr.hasNext())
		{
			obj=(UserDTO)itr.next();
			System.out.println(obj.getId()+"..."+obj.getName()+"..."+obj.getAge()+"..."+obj.getSalary()+"..."+obj.getLocation());
		}
	}
	public static void isNULLCriteria()
	{
		Criteria cri = s.createCriteria(UserDTO.class);
		cri.add(Restrictions.isNull("salary"));
		List l = cri.list();
		Iterator itr = l.iterator();
		UserDTO obj;
		while(itr.hasNext())
		{
			obj=(UserDTO)itr.next();
			System.out.println(obj.getId()+"..."+obj.getName()+"..."+obj.getAge()+"..."+obj.getSalary()+"..."+obj.getLocation());
		}
	}
	public static void isNOTNULLCriteria()
	{
		Criteria cri = s.createCriteria(UserDTO.class);
		cri.add(Restrictions.isNotNull("salary"));
		List l = cri.list();
		Iterator itr = l.iterator();
		UserDTO obj;
		while(itr.hasNext())
		{
			obj=(UserDTO)itr.next();
			System.out.println(obj.getId()+"..."+obj.getName()+"..."+obj.getAge()+"..."+obj.getSalary()+"..."+obj.getLocation());
		}
	}
	
	public static void isEmptyCriteria()
	{
		Criteria cri = s.createCriteria(UserDTO.class);
		cri.add(Restrictions.isEmpty("salary"));
		List l = cri.list();
		Iterator itr = l.iterator();
		UserDTO obj;
		while(itr.hasNext())
		{
			obj=(UserDTO)itr.next();
			System.out.println(obj.getId()+"..."+obj.getName()+"..."+obj.getAge()+"..."+obj.getSalary()+"..."+obj.getLocation());
		}
	}
	public static void isNOTEmptyCriteria()
	{
		Criteria cri = s.createCriteria(UserDTO.class);
		cri.add(Restrictions.isNotEmpty("salary"));
		List l = cri.list();
		Iterator itr = l.iterator();
		UserDTO obj;
		while(itr.hasNext())
		{
			obj=(UserDTO)itr.next();
			System.out.println(obj.getId()+"..."+obj.getName()+"..."+obj.getAge()+"..."+obj.getSalary()+"..."+obj.getLocation());
		}
	}
	public static void andConditionCriteria()
	{
		Criteria cri = s.createCriteria(UserDTO.class);
		cri.add(Restrictions.like("name", "a%"));
		cri.add(Restrictions.eq("age", 13));
		List l = cri.list();
		Iterator itr = l.iterator();
		UserDTO obj;
		while(itr.hasNext())
		{
			obj=(UserDTO)itr.next();
			System.out.println(obj.getId()+"..."+obj.getName()+"..."+obj.getAge()+"..."+obj.getSalary()+"..."+obj.getLocation());
		}
	}
	public static void orConditionCriteria()
	{
		Criteria cri = s.createCriteria(UserDTO.class);
		cri.add(Restrictions.or(Restrictions.like("name", "a%"), Restrictions.eq("age", 13)));
		List l = cri.list();
		Iterator itr = l.iterator();
		UserDTO obj;
		while(itr.hasNext())
		{
			obj=(UserDTO)itr.next();
			System.out.println(obj.getId()+"..."+obj.getName()+"..."+obj.getAge()+"..."+obj.getSalary()+"..."+obj.getLocation());
		}
	}
	public static void orderByCriteria()
	{
		Criteria cri = s.createCriteria(UserDTO.class);
		cri.addOrder(Order.asc("salary"));
		List l = cri.list();
		Iterator itr = l.iterator();
		UserDTO obj;
		while(itr.hasNext())
		{
			obj=(UserDTO)itr.next();
			System.out.println(obj.getId()+"..."+obj.getName()+"..."+obj.getAge()+"..."+obj.getSalary()+"..."+obj.getLocation());
		}
	}
	public static void setMaxResultsCriteria()
	{
		Criteria cri = s.createCriteria(UserDTO.class);
		cri.setMaxResults(10);
		List l = cri.list();
		Iterator itr = l.iterator();
		UserDTO obj;
		while(itr.hasNext())
		{
			obj=(UserDTO)itr.next();
			System.out.println(obj.getId()+"..."+obj.getName()+"..."+obj.getAge()+"..."+obj.getSalary()+"..."+obj.getLocation());
		}
	}
	public static void setFirstResultCriteria()
	{
		Criteria cri = s.createCriteria(UserDTO.class);
		cri.setFirstResult(5);
		List l = cri.list();
		Iterator itr  = l.iterator();
		UserDTO obj;
		while(itr.hasNext())
		{
			obj=(UserDTO)itr.next();
			System.out.println(obj.getId()+"..."+obj.getName()+"..."+obj.getAge()+"..."+obj.getSalary()+"..."+obj.getLocation());
		}
	}
}



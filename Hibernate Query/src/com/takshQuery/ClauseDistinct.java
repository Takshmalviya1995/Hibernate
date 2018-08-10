package com.takshQuery;

import java.util.*;
import java.lang.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class ClauseDistinct {
	
	public static void sqlDistinct()
	{

	SessionFactory session = new Configuration().configure().buildSessionFactory();
	Session s = session.openSession();
	
	Query q = s.createSQLQuery("select distinct name from faculty");
	List<Object[]> l = q.list();
	System.out.println("Sql Distinct Query");
	for(Object[] o:l)
	{
		UserDTO obj = new UserDTO();
		obj.setName(o[0].toString());
		System.out.println(obj.getName());
	}
	/*List l = q.list();
	//Object[] row;
	Iterator itr = l.iterator();
	System.out.println("//.....SQL Distinct Query.....//");
	UserDTO obj;
	while(itr.hasNext())
	{
		obj=(UserDTO)itr.next();
		System.out.println(obj.getName());
	}*/
	}
}

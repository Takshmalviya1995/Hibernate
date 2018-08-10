package com.NamedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MergeOrUpdate {
public static void main(String[] args)
{
	SessionFactory sessionFac = new Configuration().configure().buildSessionFactory();
	Session session1 = sessionFac.openSession();
	
	UserDTO obj=null;
	Object o = session1.get(UserDTO.class,new Integer(1));
    obj = (UserDTO)o;
	session1.close();
	obj.setName("Vishal");
	
	
	Session session2 = sessionFac.openSession();
	UserDTO obj1=null;
	Object o1 = session2.get(UserDTO.class,new Integer(1));
    obj1 = (UserDTO)o1;
//	session2.merge(obj);
	session2.update(obj);

	Transaction t=session2.beginTransaction();
	t.commit();
	
	
	
}
}
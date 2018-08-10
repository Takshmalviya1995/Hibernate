package ManagerEmployee;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class LogicManagerEmployee {
	
	static SessionFactory factory = new Configuration().configure().buildSessionFactory();
	static Session session = factory.openSession();

	public static void Insert1()
	{
		Manager ma = new Manager();
		ma.setManagerId(101);
		ma.setManagerName("Danger");
		
		Employee em1 = new Employee();
		em1.setEmployeeId(501);
		em1.setEmployeeName("chotu");
		
		Employee em2 = new Employee();
		em2.setEmployeeId(502);
		em2.setEmployeeName("motu");
		
		Employee em3 = new Employee();
		em3.setEmployeeId(503);
		em3.setEmployeeName("chotu");
		
		//One to Many
		Set s = new HashSet();
		s.add(em1);
		s.add(em2);
		s.add(em3);
			ma.setChildren(s);
		//Many to one
		em1.setParentObjects(ma);
		em2.setParentObjects(ma);
		em3.setParentObjects(ma);
		
		Transaction tx = session.beginTransaction();
		
		session.save(em1);//;many to one
		//session.save(ma);//one to many
		
		tx.commit();
		session.close();
		System.out.println("One to many Bi-directional is done");
		factory.close();
	}
	public static void Delete1()
	{
		Manager ma = (Manager)session.get(Manager.class, 101);
		//Employee em = (Employee)session.get(Employee.class, new Integer(501));
		Transaction tx = session.beginTransaction();
		session.delete(ma);
		tx.commit();
		session.close();
	}
}

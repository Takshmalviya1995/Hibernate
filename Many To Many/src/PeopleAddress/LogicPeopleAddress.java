package PeopleAddress;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import EmployeeProject.Employee;
import EmployeeProject.Project;

public class LogicPeopleAddress {
	static  SessionFactory factory = new Configuration().configure().buildSessionFactory();
	static Session session = factory.openSession();

	public static void insert1()
	{
		People pe1 = new People();
		pe1.setPeopleId(101);
		pe1.setPeopleName("raja");
		
		People pe2 = new People();
		pe2.setPeopleId(102);
		pe2.setPeopleName("maharaja");
		
		Address ad1 = new Address();
		ad1.setAddressId(501);
		ad1.setAddressName("mr10");
		
		Address ad2 = new Address();
		ad2.setAddressId(502);
		ad2.setAddressName("vijay");
		
		Set s = new HashSet();
		s.add(ad1);
		s.add(ad2);
		
		pe1.setAddress(s);
		pe2.setAddress(s);
		
		Transaction tx = session.beginTransaction();
		session.save(pe1);
		session.save(pe2);
		tx.commit();
		session.close();
		System.out.println("Many to Many Done");	
	}
	public static void select1()
	 {
		 List li= session.createQuery("from People").list();
		 Iterator itr = li.iterator();
		 while(itr.hasNext())
		 {
			 People pe=(People)itr.next();
			 System.out.println("PeopleId : "+pe.getPeopleName());
			 System.out.println("PeopleName: "+pe.getPeopleId());
			 
			 Set add = pe.getAddress();
			 Iterator itr2 = add.iterator();
	            while (itr2.hasNext())
	            {
	               Address addr = (Address) itr2.next(); 
	               System.out.println("AddressID: " + addr.getAddressId());
	               System.out.println("AddressName: "+addr.getAddressName());
	            }
		 }
	 }
}

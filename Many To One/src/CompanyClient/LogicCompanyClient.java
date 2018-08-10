package CompanyClient;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VendorCustomer.Customer;
import VendorCustomer.Vendor;

public class LogicCompanyClient {
	
	
	static SessionFactory factory = new Configuration().configure().buildSessionFactory();
	static Session session = factory.openSession();
	public static void Insert1()
	{
		
	Company c = new Company();
	c.setCmpId(102);
	c.setCmpName("com1");
	
	Client c1 = new Client();
	c1.setClId(504);
	c1.setClname("rama");
	c1.setParentObjects(c);
	
	Client c2 = new Client();
	c2.setClId(505);
	c2.setClname("omi");
	c2.setParentObjects(c);
	
	Client c3 = new Client();
	c3.setClId(506);
	c3.setClname("devi");
	c3.setParentObjects(c);
	
	Transaction tx = session.beginTransaction();
	session.save(c1);
	session.save(c2);
	session.save(c3);
	
	tx.commit();
	session.close();
	System.out.println("Many to One is done...");
		
}
	public static void select()
	{
		Query qry=session.createQuery("from Client c");
		 
	     List l=qry.list();
	     Iterator it = l.iterator();
	     while(it.hasNext())
	     {
	      
	      Client c = (Client)it.next();
	      System.out.println(c.getClname());
	      Company co=c.getParentObjects();
	      System.out.println(co.getCmpName());
	     }
	 
	     session.close();
	     System.out.println("many to one select done..!!");
	     factory.close();       
	}
}

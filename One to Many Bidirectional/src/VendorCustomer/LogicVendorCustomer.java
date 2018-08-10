package VendorCustomer;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LogicVendorCustomer {
static SessionFactory factory = new Configuration().configure().buildSessionFactory();
static Session session = factory.openSession();

public static void Insert1()
{
	Vendor v = new Vendor();
	v.setVendorId(103);
	v.setVendorName("jio");
	
	Customer c1 = new Customer();
	c1.setCustomerId(508);
	c1.setCustomerName("bobby");
	
	Customer c2 = new Customer();
	c2.setCustomerId(5019);
	c2.setCustomerName("kane");
	
	Customer c3 = new Customer();
	c3.setCustomerId(504);
	c3.setCustomerName("rat");
	
	//One to Many
	/*Set s = new HashSet();
	s.add(c1);
	s.add(c2);
	s.add(c3);
		//v.setChildren(s);
*/	//Many to one
	c1.setParentObjects(v);
	c2.setParentObjects(v);
	c3.setParentObjects(v);
	
	Transaction tx = session.beginTransaction();
	
	session.save(c2);//;many to one
	//session.save(v);//one to many
	
	tx.commit();
	session.close();
	System.out.println("One to many Bi-directional is done");
	factory.close();
	
}
}

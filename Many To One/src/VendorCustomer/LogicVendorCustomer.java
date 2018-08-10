package VendorCustomer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LogicVendorCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Vendor v = new Vendor();
		v.setVendorId(102);
		v.setVendorName("Proff1");
		
		Customer c1 = new Customer();
		c1.setCustomerId(504);
		c1.setCustomerName("rama");
		c1.setParentObjects(v);
		
		Customer c2 = new Customer();
		c2.setCustomerId(505);
		c2.setCustomerName("omi");
		c2.setParentObjects(v);
		
		Customer c3 = new Customer();
		c3.setCustomerId(506);
		c3.setCustomerName("devi");
		c3.setParentObjects(v);
		
		Transaction tx = session.beginTransaction();
		session.save(c1);
		session.save(c2);
		session.save(c3);
		
		tx.commit();
		session.close();
		System.out.println("Many to One is done...");
		
	}
}

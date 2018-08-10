package CountryState;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VendorCustomer.Customer;
import VendorCustomer.Vendor;

public class LogicCountryState {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Country c = new Country();
		c.setCoutId(101);
		c.setCoutName("India");
		
		State st1 = new State();
		st1.setStaId(501);
		st1.setStaName("rama");
		st1.setfId(c);
		
		State st2 = new State();
		st2.setStaId(502);
		st2.setStaName("omi");
		st2.setfId(c);
		
		State st3 = new State();
		st3.setStaId(503);
		st3.setStaName("devi");
		st3.setfId(c);
		
		Transaction tx = session.beginTransaction();
		session.save(st1);
		session.save(st2);
		session.save(st3);
		
		tx.commit();
		session.close();
		System.out.println("Many to One is done...");
		
	}

}

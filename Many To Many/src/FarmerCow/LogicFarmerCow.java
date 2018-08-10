package FarmerCow;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import CustomerBank.Customer;

public class LogicFarmerCow {
	static SessionFactory factory = new Configuration().configure().buildSessionFactory();
	static Session session = factory.openSession();
	
	public static void insert1()
	{
		Farmer fa1 = new Farmer();
		fa1.setFarmerId(101);
		fa1.setFarmerName("jawan");
		
		Farmer fa2 = new Farmer();
		fa2.setFarmerId(102);
		fa2.setFarmerName("dev");
		
		Cow co1 = new Cow();
		co1.setCowId(501);
		co1.setCowName("Rani");
		
		Cow co2 = new Cow();
		co2.setCowId(502);
		co2.setCowName("Maharani");
		
		Set s = new HashSet();
		s.add(co1);
		s.add(co2);
		
		fa1.setCow(s);
		fa2.setCow(s);
		
		Transaction tx = session.beginTransaction();
		session.save(fa1);
		session.save(fa2);
		tx.commit();
		session.close();
		System.out.println("Many to Many Done");	
	}
	 public static void delete1()
	 {

		 Transaction tx = session.beginTransaction();
		 Farmer fa = (Farmer)session.get(Farmer.class, 101);
		 //Cow co = (Cow)session.get(Cow.class,501);
		 session.delete(fa);
		 tx.commit();
		 session.close();
	 }
}

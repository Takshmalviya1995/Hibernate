package BusPassenger;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LogicBusPassenger {
	static SessionFactory sessionfac = new Configuration().configure().buildSessionFactory();
	static Session session = sessionfac.openSession();
	
	public static void Insert1()
	{
		Bus bu = new Bus();
		bu.setBusId(101);
		bu.setBusName("baba");
		
		Passenger pa1 = new Passenger();
		pa1.setPassId(501);
		pa1.setPassName("hari");
		
		Passenger pa2 = new Passenger();
		pa2.setPassId(502);
		pa2.setPassName("ramesh");
		
		Passenger pa3 = new Passenger();
		pa3.setPassId(503);
		pa3.setPassName("dev");
		
		Set s = new HashSet();
		s.add(pa1);
		s.add(pa2);
		s.add(pa3);
		
		bu.setChildren(s);
		
		Transaction tx = session.beginTransaction();
		session.save(bu);
		tx.commit();
		session.close();		
	}
	public static void updateRec()
	{
		Bus bu = (Bus)session.get(Bus.class, 101);
		bu.setBusName("cahrted");
		Transaction tx = session.beginTransaction();
		session.update(bu);
		tx.commit();
		session.close();
	}
}

package TrainPassenger;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import PeopleAddress.Address;
import PeopleAddress.People;

public class LogicTrainPassenger {

	static  SessionFactory factory = new Configuration().configure().buildSessionFactory();
	static Session session = factory.openSession();
	
	public static void insert1()
	{
		Train tr1 = new Train();
		tr1.setTrainId(101);
		tr1.setTrainName("intercity");
		
		Train tr2 = new Train();
		tr2.setTrainId(102);
		tr2.setTrainName("satapdi");
		
		Passenger pa1 = new Passenger();
		pa1.setPassengerId(501);
		pa1.setPassengerName("kitty");
		
		Passenger pa2 = new Passenger();
		pa2.setPassengerId(502);
		pa2.setPassengerName("Pitty");
		
		Set s = new HashSet();
		s.add(pa1);
		s.add(pa2);
		
		tr1.setPassenger(s);
		tr2.setPassenger(s);
		
		Transaction tx = session.beginTransaction();
		session.save(tr1);
		session.save(tr2);
		tx.commit();
		session.close();
		System.out.println("Many to Many Done");
	}
	
	public static void select1()
	 {
		 List li= session.createQuery("from Train").list();
		 Iterator itr = li.iterator();
		 while(itr.hasNext())
		 {
			 Train tr=(Train)itr.next();
			 System.out.println("TrainId : "+tr.getTrainName());
			 System.out.println("TrainName: "+tr.getTrainId());
			 
			 Set s = tr.getPassenger();
			 Iterator itr2 = s.iterator();
	            while (itr2.hasNext())
	            {
	               Passenger pa = (Passenger) itr2.next(); 
	               System.out.println("AddressID: " + pa.getPassengerId());
	               System.out.println("AddressName: "+pa.getPassengerName());
	            }
		 }
	 }
}

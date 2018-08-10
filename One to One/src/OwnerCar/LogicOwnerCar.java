package OwnerCar;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class LogicOwnerCar {
	static SessionFactory factory = new Configuration().configure().buildSessionFactory();
	static Session session = factory.openSession();
	
	public static void insert1()
	{
		Owner ow = new Owner();
		ow.setOwnerId(101);
		ow.setOwnerName("raja");
		ow.setDate(new Date());
		
		Car ca = new Car();
		ca.setCarId(501);
		ca.setCarName("nexa");
		ca.setS(ow);
		
		Transaction tx = session.beginTransaction();
		session.save(ca);
		tx.commit();
		session.close();
		
	}
	public static void select1()
	 {
		 List li= session.createQuery("from Car").list();
		 Iterator itr = li.iterator();
		 while(itr.hasNext())
		 {
			 Car ca=(Car)itr.next();
			 System.out.println("CarId : "+ca.getCarName());
			 System.out.println("CarName: "+ca.getCarId());
			 
			 Owner ow = ca.getS();
			 System.out.println("OwnerId : "+ow.getOwnerName());
			 System.out.println("OwnerName: "+ow.getOwnerId());
			 System.out.println("Date: "+ow.getDate());
			
		 }
	 }
}

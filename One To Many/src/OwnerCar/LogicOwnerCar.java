package OwnerCar;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import CompanyClient.Client;

public class LogicOwnerCar {
	static SessionFactory sessionfac = new Configuration().configure().buildSessionFactory();
	static Session session = sessionfac.openSession();
	
	public static void Insert1()
	{
		Owner ow = new Owner();
		ow.setOwnerId(101);
		ow.setOwnerName("sonu");
		
		Car ca1 = new Car();
		ca1.setCarId(501);
		ca1.setCarName("lamborgini");
		
		Car ca2 = new Car();
		ca2.setCarId(502);
		ca2.setCarName("Duster");
		
		Car ca3 = new Car();
		ca3.setCarId(503);
		ca3.setCarName("Alto");
		
		Set s = new HashSet();
		s.add(ca1);
		s.add(ca2);
		s.add(ca3);
		
		ow.setChildren(s);
		
		Transaction tx = session.beginTransaction();
		session.save(ow);
		tx.commit();
		session.close();	
	}
	public static void O_A_C_Get()
	{
		Car ca = (Car)session.get(Car.class, 503);
		System.out.println(ca.getCarId()+"...."+ca.getCarName()+"....."+ca.getForevenId());
		session.close();
	}  

}

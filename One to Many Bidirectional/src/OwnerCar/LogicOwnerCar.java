package OwnerCar;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import BookAuthor.Author;
import BookAuthor.Book;
import ManagerEmployee.Employee;
import ManagerEmployee.Manager;

public class LogicOwnerCar {
	
	static SessionFactory factory = new Configuration().configure().buildSessionFactory();
	static Session session = factory.openSession();

	public static void Insert1()
	{
		Owner ow = new Owner();
		ow.setOwnerId(101);
		ow.setOwnerName("Amir");
		
		Car ca1 = new Car();
		ca1.setCarNo(501);
		ca1.setCarName("alto");
		
		Car ca2 = new Car();
		ca2.setCarNo(502);
		ca2.setCarName("swift");
		
		Car ca3 = new Car();
		ca3.setCarNo(503);
		ca3.setCarName("Nexa");
		//One to Many
		Set s = new HashSet();
		s.add(ca1);
		s.add(ca2);
		s.add(ca3);
			ow.setChildren(s);
		//Many to one
		ca1.setParentObjects(ow);
		ca2.setParentObjects(ow);
		ca3.setParentObjects(ow);
		
		Transaction tx = session.beginTransaction();
		
		session.save(ca1);//;many to one
		//session.save(ma);//one to many
		
		tx.commit();
		session.close();
		System.out.println("One to many Bi-directional is done");
		factory.close();
	}
	public static void updateRec()
	{
		Transaction tx = session.beginTransaction();
		Owner ow = (Owner) session.get(Owner.class, 101);
		ow.setOwnerName("Shek");
		
		Car ca = (Car) session.get(Car.class, 501);
		ca.setCarName("Duster");
		Set se = ow.getChildren();
		se.add(ca);
		session.update(ow);
		tx.commit();
		session.close();
		
	}
}

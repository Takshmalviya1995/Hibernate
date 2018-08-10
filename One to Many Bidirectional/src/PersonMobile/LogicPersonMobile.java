package PersonMobile;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import ManagerEmployee.Manager;
import OwnerCar.Car;
import OwnerCar.Owner;

public class LogicPersonMobile {
	
	static SessionFactory factory = new Configuration().configure().buildSessionFactory();
	static Session session = factory.openSession();

	public static void Insert1()
	{
		Person pe = new Person();
		pe.setPersonId(101);
		pe.setPersonName("Amir");
		
		Mobile mo1 = new Mobile();
		mo1.setMobileId(501);
		mo1.setMobileName("Apple");
		
		Mobile mo2 = new Mobile();
		mo2.setMobileId(502);
		mo2.setMobileName("Samsung");
		
		Mobile mo3 = new Mobile();
		mo3.setMobileId(503);
		mo3.setMobileName("Lenovo");
		//One to Many
		Set s = new HashSet();
		s.add(mo1);
		s.add(mo2);
		s.add(mo3);
			pe.setChildren(s);
		//Many to one
		mo1.setParentObjects(pe);
		mo2.setParentObjects(pe);
		mo3.setParentObjects(pe);
		
		Transaction tx = session.beginTransaction();
		
		session.save(mo1);//;many to one
		//session.save(ma);//one to many
		
		tx.commit();
		session.close();
		System.out.println("One to many Bi-directional is done");
		factory.close();
	}
	public static void Delete1()
	{
		Person pe = (Person)session.get(Person.class, 101);
		//Mobile mo = (Mobile)session.get(Mobile.class, new Integer(501));
		Transaction tx = session.beginTransaction();
		session.delete(pe);
		tx.commit();
		session.close();
	}
}

package FacultySubject;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import LibraryBook.Book1;
import LibraryBook.Library;

public class LogicFacultySubject {
	
	static SessionFactory factory = new Configuration().configure().buildSessionFactory();
	static Session session = factory.openSession();

	public static void Insert1()
	{
		Faculty fa = new Faculty();
		fa.setFacultyId(101);
		fa.setFacultyName("rohan");
		
		Subject su1 = new Subject();
		su1.setSubId(501);
		su1.setSubName("Toc");
		
		Subject su2 = new Subject();
		su2.setSubId(502);
		su2.setSubName("Ada");
		
		Subject su3 = new Subject();
		su3.setSubId(503);
		su3.setSubName("DS");
		//One to Many
		Set s = new HashSet();
		s.add(su1);
		s.add(su2);
		s.add(su3);
			fa.setChildren(s);
		//Many to one
		su1.setParentObjects(fa);
		su2.setParentObjects(fa);
		su3.setParentObjects(fa);
		
		Transaction tx = session.beginTransaction();
		
		//session.save(su1);//;many to one
		session.save(fa);//one to many
		
		tx.commit();
		session.close();
		System.out.println("One to many Bi-directional is done");
		factory.close();
	}

}

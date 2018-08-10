package CountryLanguage;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import FilmActor.Actor;

public class LogicCountryLangugae {
	static SessionFactory factory = new Configuration().configure().buildSessionFactory();
	static Session session = factory.openSession();
	
	public static void insert1()
	{
		Country co1 = new Country();
		co1.setCountryId(101);
		co1.setCountryName("india");
		
		Country co2 = new Country();
		co2.setCountryId(102);
		co2.setCountryName("Aus");
		
		Language la1 = new Language();
		la1.setLanguageId(501);
		la1.setLanguageName("Hindi");
		
		Language la2 = new Language();
		la2.setLanguageId(502);
		la2.setLanguageName("English");
		
		Set s = new HashSet();
		s.add(la1);
		s.add(la2);
		
		co1.setLanguage(s);
		co2.setLanguage(s);
		
		Transaction tx = session.beginTransaction();
		session.save(co1);
		session.save(co2);
		tx.commit();
		session.close();
		System.out.println("Many to Many Done");
		
	}
	 public static void updateRec()
	 {
		 Transaction tx = session.beginTransaction();
		 Country co = (Country)session.get(Country.class, 101);
		 co.setCountryName("pak");
         session.update(co);
         tx.commit();
         session.close();
	 }
	
}

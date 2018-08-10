package PersonPassport;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class LogicPersonPassport {
	static SessionFactory factory = new Configuration().configure().buildSessionFactory();
	static Session session = factory.openSession();
	
	public static void insert1()
	{
		Person pe = new Person();
		pe.setPersonId(101);
		pe.setPersonName("kailash");
		pe.setPersonAdd("Bhopal");
		
		Passport pa = new Passport();
		pa.setPassNo(123);
		pa.setIssueDate(new Date());
		pa.setExpDate("12/6/2050");
		pa.setS(pe);
		
		Transaction tx = session.beginTransaction();
		session.save(pa);
		tx.commit();
		session.close();
		
	}
	 public static void updateRec()
	 {
		 Transaction tx = session.beginTransaction();
		 Person pe = (Person)session.get(Person.class, 101);
		 pe.setPersonName("Amir");
         session.update(pe);
         tx.commit();
         session.close();
	 }
}

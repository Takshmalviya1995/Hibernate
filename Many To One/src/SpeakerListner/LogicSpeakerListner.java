package SpeakerListner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import DepartmentEmployee.Department;
import DepartmentEmployee.Employee;

public class LogicSpeakerListner {
	static SessionFactory factory = new Configuration().configure().buildSessionFactory();
	static Session session = factory.openSession();
	public static void Insert1()
	{
		
	Speaker sp = new Speaker();
	sp.setSpId(101);
	sp.setSpname("dev");
	
	Listner li1 = new Listner();
	li1.setLiId(501);
	li1.setLiname("rama");
	li1.setLiqualification("be");
	li1.setFid(sp);
	
	Listner li2 = new Listner();
	li2.setLiId(502);
	li2.setLiname("omi");
	li2.setLiqualification("me");
	li2.setFid(sp);
	
	Listner li3 = new Listner();
	li3.setLiId(503);
	li3.setLiname("devi1");
	li3.setLiqualification("bcom");
	li3.setFid(sp);
	
	Transaction tx = session.beginTransaction();
	session.save(li1);
	session.save(li2);
	session.save(li3);
	
	tx.commit();
	session.close();
	System.out.println("Many to One is done...");
	}

	public static void updateRecords()
	{
		Transaction tx = session.beginTransaction();
		Speaker sp = (Speaker)session.get(Speaker.class, 101);
				sp.setSpname("monu");
				session.update(sp);
				tx.commit();
				session.close();
	}
}

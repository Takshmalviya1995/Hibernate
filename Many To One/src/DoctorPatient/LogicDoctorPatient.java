package DoctorPatient;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LogicDoctorPatient {

	static SessionFactory factory = new Configuration().configure().buildSessionFactory();
	static Session session = factory.openSession();
	public static void Insert1()
	{
		
	Doctor d = new Doctor();
	d.setDoctId(101);
	d.setDoctName("Ramesh");
	
	Patient p1 = new Patient();
	p1.setPatId(501);
	p1.setPatName("rama");
	p1.setPatDieases("Fever");
	p1.setFid(d);
	
	Patient p2 = new Patient();
	p2.setPatId(502);
	p2.setPatName("omi1");
	p2.setPatDieases("Cough");
	p2.setFid(d);
	
	Patient p3 = new Patient();
	p3.setPatId(503);
	p3.setPatName("devi1");
	p3.setPatDieases("cough");
	p3.setFid(d);
	
	Transaction tx = session.beginTransaction();
	session.save(p1);
	session.save(p2);
	session.save(p3);
	
	tx.commit();
	session.close();
	System.out.println("Many to One is done...");
		
}
		public static void delete()
		{
			
			 
			     Transaction tx = session.beginTransaction();
			     Patient pa = (Patient)session.get(Patient.class, 502);
			     session.delete(pa);
			     tx.commit();
			 
			     session.close();
			     System.out.println("many to one delete done..!!");
			     factory.close();       
					
		}
}

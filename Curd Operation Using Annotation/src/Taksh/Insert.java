package Taksh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		User u = new User();
		//u.setUserId(102);
		u.setUserName("Vishal");
		u.setLogin("Vishalh@gmail");
		u.setPassword("98745");
		
		Transaction tx = session.beginTransaction();
		session.save(u);
		tx.commit();
		session.close();
		
	}

}

package Taksh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		User u = (User)session.get(User.class, 102);
		u.setUserName("ayush");
		u.setLogin("Ayush@gmail");
		u.setPassword("5465");
		
		Transaction tx = session.beginTransaction();
		session.update(u);
		tx.commit();
		session.close();
	}

}

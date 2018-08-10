package Taksh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class GetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		User u = (User)session.get(User.class, 102);
		System.out.println(u.getUserId());
		System.out.println(u.getUserName());
		System.out.println(u.getLogin());
		System.out.println(u.getPassword());
	}

}

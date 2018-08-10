package Taksh;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;



public class SelectAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		
		List l= session.createQuery("from User").list();
		 Iterator itr = l.iterator();
		 while(itr.hasNext())
		 {
			 User u=(User)itr.next();
			 System.out.println("UserId : "+u.getUserId());
			 System.out.println("UserName: "+u.getUserName());
			 System.out.println("UserLogin: "+u.getLogin());
			 System.out.println("USerPassword: "+u.getPassword());
	}

}
}
package Select;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.AnnotationConfiguration;

public class Insert {

static  AnnotationConfiguration cfg=new AnnotationConfiguration().configure();
    

    static SessionFactory factory = cfg.buildSessionFactory();
    static Session session = factory.openSession();
    
    public static void main(String[] args)
    {
    	Student s = new Student();
    	s.setStudentId(102);
    	s.setStudentName("neeno");
    	
    	Address a = new Address();
    	a.setAddressId(502);
    	a.setPlace("bhopal");
    	
    	a.setParent(s);
    	Transaction tx = session.beginTransaction();
    	session.save(a);
    	tx.commit();
    	session.close();
    }
}

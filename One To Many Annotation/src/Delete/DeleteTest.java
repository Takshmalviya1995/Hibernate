package Delete;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class DeleteTest {
	static  AnnotationConfiguration cfg=new AnnotationConfiguration().configure();
    

    static SessionFactory factory = cfg.buildSessionFactory();
    static Session session = factory.openSession();
    
    public static void insert()
    {
    	Owner ow = new Owner();
    	ow.setOwnerId(101);
    	ow.setOwnerName("ram");
    	
    	Car ca1 = new Car();
    	ca1.setCarId(501);
    	ca1.setCarName("maruti");
    	
    	Car ca2 = new Car();
    	ca2.setCarId(502);
    	ca2.setCarName("BMW");
    	
    	Set s = new HashSet();
    	s.add(ca1);
    	s.add(ca2);
    	
    	ow.setChildren(s);
    	Transaction tx = session.beginTransaction();
    	session.save(ow);
    	tx.commit();
    	session.close();
    }
    
    public static void delete()
    {
    	Transaction tx = session.beginTransaction();
    	Car ca = (Car)session.get(Car.class, 502);
    	session.delete(ca);
    	tx.commit();
    	session.close();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteTest dt = new DeleteTest();
		//dt.insert();
		dt.delete();
	}

}

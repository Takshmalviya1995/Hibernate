package Delete;

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
    	Bus b =new Bus();
    	b.setBusId(1012);
    	b.setBusName("radha1");
    	
    	Passenger pa1 = new Passenger();
    	pa1.setPassengerId(503);
    	pa1.setPassengerName("mohan1");
    	pa1.setParent(b);
    	
    	/*Passenger pa2 = new Passenger();
    	pa2.setPassengerId(502);
    	pa2.setPassengerName("baba");
    	pa2.setParent(b);*/
    	
    	Transaction tx = session.beginTransaction();
    	session.save(pa1);
    	//session.save(pa2);
    	tx.commit();
    	session.close();
    }
    
    public static void delete() {
    	Transaction tx  = session.beginTransaction();
    	Passenger pa = (Passenger)session.get(Passenger.class,503);
    	session.delete(pa);
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

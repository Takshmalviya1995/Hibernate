package update;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import Select.Category;
import Select.Item;

public class TestUpdate {

	
static  AnnotationConfiguration cfg=new AnnotationConfiguration().configure();
    

    static SessionFactory factory = cfg.buildSessionFactory();
    static Session session = factory.openSession();
	
		// TODO Auto-generated method stub

		public static void insert()
		{
			Bus bu1 = new Bus();
			bu1.setBusId(101);
			bu1.setBusName("bus1");
		
			Bus bu2 = new Bus();
			bu2.setBusId(102);
			bu2.setBusName("bus2");
		
			Passenger pa1 = new Passenger();
			pa1.setPassengerId(501);
			pa1.setPassengerName("ramesh");
		
			Passenger pa2 = new Passenger();
			pa2.setPassengerId(502);
			pa2.setPassengerName("pencil");
		
			Set s = new HashSet();
			s.add(pa1);
			s.add(pa2);
		
			bu1.setPassenger(s);
			bu2.setPassenger(s);
		
			Transaction tx = session.beginTransaction();
			session.save(bu1);
			session.save(bu2);
			tx.commit();
			session.close();
		}	
		
		public static void update()
		{
			Transaction tx = session.beginTransaction();
			Bus b = (Bus)session.get(Bus.class,102);
			b.setBusName("busssss");
			session.save(b);
			tx.commit();
			session.close();
		}
		public static void delete()
		{
			Transaction tx = session.beginTransaction();
			Bus b = (Bus)session.get(Bus.class,102);
			//Passenger p = (Passenger)session.get(Passenger.class, 501);
			session.delete(b);
			tx.commit();
			session.close();
		}
		public static void main(String[] args) {
			
			TestUpdate tu  =new TestUpdate();
			//tu.insert();
			//tu.update();
			tu.delete();
	}

}

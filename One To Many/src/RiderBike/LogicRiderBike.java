package RiderBike;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LogicRiderBike {
static SessionFactory factory = new Configuration().configure().buildSessionFactory();
static Session session = factory.openSession();

public static void insert1()
{
	Rider ri = new Rider();
	ri.setRiderId(101);
	ri.setRiderName("rohan");
	
	Bike bi1 = new Bike();
	bi1.setBikeId(501);
	bi1.setBikeName("honda");
	
	Bike bi2 =  new Bike();
	bi2.setBikeId(502);
	bi2.setBikeName("pulsar");
	
	Bike bi3 = new Bike();
	bi3.setBikeId(503);
	bi3.setBikeName("hero");
	
	Set s = new HashSet();
	s.add(bi1);
	s.add(bi2);
	s.add(bi3);
	
	ri.setChild(s);
	Transaction tx = session.beginTransaction();
	session.save(ri);
	tx.commit();
	session.close();
}
public static void delete1()
{
	Transaction tx = session.beginTransaction();
	Bike bi =(Bike)session.get(Bike.class, 501);
	session.delete(bi);
	tx.commit();
	session.close();
	
}
}

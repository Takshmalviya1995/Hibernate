package UserVehicle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LogicUserVehicle {
	static SessionFactory factory = new Configuration().configure().buildSessionFactory();
	static Session session = factory.openSession();
	
	public static void insert1()
	{
		User us = new User();
		us.setUserId(101);
		us.setUserName("ram");
		
		Vehicle ve = new Vehicle();
		ve.setVehicleId(501);
		ve.setVehicleName("swift");
		ve.setS(us);
		
		Transaction tx = session.beginTransaction();
		session.save(ve);
		tx.commit();
		session.close();
		
	}
	public static void delete1()
	 {

		 Transaction tx = session.beginTransaction();
		 User us = (User)session.get(User.class, 101);
		 //Vehicle ve = (Vehicle)session.get(Vehicle.class,101);
		 session.delete(us);
		 tx.commit();
		 session.close();
	 }

}

package StudentAddress;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LogicStudentAddress {
public static void main(String[] args)
{
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	 Session session = factory.openSession();
	 
	 Student s = new Student();
	 s.setStudentId(111);
	 s.setStudentName("Rohan");
	 
	 Address add = new Address();
	 add.setAddressId(501);
	 add.setCity("Bhopal");
	 add.setState("M.P.");
	 add.setS(s);
	 
	 Transaction tx = session.beginTransaction();
	 session.save(add);
	 tx.commit();
	 session.close();
	 System.out.println("One to One done");
}
}

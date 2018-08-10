package CustomerBank;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import ArtistSong.Artist;

public class LogicCustomerBank {
	 static SessionFactory factory = new Configuration().configure().buildSessionFactory();
	 static Session session = factory.openSession();
	 public static void insert1()
	 {
		 Customer cu1 = new Customer();
		 cu1.setCustomerId(101);
		 cu1.setCustomerName("baba");
		 
		 Customer cu2 = new Customer();
		 cu2.setCustomerId(102);
		 cu2.setCustomerName("dada");
		 
		 Bank ba1 = new Bank();
		 ba1.setBankId(501);
		 ba1.setBankName("BOB");
		 
		 Bank ba2 = new Bank();
		 ba2.setBankId(502);
		 ba2.setBankName("BOI");
		 
		 Set s = new HashSet();
		 s.add(ba1);
		 s.add(ba2);
		 
		 cu1.setBank(s);
		 cu2.setBank(s);
		 
		 Transaction tx = session.beginTransaction();
			session.save(cu1);
			session.save(cu2);
			tx.commit();
			session.close();
			System.out.println("Many to Many Done");
		  }
	 public static void delete1()
	 {

		 Transaction tx = session.beginTransaction();
		 Customer cu = (Customer)session.get(Customer.class, 101);
		 //Bank ba = (Bank)session.get(Bank.class,501);
		 session.delete(cu);
		 tx.commit();
		 session.close();
	 }
}

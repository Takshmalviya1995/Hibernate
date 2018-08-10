package OrderItem;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import FilmActor.Actor;

public class LogicOrderItem {
	static  SessionFactory factory = new Configuration().configure().buildSessionFactory();
	static Session session = factory.openSession();

	public static void insert1()
	{
		Orders or1 = new Orders();
		or1.setOrderId(101);
		or1.setOrderName(2);
		or1.setOrderCount(10);
		
		Orders or2 = new Orders();
		or2.setOrderId(102);
		or2.setOrderName(3);
		or2.setOrderCount(20);
		
		Item it1 = new Item();
		it1.setItemId(501);
		it1.setItemName("pen");
		
		Item it2 = new Item();
		it2.setItemId(502);
		it2.setItemName("hen");
		
		Set s = new HashSet();
		s.add(it1);
		s.add(it2);
		
		or1.setItem(s);
		or2.setItem(s);
		
		Transaction tx = session.beginTransaction();
		session.save(or1);
		session.save(or2);
		tx.commit();
		session.close();
		System.out.println("Many to Many Done");
	}
	 public static void updateRec()
	 {
		 Transaction tx = session.beginTransaction();
		 Orders or = (Orders)session.get(Orders.class, 101);
		 or.setOrderName(6);
         session.update(or);
         tx.commit();
         session.close();
	 }
}

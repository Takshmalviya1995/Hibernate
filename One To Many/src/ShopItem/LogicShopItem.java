package ShopItem;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LogicShopItem {
	
		static SessionFactory sessionfac = new Configuration().configure().buildSessionFactory();
		static Session session = sessionfac.openSession();
		
		public static void Insert1()
		{
			Shop sh = new Shop();
			sh.setShopId(101);
			sh.setShopName("stationary");
			
			Item it1 = new Item();
			it1.setItemId(501);
			it1.setItemName("pen");
			
			Item it2 = new Item();
			it2.setItemId(502);
			it2.setItemName("rubber");
			
			Item it3 = new Item();
			it3.setItemId(503);
			it3.setItemName("pencil");
			
			Set s = new HashSet();
			s.add(it1);
			s.add(it2);
			s.add(it3);
			
			sh.setChildren(s);
			Transaction tx = session.beginTransaction();
			session.save(sh);
			tx.commit();
			session.close();
			
		}
		public static void S_A_I_Update()
		{
			Transaction t = session.beginTransaction();
			Shop sh = new Shop();
			sh.setShopId(101);
			sh.setShopName("hariom");
			System.out.println(sh.getShopId()+"...."+sh.getShopName());
			
			session.update(sh);
			
			t.commit();
		}
}

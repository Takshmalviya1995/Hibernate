package Select;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestSelect {

static  AnnotationConfiguration cfg=new AnnotationConfiguration().configure();
    

    static SessionFactory factory = cfg.buildSessionFactory();
    static Session session = factory.openSession();
		
		public static void insert()
		{
			Category ca1 = new Category();
			ca1.setCategoryId(101);
			ca1.setCategoryName("cat1");
		
			Category ca2 = new Category();
			ca2.setCategoryId(102);
			ca2.setCategoryName("cat2");
		
			Item it1 = new Item();
			it1.setItemId(501);
			it1.setItemName("pen");
		
			Item it2 = new Item();
			it2.setItemId(502);
			it2.setItemName("pencil");
		
			Set s = new HashSet();
			s.add(it1);
			s.add(it2);
		
			ca1.setItem(s);
			ca2.setItem(s);
		
			Transaction tx = session.beginTransaction();
			session.save(ca1);
			session.save(ca2);
			tx.commit();
			session.close();
		}			
			public static void select()
			{
				
				Query q = session.createQuery("from Category");
				List l = q.list();
				Iterator itr = l.iterator();
				while(itr.hasNext())
				{
					Category ca = (Category)itr.next();
					System.out.println(ca.getCategoryId()+"...."+ca.getCategoryName());
					
					Set se = ca.getItem();
					Iterator itr2 = se.iterator();
					while(itr2.hasNext())
					{
						Item it = (Item)itr2.next();
						System.out.println(it.getItemId()+"..."+it.getItemName());
					}
				}
			}
		public static void main(String[] args) {
			TestSelect ts = new TestSelect();
			//ts.insert();
			ts.select();
		}

}

package LibraryBook;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import ProductSuplier.Product;
import ProductSuplier.Suplier;


public class LogicLibraryBook {
	static SessionFactory factory = new Configuration().configure().buildSessionFactory();
	static Session session = factory.openSession();

	public static void Insert1()
	{
		Library li = new Library();
		li.setLibraryId(102);
		li.setLibraryName("dev");
		
		Book1 bo1 = new Book1();
		bo1.setBookId(501);
		bo1.setBookName("Comics");
		
		Book1 bo2 = new Book1();
		bo2.setBookId(502);
		bo2.setBookName("Story");
		
		Book1 bo3 = new Book1();
		bo3.setBookId(503);
		bo3.setBookName("biography");
		//One to Many
		Set s = new HashSet();
		s.add(bo1);
		s.add(bo2);
		s.add(bo3);
			li.setChildren(s);
		//Many to one
		bo1.setParentObjects(li);
		bo2.setParentObjects(li);
		bo3.setParentObjects(li);
		
		Transaction tx = session.beginTransaction();
		
		//session.save(bo1);//;many to one
		session.save(li);//one to many
		
		tx.commit();
		session.close();
		System.out.println("One to many Bi-directional is done");
		factory.close();
	}
	public static void select1()//one to many
	{
		Object o=session.get(Library.class, new Integer(102));
		Library li=(Library)o;
		System.out.println(li.getLibraryId());
		System.out.println(li.getLibraryName());
		 
		Set s=li.getChildren();
		Iterator it = s.iterator();
		 
		while(it.hasNext())
		{
		 
		Object o1 = it.next();
		Book1 bo = (Book1) o1;
		System.out.println("---------------------------");
		System.out.println("Suplier objects...");
		System.out.println("---------------------------");
		System.out.println(bo.getBookId());
		System.out.println(bo.getBookName());
		System.out.println(bo.getForevenId());
		System.out.println("---------------------------");
		}
		 
		session.close();
	}
}

package BookAuthor;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class LogicBookAuthor {
	static SessionFactory factory = new Configuration().configure().buildSessionFactory();
	static Session session = factory.openSession();

	public static void Insert1()
	{
		Author au = new Author();
		au.setAuthorId(101);
		au.setAuthorName("premchand");
		
		Book bo1 = new Book();
		bo1.setBookId(501);
		bo1.setBookTitle("maths");
		bo1.setBookPrice(10);
		
		Book bo2 = new Book();
		bo2.setBookId(502);
		bo2.setBookTitle("science");
		bo2.setBookPrice(20);
		
		Book bo3 = new Book();
		bo3.setBookId(503);
		bo3.setBookTitle("english");
		bo3.setBookPrice(30);
		
		//One to Many
		Set s = new HashSet();
		s.add(bo1);
		s.add(bo2);
		s.add(bo3);
			au.setChildren(s);
		//Many to one
		bo1.setParentObjects(au);
		bo2.setParentObjects(au);
		bo3.setParentObjects(au);
		
		Transaction tx = session.beginTransaction();
		
		session.save(bo1);//;many to one
		//session.save(pr);//one to many
		
		tx.commit();
		session.close();
		System.out.println("One to many Bi-directional is done");
		factory.close();
	}
public static void updateRec()
{
	Transaction tx = session.beginTransaction();
	Author au = (Author) session.get(Author.class, 101);
	au.setAuthorName("balkrishan");
	
	Book bo = (Book) session.get(Book.class, 501);
	bo.setBookTitle("hindi");
	Set se = au.getChildren();
	se.add(bo);
	session.update(au);
	tx.commit();
	session.close();
	
}
}

package Select;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Update {
static  AnnotationConfiguration cfg=new AnnotationConfiguration().configure();
    

    static SessionFactory factory = cfg.buildSessionFactory();
    static Session session = factory.openSession();
    

	public static void main(String[] args)
	{
		Transaction tx = session.beginTransaction();
		Address add = (Address)session.get(Address.class, 501);
				add.setPlace("indore");
				session.save(add);
				tx.commit();
				session.close();
	}
}


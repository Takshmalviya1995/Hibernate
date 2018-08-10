package Select;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Delete {
static  AnnotationConfiguration cfg=new AnnotationConfiguration().configure();
    

    static SessionFactory factory = cfg.buildSessionFactory();
    static Session session = factory.openSession();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		Address add = (Address)session.get(Address.class, 502);
		session.delete(add);
		tx.commit();
		session.close();
	}

}

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class FetchData {

static  AnnotationConfiguration cfg=new AnnotationConfiguration().configure();
    

    static SessionFactory factory = cfg.buildSessionFactory();
    static Session session = factory.openSession();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Query query = session.getNamedQuery("findEmployeeByName");
		query.setString("name","taksh");
		
		List l = query.list();
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			Employee e = (Employee)itr.next();
			System.out.println(e);
		}
	}

}

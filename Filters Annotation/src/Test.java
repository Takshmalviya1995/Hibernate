import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Filter;
import org.hibernate.cfg.AnnotationConfiguration;
public class Test {
	
static  AnnotationConfiguration cfg=new AnnotationConfiguration().configure();
    

    static SessionFactory factory = cfg.buildSessionFactory();
    static Session session = factory.openSession();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

	System.out.println("Student Filter Name");
	System.out.println("***********************0000000000000000000000000000000000000000000000000********************************");
	
	Filter fil= session.enableFilter("statusFilter");
	fil.setParameter("id", 101);
	
	Query q = session.createQuery("from Student");
	List l = q.list();
	Iterator itr = l.iterator();
	while(itr.hasNext())
	{
		Student stu = (Student)itr.next();
		System.out.println("Student Name :"+stu.getName());
	}
	session.disableFilter("statusFilter");	
	}
}

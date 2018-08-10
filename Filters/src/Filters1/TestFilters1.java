package Filters1;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Filter;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestFilters1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		System.out.println("Student Filter Name");
		System.out.println("***********************0000000000000000000000000000000000000000000000000********************************");
		
		session.enableFilter("studentName");
		Query q = session.createQuery("from Student");
		List l = q.list();
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			Student stu = (Student)itr.next();
			System.out.println("Student Names which starting with 'c' :"+stu.getStudentName());
		}
		session.disableFilter("studentName");	
		
		System.out.println("Age Filter");
		System.out.println("***********************0000000000000000000000000000000000000000000000000********************************");
		 
		
		Filter filter = session.enableFilter("ageFilter");
	        filter.setParameter("age", 20);
	        Query query2 = session.createQuery("from Student s");
	        List list2 = query2.list();
	        Iterator it2 = list2.iterator();
	        while (it2.hasNext()) {
	            Student student = (Student) it2.next();
	            System.out.println("studentNames who are age >= 20 : " + student.getStudentName());
	        }
	        
	        // disabling the age filter after the operation
	        session.disableFilter("ageFilter");
	        
	        session.clear();
	        session.close();
	    }		
}
	


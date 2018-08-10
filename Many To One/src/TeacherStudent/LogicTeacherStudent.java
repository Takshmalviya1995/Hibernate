package TeacherStudent;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import CompanyClient.Client;
import CompanyClient.Company;

public class LogicTeacherStudent {
	
	static SessionFactory factory = new Configuration().configure().buildSessionFactory();
	static Session session = factory.openSession();
	public static void teacherAndStudent()
	{
		Teacher t = new Teacher();
		//parent object
		t.setTecId(101);
		t.setTecName("proff1");
		
		//creating 3 child objects
		Student s1 = new Student();
		s1.setStuId(501);
		s1.setStuName("prem");
		s1.setfId(t);
		
		
		Student s2 = new Student();
		s2.setStuId(502);
		s2.setStuName("dev");
		s2.setfId(t);
		
		Student s3 = new Student();
		s3.setStuId(503);
		s3.setStuName("rama");
		s3.setfId(t);
		
		Transaction tx = session.beginTransaction();
		session.save(s1);
		session.save(s2);
		session.save(s3);
		
		tx.commit();
		session.close();
		System.out.println("Many to One is done...");
		
	}
	public static void select()
	{
		Query qry=session.createQuery("from Student s");
		 
	     List l=qry.list();
	     Iterator it = l.iterator();
	     while(it.hasNext())
	     {
	      
	      Student st = (Student)it.next();
	      System.out.println(st.getStuName());
	      Teacher t=st.getfId();
	      System.out.println(t.getTecName());
	     }
	 
	     session.close();
	     System.out.println("many to one select done..!!");
	     factory.close();       
	}
}

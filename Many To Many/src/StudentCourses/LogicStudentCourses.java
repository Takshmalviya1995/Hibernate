package StudentCourses;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LogicStudentCourses {
	
	public static void main(String[] args)
	{
		
	 SessionFactory factory = new Configuration().configure().buildSessionFactory();
	 Session session = factory.openSession();
	
		Student s1 = new Student();
		s1.setStudentId(101);
		s1.setStudentName("jony");
		s1.setMarks(65);
		

		Student s2 = new Student();
		s2.setStudentId(102);
		s2.setStudentName("mony");
		s2.setMarks(56);
		
		Courses c1 = new Courses();
		c1.setCourseId(501);
		c1.setCourseName("JAVA");
		c1.setDuration(7);
		
		Courses c2 = new Courses();
		c2.setCourseId(502);
		c2.setCourseName("Hibernate");
		c2.setDuration(7);
		
		Set s = new HashSet(); 
		s.add(c1);
		s.add(c2);
		
		s1.setCourses(s);
		s2.setCourses(s);
		
		Transaction tx = session.beginTransaction();
		session.save(s1);
		session.save(s2);
		tx.commit();
		session.close();
		System.out.println("Many to Many Done");
	}
}

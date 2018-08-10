package Update;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class UpdateTest {
	static  AnnotationConfiguration cfg=new AnnotationConfiguration().configure();
      

     static SessionFactory factory = cfg.buildSessionFactory();
     static Session session = factory.openSession();
	
	public static void insert()
	{
		Teacher te = new Teacher();
		te.setTeacherId(501);
		te.setTeacherName("chaturvedi");
		
		Student st1 = new Student();
		st1.setStudentId(501);
		st1.setStudentName("ram");
		
		Student st2 = new Student();
		st2.setStudentId(502);
		st2.setStudentName("anuj");
		
		Set s = new HashSet();
		s.add(st1);
		s.add(st2);
		
		te.setChildren(s);
		
		Transaction tx = session.beginTransaction();
		session.save(te);
		tx.commit();
		session.close();
		
	}
	
	public static void update()
	{
		Transaction tx = session.beginTransaction();
		Student stu = (Student)session.get(Student.class, 501);
		stu.setStudentName("baba");
		session.update(stu);
		tx.commit();
		session.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UpdateTest ut = new UpdateTest();
		//ut.insert();
		
		ut.update();
	}

}

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

public class LogicTeacherAndStudent {
	
	static SessionFactory sessionfac = new Configuration().configure().buildSessionFactory();
	static Session session = sessionfac.openSession();
		
		
		public static void teacherAndStudent()
		{
			Teacher t = new Teacher();
			//parent object
			t.setTeachId(101);
			t.setName("proff1");
			
			t.setTeachId(102);
			t.setName("proff2");
			
			//creating 3 child objects
			Student s1 = new Student();
			s1.setRollno(501);
			s1.setName("prem");
			s1.setSubject("maths");
			
			
			Student s2 = new Student();
			s2.setRollno(502);
			s2.setName("dev");
			s2.setSubject("science");
			
			Student s3 = new Student();
			s3.setRollno(503);
			s3.setName("rama");
			s3.setSubject("English");
			
			Set s = new HashSet();
			s.add(s1);
			s.add(s2);
			s.add(s3);
			
			t.setChildren(s);
			
			Transaction tx = session.beginTransaction();
			session.save(t);
			
			tx.commit();
			session.close();
			System.out.println("One To Many is Done");
			sessionfac.close();
			
		}
		
		public static void T_A_S_Select()
		{
			Query q = session.createQuery("from Teacher t");
			List l = q.list();
			Iterator itr= l.iterator(); 
		
			while(itr.hasNext())
			{
			
				Teacher v = (Teacher)itr.next();
				System.out.println(v.getTeachId()+"........"+v.getName());
			
				Set s = v.getChildren();
				Iterator itr1 = s.iterator();
			
				while(itr1.hasNext())
				{
					Student st = (Student)itr1.next();
					System.out.println(st.getRollno()+"......"+st.getName()+"..."+st.getSubject()+"......"+st.getForevenId());
				}
			}		
		}
		public static void T_A_S_Select1()
		{
			
				Query q = session.getNamedQuery("selectonerecord1");
				q.setParameter(0,102);
				
				List l = q.list();
				Iterator itr = l.iterator();
				while(itr.hasNext())
				{
					Teacher v = (Teacher)itr.next();
					System.out.println(v.getTeachId()+"...."+v.getName());
					
					
					Set s = v.getChildren();
					Iterator itr1 = s.iterator();
					while(itr1.hasNext())
					{
						Student st = (Student)itr1.next();
						System.out.println(st.getRollno()+"......"+st.getName()+"..."+st.getSubject()+"......"+st.getForevenId());
					}
				}
		}
		
		public static void T_A_S_Update()
		{
			Transaction t = session.beginTransaction();
			Student st = new Student();
			st.setRollno(501);
			st.setName("hariom");
			st.setSubject("hindi");
			st.setForevenId(102);
			System.out.println(st.getRollno()+"...."+st.getName()+"..."+st.getSubject()+"....."+st.getForevenId());
			
			session.update(st);
			
			t.commit();
		}
		
		public static void T_A_S_Delete()
		{
			Transaction t = session.beginTransaction();
			Student c = new Student();
			c.setRollno(501);
			session.delete(c);
			t.commit();
		}
		
		public static void T_A_S_Get()
		{
			Student st = (Student)session.get(Student.class, 503);
			System.out.println(st.getRollno()+"...."+st.getName()+"..."+st.getSubject()+"....."+st.getForevenId());
			session.close();
		}   

}

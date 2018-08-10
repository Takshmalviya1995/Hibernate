package CompanyClient;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import DepartmentEmployee.Department;
import TeacherStudent.Student;
import TeacherStudent.Teacher;

public class LogicCompanyClient {
	static SessionFactory sessionfac = new Configuration().configure().buildSessionFactory();
	static Session session = sessionfac.openSession();
		
		
		public static void C_A_C_Insert1()
		{
			Company co = new Company();
			//parent object
			co.setCmpId(101);
			co.setCmpName("TCS");
			
			co.setCmpId(102);
			co.setCmpName("Wipro");
			
			//creating 3 child objects
			Client cl = new Client();
			cl.setClId(501);
			cl.setClname("Taksh");
			
			
			Client cl1 = new Client();
			cl1.setClId(502);
			cl1.setClname("Vishal");
			
			Client cl2 = new Client();
			cl2.setClId(503);
			cl2.setClname("Aachal");
			
			Set s = new HashSet();
			s.add(cl);
			s.add(cl1);
			s.add(cl2);
			
			co.setChildren(s);
			
			Transaction tx = session.beginTransaction();
			session.save(co);
			
			tx.commit();
			session.close();
			System.out.println("One To Many is Done");
			sessionfac.close();
			
		}
		public static void C_A_C_Select()
		{
			Query q = session.createQuery("from Company t");
			List l = q.list();
			Iterator itr= l.iterator(); 
		
			while(itr.hasNext())
			{
			
				Company co = (Company)itr.next();
				System.out.println(co.getCmpId()+"........"+co.getCmpName());
			
				Set s = co.getChildren();
				Iterator itr1 = s.iterator();
			
				while(itr1.hasNext())
				{
					Client cl = (Client)itr1.next();
					System.out.println(cl.getClId()+"......"+cl.getClname()+"......"+cl.getForevenId());
				}
			}		
		}
		public static void C_A_C_Select1()
		{
			
				Query q = session.getNamedQuery("selectonerecord3");
				q.setParameter(0,102);
				
				List l = q.list();
				Iterator itr = l.iterator();
				while(itr.hasNext())
				{
					Company co = (Company)itr.next();
					System.out.println(co.getCmpId()+"...."+co.getCmpName());
					
					
					Set s = co.getChildren();
					Iterator itr1 = s.iterator();
					while(itr1.hasNext())
					{
						Client cl = (Client)itr1.next();
						System.out.println(cl.getClId()+"......"+cl.getClname()+"......"+cl.getForevenId());
					}
				}
		}
		public static void C_A_C_Update()
		{
			Transaction t = session.beginTransaction();
			Client cl = new Client();
			cl.setClId(501);
			cl.setClname("hariom");
			cl.setForevenId(102);
			System.out.println(cl.getClId()+"...."+cl.getClname()+"....."+cl.getForevenId());
			
			session.update(cl);
			
			t.commit();
		}
		
		public static void C_A_C_Delete()
		{
			Transaction t = session.beginTransaction();
			Company co = (Company)session.get(Company.class,102);
			
			session.delete(co);
			t.commit();
		}
		
		public static void C_A_C_Get()
		{
			Client cl = (Client)session.get(Client.class, 503);
			System.out.println(cl.getClId()+"...."+cl.getClname()+"....."+cl.getForevenId());
			session.close();
		}  

}

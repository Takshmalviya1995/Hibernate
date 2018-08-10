package DoctorPatient;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class LogicDoctorPatient {
	
	static SessionFactory sessionfac = new Configuration().configure().buildSessionFactory();
	static Session session = sessionfac.openSession();
	
	public static void Insert1()
	{
		Doctor doc = new Doctor();
		doc.setDoctId(101);
		doc.setDoctName("kitty");;
		
		
		Patient pa1 = new Patient();
		pa1.setPatId(501);
		pa1.setPatName("bobby");
		
		Patient pa2 = new Patient();
		pa2.setPatId(502);
		pa2.setPatName("bob");
		
		Patient pa3 = new Patient();
		pa3.setPatId(503);
		pa3.setPatName("sohil");
		
		Set s = new HashSet();
		s.add(pa1);
		s.add(pa2);
		s.add(pa3);
		
		doc.setChildren(s);
		
		Transaction tx = session.beginTransaction();
		session.save(doc);
		
		tx.commit();
		session.close();
		System.out.println("One To Many is Done");
		sessionfac.close();
		
	}
	public static void D_A_P_Select()
	{
		Query q = session.createQuery("from Doctor d");
		List l = q.list();
		Iterator itr= l.iterator(); 
	
		while(itr.hasNext())
		{
		
			Doctor doc = (Doctor)itr.next();
			System.out.println(doc.getDoctId()+"........"+doc.getDoctName());
		
			Set s = doc.getChildren();
			Iterator itr1 = s.iterator();
		
			while(itr1.hasNext())
			{
				Patient pa = (Patient)itr1.next();
				System.out.println(pa.getPatId()+"......"+pa.getPatName()+"..."+pa.getForevenId());
			}
		}		
	}
	/*public static void D_A_E_Select1()
	{
		
			Query q = session.getNamedQuery("selectonerecord2");
			q.setParameter(0,102);
			
			List l = q.list();
			Iterator itr = l.iterator();
			while(itr.hasNext())
			{
				Department d = (Department)itr.next();
				System.out.println(d.getDeptid()+"...."+d.getDeptname());
				
				
				Set s = d.getChildren();
				Iterator itr1 = s.iterator();
				while(itr1.hasNext())
				{
					Employee e = (Employee)itr1.next();
					System.out.println(e.getEmpId()+"......"+e.getName()+"..."+e.getForevenId());
				}
			}
	}
	
	public static void D_A_E_Update()
	{
		Transaction t = session.beginTransaction();
		Employee e = new Employee();
		e.setEmpId(501);
		e.setName("hariom");
		e.setForevenId(102);
		System.out.println(e.getEmpId()+"...."+e.getName()+"..."+e.getForevenId());
		
		session.update(e);
		
		t.commit();
	}
	
	public static void D_A_E_Delete()
	{
		Transaction t = session.beginTransaction();
		Department d = (Department)session.get(Department.class,101);
		
		session.delete(d);
		t.commit();
	}
	
	public static void D_A_E_Get()
	{
		Employee e = (Employee)session.get(Employee.class, 503);
		System.out.println(e.getEmpId()+"...."+e.getName()+"..."+e.getForevenId());
		session.close();
	}*/

}

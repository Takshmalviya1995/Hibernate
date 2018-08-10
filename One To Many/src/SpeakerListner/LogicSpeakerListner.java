package SpeakerListner;

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
import DepartmentEmployee.Employee;

public class LogicSpeakerListner {

	static SessionFactory sessionfac = new Configuration().configure().buildSessionFactory();
	static Session session = sessionfac.openSession();
	
	public static void Insert1()
	{
		Speaker sp = new Speaker();
		sp.setSpId(101);
		sp.setSpname("om");
		
		//sp.setSpId(102);
		//sp.setSpname("radha");
		
		Listner li = new Listner();
		li.setLiId(510);
		li.setLiname("han");
		li.setLiqualification("me");
		
		Listner li1 = new Listner();
		li1.setLiId(502);
		li1.setLiname("dog");
		li1.setLiqualification("be");
		
		Listner li2 = new Listner();
		li2.setLiId(503);
		li2.setLiname("tony");
		li2.setLiqualification("ce");
		
		Set s = new HashSet();
		s.add(li);
		s.add(li1);
		s.add(li2);
		
		sp.setChildren(s);
		
		Transaction tx = session.beginTransaction();
		session.save(sp);
		
		tx.commit();
		session.close();
		System.out.println("One To Many is Done");
		sessionfac.close();
		
	}
	public static void S_A_L_Select()
	{
		Query q = session.createQuery("from Speaker d");
		List l = q.list();
		Iterator itr= l.iterator(); 
	
		while(itr.hasNext())
		{
		
			Speaker sp = (Speaker)itr.next();
			System.out.println(sp.getSpId()+"........"+sp.getSpname());
		
			Set s = sp.getChildren();
			Iterator itr1 = s.iterator();
		
			while(itr1.hasNext())
			{
				Listner li = (Listner)itr1.next();
				System.out.println(li.getLiId()+"......"+li.getLiname()+"...."+li.getLiqualification()+"..."+li.getForevenId());
			}
		}		
	}
	public static void S_A_L_Select1()
	{
		
			Query q = session.getNamedQuery("selectonerecordSAL");
			q.setParameter(0,102);
			
			List l = q.list();
			Iterator itr = l.iterator();
			while(itr.hasNext())
			{
				Speaker sp = (Speaker)itr.next();
				System.out.println(sp.getSpId()+"...."+sp.getSpname());
				
				
				Set s = sp.getChildren();
				Iterator itr1 = s.iterator();
				while(itr1.hasNext())
				{
					Listner li = (Listner)itr1.next();
					System.out.println(li.getLiId()+"......"+li.getLiname()+"..."+li.getLiqualification()+"...."+li.getForevenId());
				}
			}
	}
	
	public static void S_A_L_Update()
	{
		Transaction t = session.beginTransaction();
		Listner li = new Listner();
		li.setLiId(501);
		li.setLiname("hariom");
		li.setLiqualification("mcom");
		li.setForevenId(102);
		System.out.println(li.getLiId()+"......"+li.getLiname()+"..."+li.getLiqualification()+"...."+li.getForevenId());
		
		session.update(li);
		
		t.commit();
	}
	
	public static void S_A_L_Delete()
	{
		Transaction t = session.beginTransaction();
		Speaker sp = (Speaker)session.get(Speaker.class,101);
		
		session.delete(sp);
		t.commit();
	}
	
	public static void S_A_L_Get()
	{
		Listner li = (Listner)session.get(Listner.class, 503);
		System.out.println(li.getLiId()+"......"+li.getLiname()+"..."+li.getLiqualification()+"...."+li.getForevenId());
		session.close();
	}

}

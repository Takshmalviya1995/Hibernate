package StateDistrict;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LogicStateDistrict {
	static SessionFactory sessionfac = new Configuration().configure().buildSessionFactory();
	static Session session = sessionfac.openSession();
	
	public static void Insert1()
	{
		State st = new State();
		st.setStateId(101);
		st.setStateName("M.P.");
		
		District di1 = new District();
		di1.setDistrictId(501);
		di1.setDistrictName("Raisen");
		
		District di2 = new District();
		di2.setDistrictId(502);
		di2.setDistrictName("Sehore");
		
		District di3 = new District();
		di3.setDistrictId(503);
		di3.setDistrictName("Indore");
		
		Set s = new HashSet();
		s.add(di1);
		s.add(di2);
		s.add(di3);
		
		st.setChild(s);
		
		Transaction tx = session.beginTransaction();
		session.save(st);
		tx.commit();
		session.close();	
	}
	
	public static void select1()
	{
	Query q = session.createQuery("from State");
	List l = q.list();
	Iterator itr = l.iterator();
	while(itr.hasNext())
	{
		State st1 = (State)itr.next();
		System.out.println(st1.getStateId()+"..."+st1.getStateName());
		
		Set s = st1.getChild();
		Iterator itr2 = s.iterator();
		
		while(itr2.hasNext())
		{
			District di = (District)itr2.next();
			System.out.println(di.getDistrictId()+"....."+di.getDistrictName()+"...."+di.getForevenId());
		}
	}
	
	}
}

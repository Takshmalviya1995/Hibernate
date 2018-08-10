package UniversityCollege;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import ProductSuplier.Product;
import ProductSuplier.Suplier;



public class LogicUniversityCollege {

	static SessionFactory factory = new Configuration().configure().buildSessionFactory();
	static Session session = factory.openSession();

	public static void Insert1()
	{
		University un = new University();
		un.setUniverId(101);
		un.setUniverName("RGPV");
		
		College co1 = new College();
		co1.setCollegeId(501);
		co1.setCollegeName("bansal");
		
		College co2 = new College();
		co2.setCollegeId(502);
		co2.setCollegeName("prestige");
		
		College co3 = new College();
		co3.setCollegeId(503);
		co3.setCollegeName("LNCT");
		
		
		//One to Many
		Set s = new HashSet();
		s.add(co1);
		s.add(co2);
		s.add(co3);
			un.setChildren(s);
		//Many to one
		co1.setParentObjects(un);
		co2.setParentObjects(un);
		co3.setParentObjects(un);
		
		
		Transaction tx = session.beginTransaction();
		
		Serializable save = session.save(un);//;many to one
		//session.save(ma);//one to many
		
		tx.commit();
		session.close();
		System.out.println("One to many Bi-directional is done");
		factory.close();
	}
	public static void select1()//one to many
	{
		Object o=session.get(University.class, new Integer(101));
		University un=(University)o;
		System.out.println(un.getUniverId());
		System.out.println(un.getUniverName());
		 
		Set s=un.getChildren();
		Iterator it = s.iterator();
		 
		while(it.hasNext())
		{
		 
		Object o1 = it.next();
		College co = (College) o1;
		System.out.println("---------------------------");
		System.out.println("College objects...");
		System.out.println("---------------------------");
		System.out.println(co.getCollegeId());
		System.out.println(co.getCollegeName());
		System.out.println(co.getForevenId());
		System.out.println("---------------------------");
		}
		 
		session.close();
	}
}

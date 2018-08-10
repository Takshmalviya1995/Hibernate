package DepartmentEmployee;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onetomanyvendor.Customer;
import com.onetomanyvendor.Vendor;

public class LogicDepartmentEmployee {

	static SessionFactory sessionfac = new Configuration().configure().buildSessionFactory();
	static Session session = sessionfac.openSession();
	
	public static void Insert1()
	{
		Department d = new Department();
		d.setDeptid(101);
		d.setDeptname("cs");
		
		//d.setDeptid(102);
		//d.setDeptname("me");
		
		Employee e = new Employee();
		e.setEmpId(504);
		e.setName("raja");
		
		Employee e1 = new Employee();
		e1.setEmpId(505);
		e1.setName("goti");
		
		Employee e2 = new Employee();
		e2.setEmpId(506);
		e2.setName("sai");
		
		Set s = new HashSet();
		s.add(e);
		s.add(e1);
		s.add(e2);
		
		d.setChildren(s);
		
		Transaction tx = session.beginTransaction();
		session.save(d);
		
		tx.commit();
		session.close();
		System.out.println("One To Many is Done");
		sessionfac.close();
		
	}
	public static void D_A_E_Select()
	{
		Query q = session.createQuery("from Department d");
		List l = q.list();
		Iterator itr= l.iterator(); 
	
		while(itr.hasNext())
		{
		
			Department d = (Department)itr.next();
			System.out.println(d.getDeptid()+"........"+d.getDeptname());
		
			Set s = d.getChildren();
			Iterator itr1 = s.iterator();
		
			while(itr1.hasNext())
			{
				Employee e = (Employee)itr1.next();
				System.out.println(e.getEmpId()+"......"+e.getName()+"..."+e.getForevenId());
			}
		}		
	}
	public static void D_A_E_Select1()
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
	}
}

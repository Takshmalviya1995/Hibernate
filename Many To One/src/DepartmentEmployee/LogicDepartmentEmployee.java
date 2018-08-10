package DepartmentEmployee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import CompanyClient.Client;
import CompanyClient.Company;

public class LogicDepartmentEmployee {
	static SessionFactory factory = new Configuration().configure().buildSessionFactory();
	static Session session = factory.openSession();
	public static void Insert1()
	{
		
	Department d = new Department();
	d.setDeptid(101);
	d.setDeptname("dev1");
	
	Employee e1 = new Employee();
	e1.setEmpId(501);
	e1.setName("rama1");
	e1.setParentObjects(d);
	
	Employee e2 = new Employee();
	e2.setEmpId(502);
	e2.setName("omi1");
	e2.setParentObjects(d);
	
	Employee e3 = new Employee();
	e3.setEmpId(503);
	e3.setName("devi1");
	e3.setParentObjects(d);
	
	Transaction tx = session.beginTransaction();
	session.save(e1);
	session.save(e2);
	session.save(e3);
	
	tx.commit();
	session.close();
	System.out.println("Many to One is done...");
		
}
		public static void delete()
		{
			
			 
			     Transaction tx = session.beginTransaction();
			     Employee emp = (Employee)session.get(Employee.class, 507);
			     session.delete(emp);
			     tx.commit();
			 
			     session.close();
			     System.out.println("many to one delete done..!!");
			     factory.close();       
					
		}
}

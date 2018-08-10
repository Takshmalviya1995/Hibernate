package EmployeeProject;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LogicEmployeeProject {
	 static SessionFactory factory = new Configuration().configure().buildSessionFactory();
	 static Session session = factory.openSession();
	 
	 public static void Insert1()
	 {
		 Employee em1 = new Employee();
		em1.setEmployeeId(101);
		em1.setEmployeeName("jony");
		 
		 Employee em2 = new Employee();
		em2.setEmployeeId(102);
		em2.setEmployeeName("mony");
		 
		Project pr1 = new Project();
		 pr1.setProjectId(501);
		 pr1.setProjectName("Schoolmanag");
		 
		 Project pr2 = new Project();
		 pr2.setProjectId(502);
		 pr2.setProjectName("Librarymanag");
		 
		 Set s = new HashSet();
		s.add(pr1);
		s.add(pr2);
		
		em1.setProject(s);
		em2.setProject(s);
		
		Transaction tx = session.beginTransaction();
		session.save(em1);
		session.save(em2);
		tx.commit();
		session.close();
		System.out.println("Many to Many Done");
	 }
	 
	 public static void select1()
	 {
		 List employee= session.createQuery("from Employee").list();
		 Iterator itr = employee.iterator();
		 while(itr.hasNext())
		 {
			 Employee emp=(Employee)itr.next();
			 System.out.println("EmpId : "+emp.getEmployeeId());
			 System.out.println("EmpName: "+emp.getEmployeeName());
			 
			 Set project = emp.getProject();
			 Iterator itr2 = project.iterator();
	            while (itr2.hasNext())
	            {
	               Project pro = (Project) itr2.next(); 
	               System.out.println("ProjectID: " + pro.getProjectId());
	               System.out.println("ProjectName: "+pro.getProjectName());
	            }
		 }
	 }
}
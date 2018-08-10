package Filters2;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		System.out.println("Employee Filter Name");
		System.out.println("***********************0000000000000000000000000000000000000000000000000********************************");
		
		session.enableFilter("employeeName");
		Query q = session.createQuery("from Employee e");
		List l = q.list();
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			Employee emp = (Employee)itr.next();
			System.out.println(emp.getEmployeeId()+"..."+emp.getName()+"...."+emp.getSalary()+"...."+emp.getAge()+"..."+emp.getCity());
		}
		session.disableFilter("employeeName");
		session.clear();
		session.close();
	} 

}

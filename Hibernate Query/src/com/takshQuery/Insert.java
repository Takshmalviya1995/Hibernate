package com.takshQuery;
import org.hibernate.cfg.*; 
import org.hibernate.*; 
public class Insert {
	
	public static void main(String[] args)throws Exception
	{
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
		Session session=sessionFactory.openSession();
		Transaction t = session.beginTransaction();
				
				UserDTO obj = new UserDTO();
				obj.setName("ashok");
				obj.setAge(19);
				obj.setSalary(57799);
				obj.setLocation("BHOJPUR");
				session.save(obj);
				t.commit();
				session.close();
				System.out.println("Record Insert Successfully");
	}

}

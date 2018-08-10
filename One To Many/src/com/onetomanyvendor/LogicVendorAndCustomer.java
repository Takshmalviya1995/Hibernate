package com.onetomanyvendor;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LogicVendorAndCustomer {

	static SessionFactory sessionfac = new Configuration().configure().buildSessionFactory();
	static Session session = sessionfac.openSession();
		
		
		public static void vendorAndCustomer()
		{
			Vendor v = new Vendor();
			//parent object
			v.setVendorId(101);
			v.setVendorName("Ram");
			
			//v.setVendorId(102);
			//v.setVendorName("charan");
			
			//creating 3 child objects
			Customer c1 = new Customer();
			c1.setCustomerId(508);
			c1.setCustomerName("hari");
			
			Customer c2 = new Customer();
			c2.setCustomerId(509);
			c2.setCustomerName("prashad");
			
			Customer c3 = new Customer();
			c3.setCustomerId(510);
			c3.setCustomerName("sharma");
			
			Set s = new HashSet();
			s.add(c1);
			s.add(c2);
			s.add(c3);
			
			v.setChildren(s);
			
			Transaction tx = session.beginTransaction();
			session.save(v);
			
			tx.commit();
			session.close();
			System.out.println("One To Many is Done");
			sessionfac.close();
			
		}
		
		public static void V_A_C_Select()
		{
			Query q = session.createQuery("from Vendor v");
			List l = q.list();
			Iterator itr= l.iterator(); 
		
			while(itr.hasNext())
			{
			
				Vendor v = (Vendor)itr.next();
				System.out.println(v.getVendorId()+"........"+v.getVendorName());
			
				Set s = v.getChildren();
				Iterator itr1 = s.iterator();
			
				while(itr1.hasNext())
				{
					Customer c = (Customer)itr1.next();
					System.out.println(c.getCustomerId()+"......"+c.getCustomerName()+"..."+c.getForevenId());
				}
			}		
		}
		public static void V_A_C_Select1()
		{
			
				Query q = session.getNamedQuery("selectonerecord");
				q.setParameter(0,101);
				
				List l = q.list();
				Iterator itr = l.iterator();
				while(itr.hasNext())
				{
					Vendor v = (Vendor)itr.next();
					System.out.println(v.getVendorId()+"...."+v.getVendorName());
					
					
					Set s = v.getChildren();
					Iterator itr1 = s.iterator();
					while(itr1.hasNext())
					{
						Customer c = (Customer)itr1.next();
						System.out.println(c.getCustomerId()+"......"+c.getCustomerName()+"..."+c.getForevenId());
					}
				}
		}
		
		public static void V_A_C_Update()
		{
			Transaction t = session.beginTransaction();
			Customer c = new Customer();
			c.setCustomerId(501);
			c.setCustomerName("hariom");
			c.setForevenId(102);
			System.out.println(c.getCustomerId()+"...."+c.getCustomerName()+"..."+c.getForevenId());
			
			session.update(c);
			
			t.commit();
		}
		
		public static void V_A_C_Delete()
		{
			Transaction t = session.beginTransaction();
			Vendor v = (Vendor)session.get(Vendor.class,101);
			
			session.delete(v);
			t.commit();
		}
		
		public static void V_A_C_Get()
		{
			Customer c = (Customer)session.get(Customer.class, 503);
			System.out.println(c.getCustomerId()+"...."+c.getCustomerName()+"..."+c.getForevenId());
			session.close();
		}
}

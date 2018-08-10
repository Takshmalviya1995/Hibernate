package com.Cache;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;





public class QueryLevelCacheWithUpdate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SessionFactory sessionfac = new Configuration().configure().buildSessionFactory();
		
		
		Session s1 = sessionfac.openSession();
		
		
		
		for(int i=0;i<3;i++)
		{
			Transaction tr = s1.beginTransaction();	
		UserDTO obj1 = (UserDTO) s1.load(UserDTO.class, 2);
		
		System.out.println("Name is "+obj1.getName());
		Thread.sleep(3000);
		
		
		obj1.setName("hari-ram3");
		s1.update(obj1);
		tr.commit();
		
		}
		s1.close();
		}
		
	}




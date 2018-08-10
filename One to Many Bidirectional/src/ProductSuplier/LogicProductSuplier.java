package ProductSuplier;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class LogicProductSuplier {
	
		static SessionFactory factory = new Configuration().configure().buildSessionFactory();
		static Session session = factory.openSession();

		public static void Insert1()
		{
			Product pr = new Product();
			pr.setProductId(101);
			pr.setProductDesc("pen");
			pr.setProductPrice(100);
			
			Suplier su1 = new Suplier();
			su1.setSuplierId(501);
			su1.setSuplierName("ramesh");
			su1.setSupplierAdd("indore");
			
			Suplier su2 = new Suplier();
			su2.setSuplierId(502);
			su2.setSuplierName("jony");
			su2.setSupplierAdd("ratlam");
			
			Suplier su3 = new Suplier();
			su3.setSuplierId(503);
			su3.setSuplierName("mony");
			su3.setSupplierAdd("bhopal");
			
			//One to Many
			Set s = new HashSet();
			s.add(su1);
			s.add(su2);
			s.add(su3);
				pr.setChildren(s);
			//Many to one
			su1.setParentObjects(pr);
			su2.setParentObjects(pr);
			su3.setParentObjects(pr);
			
			Transaction tx = session.beginTransaction();
			
			session.save(su1);//;many to one
			//session.save(pr);//one to many
			
			tx.commit();
			session.close();
			System.out.println("One to many Bi-directional is done");
			factory.close();
		}
		
		public static void select()//many to one
		{
			Query qry=session.createQuery("from Suplier s");
			 
		     List l=qry.list();
		     Iterator it = l.iterator();
		     while(it.hasNext())
		     {
		      
		    	 Suplier su = (Suplier)it.next();
		      System.out.println(su.getSuplierName()+"..."+su.getSupplierAdd());
		      System.out.println(su.getParentObjects());
		      Product pr=su.getParentObjects();
		      System.out.println(pr.getProductDesc()+"...."+pr.getProductPrice()+"..."+pr.getProductId());
		     }
		 
		     session.close();
		    
		     factory.close();  
		}
		public static void select1()//one to many
		{
			Object o=session.get(Product.class, new Integer(101));
			Product pr=(Product)o;
			System.out.println(pr.getProductId());
			System.out.println(pr.getProductDesc());
			System.out.println(pr.getProductPrice());
			 
			Set s=pr.getChildren();
			Iterator it = s.iterator();
			 
			while(it.hasNext())
			{
			 
			Object o1 = it.next();
			Suplier su = (Suplier) o1;
			System.out.println("---------------------------");
			System.out.println("Suplier objects...");
			System.out.println("---------------------------");
			System.out.println(su.getSuplierId());
			System.out.println(su.getSuplierName());
			System.out.println(su.getSupplierAdd());
			System.out.println(su.getForevenId());
			System.out.println("---------------------------");
			}
			 
			session.close();
		}
}

package Insert;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class InsertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AnnotationConfiguration cfg=new AnnotationConfiguration();
	        cfg.configure("hibernate.cfg.xml");
	 
	        SessionFactory factory = cfg.buildSessionFactory();
	        Session session = factory.openSession();
	        
	        Vendor ve = new Vendor();
	        ve.setVendorId(101);
	        ve.setVendorName("airtel");
	        
	        Customer cu1 = new Customer();
	        cu1.setCustomerId(501);
	        cu1.setCustomerName("taksh");
	        
	        Customer cu2 = new Customer();
	        cu2.setCustomerId(502);
	        cu2.setCustomerName("vishal");
	        
	        Set s = new HashSet();
	        s.add(cu1);
	        s.add(cu2);
	        
	        ve.setChildren(s);
	        Transaction tx = session.beginTransaction();
	        session.save(ve);
	        tx.commit();
	        session.close();
	}

}

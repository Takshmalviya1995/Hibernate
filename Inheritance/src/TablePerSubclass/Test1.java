package TablePerSubclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		CreditCard1 cc = new CreditCard1();
		cc.setPaymentId(10);
		cc.setAmount(5000);
		cc.setCreditCardType("Visa");
		
		Cheque1 ch = new Cheque1();
		ch.setPaymentId(11);
		ch.setAmount(2500);
		ch.setChequeType("ICICI");
		
		Transaction tx = session.beginTransaction();
		session.save(cc);
		session.save(ch);
		
		System.out.println("save successfully");
		tx.commit();
		session.close();		
	}

}

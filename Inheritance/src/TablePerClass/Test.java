package TablePerClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		CreditCard cc = new CreditCard();
		cc.setPaymentId(10);
		cc.setAmount(5000);
		cc.setCreditCardType("Visa");
		
		Cheque ch = new Cheque();
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

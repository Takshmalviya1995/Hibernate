package TablePerConcrete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		CreditCard2 cc = new CreditCard2();
		cc.setPaymentId(12);
		cc.setAmount(500);
		cc.setCreditCardType("Visa");
		
		cc.setPaymentId(11);
		cc.setAmount(5200);
		cc.setCreditCardType("icici");
		
		/*Cheque2 ch = new Cheque2();
		ch.setPaymentId(11);
		ch.setAmount(2500);
		ch.setChequeType("ICICI");
		*/
		Transaction tx = session.beginTransaction();
		session.save(cc);
		//session.save(ch);
		
		System.out.println("save successfully");
		tx.commit();
		session.close();		
	}

}

package TablePerConcrete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import TablePerSubClass.Cheque1;
import TablePerSubClass.CreditCard1;
import TablePerSubClass.Payment1;

public class TestPayment2 {

static  AnnotationConfiguration cfg=new AnnotationConfiguration().configure();
    

    static SessionFactory factory = cfg.buildSessionFactory();
    static Session session = factory.openSession();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Payment2 pa = new Payment2();
		//pa.setPaymentId(101);
		pa.setAmount(5000);
		
		Cheque2 ch = new Cheque2();
		ch.setAmount(100);
		ch.setChequeNumber(301);
		ch.setChequeType("order");
		
		CreditCard2 cc = new CreditCard2();
		cc.setAmount(300);
		cc.setCardNumer(401);
		cc.setCardType("icici");
		
		Transaction tx = session.beginTransaction();
		session.save(pa);
		session.save(ch);
		session.save(cc);
		tx.commit();
		session.close();
	}

}

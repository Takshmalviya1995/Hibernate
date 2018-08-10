package TablePerClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestPament {

	
static  AnnotationConfiguration cfg=new AnnotationConfiguration().configure();
    

    static SessionFactory factory = cfg.buildSessionFactory();
    static Session session = factory.openSession();
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cheque ch = new Cheque();
		ch.setChequeNumber(101);
		ch.setChequeType("order");
		ch.setPaymentId(203);
		ch.setAmount(500);
		
		CreditCard cc = new CreditCard();
		cc.setCardNumer(501);
		cc.setCardType("icici");
		cc.setPaymentId(204);
		cc.setAmount(3002);
		
		Transaction tx = session.beginTransaction();
		session.save(ch);
		session.save(cc);
		tx.commit();
		session.close();
	}

}

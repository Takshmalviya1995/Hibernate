package TablePerSubClass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestPayment1 {

	

    

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Inheritance");
    static EntityManager em = emf.createEntityManager();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Payment1 pa = new Payment1();
		//pa.setPaymentId(101);
		pa.setAmount(5000);
		
		Cheque1 ch = new Cheque1();
		ch.setAmount(100);
		ch.setChequeNumber(301);
		ch.setChequeType("order");
		
		CreditCard1 cc = new CreditCard1();
		cc.setAmount(300);
		cc.setCardNumer(401);
		cc.setCardType("icici");
		
		em.getTransaction().begin();
		em.persist(pa);
		em.persist(ch);
		em.persist(cc);
		em.getTransaction().commit();
		em.close();
	}

}

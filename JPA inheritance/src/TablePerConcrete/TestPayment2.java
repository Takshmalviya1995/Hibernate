package TablePerConcrete;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import TablePerSubClass.Cheque1;
import TablePerSubClass.CreditCard1;
import TablePerSubClass.Payment1;

public class TestPayment2 {


    

   static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Inheritance");
   static EntityManager em = emf.createEntityManager();
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
		
		em.getTransaction().begin();
		em.persist(pa);
		em.persist(ch);
		em.persist(cc);
		em.getTransaction().commit();
		em.close();
	}

}

package TablePerClass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Transaction;

public class TestPayment {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Inheritance");
	static EntityManager em = emf.createEntityManager();
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
		
		em.getTransaction().begin();
		em.persist(ch);
		em.persist(cc);
		em.getTransaction().commit();
		em.close();
	}

}

package delete;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestDelete {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("NORMAL");
	
	static EntityManager em = emf.createEntityManager();
	
	public static void insert()
	{
		em.getTransaction().begin();
		
		Children ch = new Children();
		ch.setId(103);
		ch.setName("molu");
		
		em.persist(ch);
		em.getTransaction().commit();
		em.close();
		emf.close();	
	}
	
	public static void delete1()
	{
		em.getTransaction().begin();
		
		Children ch = em.find(Children.class, 101);
		em.remove(ch);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestDelete td = new TestDelete();
		//td.insert();
		td.delete1();
	}

}

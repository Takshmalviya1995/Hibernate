package update;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestOwner {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("NORMAL");
	static EntityManager em = emf.createEntityManager();
	
	public static void insert()
	{
		em.getTransaction().begin();
		Owner ow = new Owner();
		ow.setId(101);
		ow.setName("ramesh");
		ow.setSalary(5000);
		ow.setAge(22);
		
		em.persist(ow);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
	
	public static void update1()
	{
		em.getTransaction().begin();
		Owner ow = em.find(Owner.class, 101);
		ow.setName("dev");
		ow.setSalary(100);
		ow.setAge(55);
		
		em.merge(ow);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestOwner to = new TestOwner();
		//to.insert();
		to.update1();
		
	}

}

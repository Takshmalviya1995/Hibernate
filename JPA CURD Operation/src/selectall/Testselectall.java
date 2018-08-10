package selectall;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Testselectall {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("NORMAL");
	static EntityManager em = emf.createEntityManager();
	
	public static void insert()
	{
		em.getTransaction().begin();
		Faculty fa = new Faculty();
		fa.setId(103);
		fa.setName("kk");
		em.persist(fa);
		em.getTransaction().commit();
		em.close();	
		
	}
	public static void selectall1()
	{
		Query q = em.createQuery("from Faculty");
		List l = q.getResultList();
		Iterator itr = l.iterator();
		
		while(itr.hasNext())
		{
			Faculty fa = (Faculty)itr.next();
			System.out.println("Id: "+fa.getId());
			System.out.println("Name: "+fa.getName());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testselectall ts = new Testselectall();
		//ts.insert();
		ts.selectall1();
	}

}

package stateCountry;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;






public class Test {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaManyToOne");
	static EntityManager em = emf.createEntityManager();
	
	public static void insert()
	{
		Country c = new Country();
    	c.setCountryId(101);
    	c.setCountryName("india");
    	
    	State st1 = new State();
    	st1.setStateid(501);
    	st1.setStateName("mp");
    	st1.setParent(c);
    	
    	State st2 = new State();
    	st2.setStateid(502);
    	st2.setStateName("up");
    	st2.setParent(c);
    	
    	
    	
    	em.getTransaction().begin();
    	em.persist(st1);
    	em.persist(st2);
    	
    	em.getTransaction().commit();
    	em.close();
	}
	 public static void select()
	    {
	    	Query q = em.createQuery("from State");
	    	List l = q.getResultList();
	    	Iterator itr = l.iterator();
	    	while(itr.hasNext())
	    	{
	    		State st = (State)itr.next();
	    		System.out.println(st.getStateid()+"..."+st.getStateName()+"...");
	    		
	    		
	    		Country co = st.getParent();
	    		System.out.println(co.getCountryId()+"..."+co.getCountryName()+"...");	
	    	}
	    	em.close();
	    }
	 public static void update()
	 {
		 em.getTransaction().begin();
		 State s = (State)em.find(State.class, 501);
		 s.setStateName("goa");
		 em.merge(s);
		 em.getTransaction().commit();
		 em.close();
	 }
	 public static void delete()
	 {
		 em.getTransaction().begin();
		 State s = (State)em.find(State.class, 502);
		 em.remove(s);
		 em.getTransaction().commit();
		 em.close();
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		//t.insert();
		//t.select();
		//t.update();
		t.delete();
	}

}

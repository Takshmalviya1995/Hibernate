package professorstudent;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class Test {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaOneToMany");
	
	static EntityManager em = emf.createEntityManager();
	
	public static void insert()
	{
		Proffessor po = new Proffessor();
		po.setProffid(102);
		po.setName("sonam");
		
		Student st1 = new Student();
		st1.setStuid(503);
		st1.setName("hari");
		
		Student st2 = new Student();
		st2.setStuid(504);
		st2.setName("om");
		
		Set s = new HashSet();
		s.add(st1);
		s.add(st2);
		po.setChildren(s);
		
		em.getTransaction().begin();
		em.persist(po);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public static void delete()
	{
		em.getTransaction().begin();
		Student stu = (Student)em.find(Student.class, 503);
		em.remove(stu);
		em.getTransaction().commit();
		em.close();
	}
	public static void select()
    {
    	Query q = em.createQuery("from Proffessor");
    	List l = q.getResultList();
    	Iterator itr = l.iterator();
    	while(itr.hasNext())
    	{
    		Proffessor pr = (Proffessor)itr.next();
    		System.out.println(pr.getProffid()+"...."+pr.getName()+"....");
    		Set s = pr.getChildren();
    		Iterator itr1 = s.iterator();
    		while(itr1.hasNext())
    		{
    			Student st = (Student)itr1.next();
    			System.out.println(st.getStuid()+"..."+st.getName()+"...");
    		}
    		
    	}
    	
    }
	
	public static void update()
	{
		em.getTransaction().begin();
		Student stu = (Student)em.find(Student.class, 503);
		stu.setName("jonny");
		em.merge(stu);
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

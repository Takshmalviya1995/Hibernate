package Select;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class SelectTest {
static  AnnotationConfiguration cfg=new AnnotationConfiguration().configure();
    

    static SessionFactory factory = cfg.buildSessionFactory();
    static Session session = factory.openSession();
    
    public static void insert() 
    {
    	Country c = new Country();
    	c.setCountryId(101);
    	c.setCountryName("india");
    	
    	State st1 = new State();
    	st1.setStateId(501);
    	st1.setStateName("mp");
    	st1.setParent(c);
    	
    	State st2 = new State();
    	st2.setStateId(502);
    	st2.setStateName("up");
    	st2.setParent(c);
    	
    	Transaction tx = session.beginTransaction();
    	session.save(st1);
    	session.save(st2);
    	tx.commit();
    	session.close();
    }
    public static void select()
    {
    	Query q = session.createQuery("from State");
    	List l = q.list();
    	Iterator itr = l.iterator();
    	while(itr.hasNext())
    	{
    		State st = (State)itr.next();
    		System.out.println(st.getStateId()+"..."+st.getStateName()+"...");
    		
    		
    		Country co = st.getParent();
    		System.out.println(co.getCountryId()+"..."+co.getCountryName()+"...");	
    	}
    	session.close();
    }
    public static void main(String[] args)
    {
    	SelectTest st = new SelectTest();
    	//st.insert();
    	st.select();
    }
}

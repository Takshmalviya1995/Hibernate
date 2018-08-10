package Select;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
    	Speaker sp = new Speaker();
    	sp.setSpeakerid(101);
    	sp.setSpeakerName("raja");
    	
    	Listner li1 = new Listner();
    	li1.setListnerId(501);
    	li1.setListnerName("dev");
    	
    	Listner li2 = new Listner();
    	li2.setListnerId(502);
    	li2.setListnerName("madhu");
    	
    	Set s = new HashSet();
    	s.add(li1);
    	s.add(li2);
    	
    	sp.setChildren(s);
    	
    	Transaction tx = session.beginTransaction();
    	session.save(sp);
    	tx.commit();
    	session.close();
    }
    
    public static void select()
    {
    	Query q = session.createQuery("from Speaker");
    	List l = q.list();
    	Iterator itr = l.iterator();
    	while(itr.hasNext())
    	{
    		Speaker sp = (Speaker)itr.next();
    		System.out.println(sp.getSpeakerid()+"...."+sp.getSpeakerName()+"....");
    		Set s = sp.getChildren();
    		Iterator itr1 = s.iterator();
    		while(itr1.hasNext())
    		{
    			Listner li = (Listner)itr1.next();
    			System.out.println(li.getListnerId()+"..."+li.getListnerName()+"...");
    		}
    		
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectTest st = new SelectTest();
		//st.insert();
		st.select();
	}

}

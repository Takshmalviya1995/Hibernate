package Update;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class UpdateTest {
static  AnnotationConfiguration cfg=new AnnotationConfiguration().configure();
    

    static SessionFactory factory = cfg.buildSessionFactory();
    static Session session = factory.openSession();
    
    public static void insert()
    {
    	Person pe = new Person();
    	pe.setPersonId(101);
    	pe.setPersonName("dev");
    	
    	Mobile mo1 = new Mobile();
    	mo1.setMobileId(501);
    	mo1.setMobileName("lenovo");
    	mo1.setParent(pe);
    	
    	Mobile mo2 = new Mobile();
    	mo2.setMobileId(502);
    	mo2.setMobileName("apple");
    	mo1.setParent(pe);
    	
    	Transaction tx = session.beginTransaction();
    	session.save(mo1);
    	session.save(mo2);
    	tx.commit();
    	session.close();
    }
    
    public static void update()
    {
    	Transaction tx = session.beginTransaction();
    	Person pe = (Person)session.get(Person.class, 101);
    	pe.setPersonName("kkkk");
    	session.update(pe);
    	tx.commit();
    	session.close();
    }
	public static void main(String[] args) {
	
		UpdateTest ut = new UpdateTest();
		//ut.insert();
		ut.update();
	}

}

package Select;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Select1 {
static  AnnotationConfiguration cfg=new AnnotationConfiguration().configure();
    

    static SessionFactory factory = cfg.buildSessionFactory();
    static Session session = factory.openSession();
    
    public static void main(String[] args)
    {
    	List li = session.createQuery("from Address").list();
    	Iterator itr = li.iterator();
    	while(itr.hasNext())
    	{
    		Address add = (Address)itr.next();
    		System.out.println(add.getAddressId()+"..."+add.getPlace());
    		
    		Student st = add.getParent();
    		System.out.println(st.getStudentId()+"..."+st.getStudentName());
    	}
    			
    }
}

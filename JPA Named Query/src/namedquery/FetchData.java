package namedquery;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class FetchData {

static EntityManagerFactory emf = Persistence.createEntityManagerFactory("NamedQuery");
static EntityManager em = emf.createEntityManager();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Query query = em.createNamedQuery("findEmployeeByName");
		query.setParameter("name","taksh");
		
		List l = query.getResultList();
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			Employee e = (Employee)itr.next();
			System.out.println(e);
		}
	}

}

package select;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestSelect {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "NORMAL" );
     
    static  EntityManager entitymanager = emfactory.createEntityManager( );
     
    public static void insert()
	{
	entitymanager.getTransaction( ).begin( );
	Car ca = new Car();
	ca.setId(101);
	ca.setName("maruti");
	entitymanager.persist(ca);
	entitymanager.getTransaction().commit();
	entitymanager.close();
	emfactory.close();
	}
    public static void select1()
    {
    	Car ca = entitymanager.find(Car.class, 101);
    	System.out.println("CarID: "+ca.getId());
    	System.out.println("Car Name: "+ca.getName());
    	
    	
    }
    
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSelect ts = new TestSelect();
		//ts.insert();
		ts.select1();
		
	}

}

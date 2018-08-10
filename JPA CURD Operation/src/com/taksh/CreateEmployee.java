package com.taksh;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreateEmployee {
	public static void main( String[ ] args )
	{
		   
	      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "NORMAL" );
	      
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );

	      Employee employee = new Employee( ); 
	     
	      employee.setEname( "radha" );
	      employee.setSalary( 50000 );
	      employee.setDeg( "Genaral Manager" );
	      
	      entitymanager.persist( employee );
	      entitymanager.getTransaction( ).commit( );

	      entitymanager.close( );
	      emfactory.close( );
	   }
}

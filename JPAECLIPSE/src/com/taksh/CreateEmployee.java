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

	      Employee1 employee = new Employee1( ); 
	     
	      employee.setEname( "sita" );
	      employee.setSalary( 90000 );
	      employee.setDeg( "Depti Manager" );
	      
	      entitymanager.persist( employee );
	      entitymanager.getTransaction( ).commit( );

	      entitymanager.close( );
	      emfactory.close( );
	   }
}

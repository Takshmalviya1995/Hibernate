package aggregate;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestStudent {
static EntityManagerFactory emf = Persistence.createEntityManagerFactory("AggregationFunction");
static EntityManager em = emf.createEntityManager();

public static void insert()
{
	em.getTransaction().begin();
	Student st = new Student();
	st.setId(111);
	st.setName("shubham");
	st.setMarks(90);
	st.setAge(10);
	em.persist(st);
	em.getTransaction().commit();
	em.close();	
}

public static void jpaGetMax()
{
	Query q = em.createQuery("select max(marks) from Student");
	List l = q.getResultList();
	Integer marks= (Integer)l.get(0);
	System.out.println("MAX MARKS: "+marks);
	
}
public static void jpaGetMin()
{
	Query q = em.createQuery("select min(marks) from Student");
	List l = q.getResultList();
	Integer marks= (Integer)l.get(0);
	System.out.println("MIN MARKS: "+marks);
}
public static void jpaSum()
{
	Query q = em.createQuery("select sum(marks) from Student");
	List l = q.getResultList();
	Long marks= (Long)l.get(0);
	System.out.println("SUM OF MARKS: "+marks);
}

public static void jpaCount()
{
	Query q = em.createQuery("select count(marks) from Student");
	List l = q.getResultList();
	Long marks= (Long)l.get(0);
	System.out.println("COUNT OF MARKS: "+marks);
}

public static void jpaAverage()
{
	Query q = em.createQuery("select avg(marks) from Student");
	List l = q.getResultList();
	Double marks= (Double)l.get(0);
	System.out.println("AVERAGE OF MARKS: "+marks);
}




public static void sqlGetMax()
{
	Query q = em.createNativeQuery("select max(marks) from student");
	List l = q.getResultList();
	Integer marks= (Integer)l.get(0);
	System.out.println("SQL MAX MARKS: "+marks);
	
}
public static void sqlGetMin()
{
	Query q = em.createNativeQuery("select min(marks) from student");
	List l = q.getResultList();
	Integer marks= (Integer)l.get(0);
	System.out.println("SQL MIN MARKS: "+marks);
}
public static void sqlSum()
{
	Query q = em.createNativeQuery("select sum(marks) from student");
	List l = q.getResultList();
	BigDecimal marks= (BigDecimal)l.get(0);
	System.out.println("SQL SUM OF MARKS: "+marks);
}

public static void sqlCount()
{
	Query q = em.createNativeQuery("select count(marks) from student");
	List l = q.getResultList();
	BigInteger marks= (BigInteger)l.get(0);
	System.out.println("SQL COUNT OF MARKS: "+marks);
}

public static void sqlAverage()
{
	Query q = em.createNativeQuery("select avg(marks) from student");
	List l = q.getResultList();
	BigDecimal marks= (BigDecimal)l.get(0);
	System.out.println("SQL AVERAGE OF MARKS: "+marks);
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	TestStudent ts = new TestStudent();
	//ts.insert();
System.out.println("+++++++++++**********JPA QUERY**************+++++++++");
System.out.println("  ");
	
	jpaGetMax();
	jpaGetMin();
	jpaSum();
	jpaCount();
	jpaAverage();	
	System.out.println("  ");	
System.out.println("++++++++++++*************SQL QUERY*************++++++++++");
System.out.println("  ");
sqlGetMax();
sqlGetMin();
sqlSum();
sqlCount();
sqlAverage();
	
	}
}

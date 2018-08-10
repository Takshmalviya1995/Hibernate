package FilmActor;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LogicFilmActor {
	 static SessionFactory factory = new Configuration().configure().buildSessionFactory();
	 static Session session = factory.openSession();
	 
	 public static void insert1()
	 {
		 Film fi1 = new Film();
		 fi1.setFilmId(101);
		 fi1.setFilmName("apne");
		 
		 Film fi2 = new Film();
		 fi2.setFilmId(102);
		 fi2.setFilmName("POC");
		 
		 Actor ac1 = new Actor();
		 ac1.setActorId(501);
		 ac1.setActorName("Tom");
		 
		 Actor ac2 = new Actor();
		 ac2.setActorId(502);
		 ac2.setActorName("Jhonny");
		 
		 Set s = new HashSet();
		 s.add(ac1);
		 s.add(ac2);
		 
		 fi1.setActor(s);
		 fi2.setActor(s);
		 
		 Transaction tx = session.beginTransaction();
			session.save(fi1);
			session.save(fi2);
			tx.commit();
			session.close();
			System.out.println("Many to Many Done");
		 }
	 public static void updateRec()
	 {
		 Transaction tx = session.beginTransaction();
		 Actor ac = (Actor)session.get(Actor.class, 501);
		 ac.setActorName("Amir");
         session.update(ac);
         tx.commit();
         session.close();
	 }
}

package ArtistSong;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LogicArtistSong {
	 static SessionFactory factory = new Configuration().configure().buildSessionFactory();
	 static Session session = factory.openSession();
	 public static void insert1()
	 {
		 Artist ar1 = new Artist();
		 ar1.setArtistId(101);
		 ar1.setArtistName("abhi");
		 
		 Artist ar2 = new Artist();
		 ar2.setArtistId(102);
		 ar2.setArtistName("jeet");
		 
		 Song so1 = new Song();
		 so1.setSongId(501);
		 so1.setSongName("motivational");
		 
		 Song so2 = new Song();
		 so2.setSongId(502);
		 so2.setSongName("spritual");
		 
		 Set s = new HashSet();
		 s.add(so1);
		 s.add(so2);
		 
		 ar1.setSong(s);
		 ar2.setSong(s);
		 
		 Transaction tx = session.beginTransaction();
			session.save(ar1);
			session.save(ar2);
			tx.commit();
			session.close();
			System.out.println("Many to Many Done");
	 }
	 public static void delete1()
	 {
		 Transaction tx = session.beginTransaction();
		 Artist ar = (Artist)session.get(Artist.class, 101);
		 //Song so = (Song)session.get(Song.class,501);
		 session.delete(ar);
		 tx.commit();
		 session.close();
	 }
}

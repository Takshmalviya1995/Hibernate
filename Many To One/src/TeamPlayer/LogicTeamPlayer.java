package TeamPlayer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import SpeakerListner.Listner;
import SpeakerListner.Speaker;

public class LogicTeamPlayer {
	static SessionFactory factory = new Configuration().configure().buildSessionFactory();
	static Session session = factory.openSession();
	public static void Insert1()
	{
		
	Team te = new Team();
	te.setTeId(101);
	te.setTeName("INDIA");
	
	Player pl1 = new Player();
	pl1.setPlNo(501);
	pl1.setPlName("sachin");
	pl1.setfId(te);
	
	Player pl2 = new Player();
	pl2.setPlNo(502);
	pl2.setPlName("dhoni");
	pl2.setfId(te);
	
	Player pl3 = new Player();
	pl3.setPlNo(503);
	pl3.setPlName("virat");
	pl3.setfId(te);
	
	Transaction tx = session.beginTransaction();
	session.save(pl1);
	session.save(pl2);
	session.save(pl3);
	
	tx.commit();
	session.close();
	System.out.println("Many to One is done...");
	}

	public static void updateRecords()
	{
		Transaction tx = session.beginTransaction();
		Team te = (Team)session.get(Team.class, 101);
				te.setTeName("AUS");
				session.update(te);
				tx.commit();
				session.close();
	}

}

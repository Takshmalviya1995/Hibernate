package UpdateDetails;



import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import BugTracker.Admin;
import BugTracker.Bug;
import BugTracker.MileStone;
import BugTracker.ProjectDemo;
import BugTracker.Status;
import BugTracker.Users;
import antlr.debug.TraceAdapter;

public class Update_Status {
static  AnnotationConfiguration cfg=new AnnotationConfiguration().configure();
    

    static SessionFactory factory = cfg.buildSessionFactory();
    static Session session = factory.openSession();

    public static void update_BugStatus(int statusId)
    {
    	
    	
    	Status status = (Status)session.get(Status.class, statusId);
    	status.setStatustext("open");
    	Transaction tx = session.beginTransaction();
    	session.save(status);
    	tx.commit(); 
    	session.close();
    }
    
    public static void update_Bug()
    {
    	Bug bug = (Bug)session.get(Bug.class, 502);
    	bug.setBugTitle("");
    	Transaction tx = session.beginTransaction();
    	session.save(bug);
    	tx.commit(); 
    	session.close();
    }
    public static void update_Milestone()
    {
    	MileStone milestone = (MileStone)session.get(MileStone.class, 401);
    	milestone.setMilestoneName(" ");
    	
    	milestone.setFlag("");
    	Transaction tx = session.beginTransaction();
    	session.save(milestone);
    	tx.commit(); 
    	session.close();
    }
    public static void update_Users()
    {
    	Users users = (Users)session.get(Users.class, 301);
    	users.setUsersName(" ");
    	users.setUsersRole(" ");
    	Transaction tx = session.beginTransaction();
    	session.save(users);
    	tx.commit(); 
    	session.close();
    }
    
    public static void update_Project()
    {
    	ProjectDemo project = (ProjectDemo)session.get(ProjectDemo.class, 201);
    	project.setProjectName(" ");
    	Transaction tx = session.beginTransaction();
    	session.save(project);
    	
    	tx.commit(); 
    	session.close();
    }
    public static void update_Admin()
    {
    	Admin admin = (Admin)session.get(Admin.class, 101);
    	admin.setAdminName(" ");
    	Transaction tx = session.beginTransaction();
    	session.save(admin);
    	tx.commit(); 
    	session.close();
    }
}

package insertDetails;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import BugTracker.Admin;
import BugTracker.Bug;
import BugTracker.BugAssign;
import BugTracker.Event;
import BugTracker.MileStone;
import BugTracker.ProjectDemo;
import BugTracker.Status;
import BugTracker.Users;


public class Insert {
	
static  AnnotationConfiguration cfg=new AnnotationConfiguration().configure();
    

    static SessionFactory factory = cfg.buildSessionFactory();
    static Session session = factory.openSession();
    
    public static void adminInsert()
    {
    	
//..............................................................ADMIN..................................................    	
    	
    	Admin ad = new Admin();
    	ad.setAdminId(101);
    	ad.setAdminName("Devendra");
  
 //...........................................................PROJECTDEMO.................................................   	
    	
    	ProjectDemo project1 = new ProjectDemo();
    	project1.setProjectId(201);
    	project1.setProjectName("School Management");
    	project1.setStartDate(new Date());
    	project1.setEndDate("28/6/1995");
    	project1.setOverview("This project is use to manage whole school works");
    	

    	ProjectDemo project2 = new ProjectDemo();
    	project2.setProjectId(202);
    	project2.setProjectName("Hospital Management");
    	project2.setStartDate(new Date());
    	project2.setEndDate("18/8/1995");
    	project2.setOverview("This project is use to manage whole hospital works");
    	
  
    	Set setproject1 = new HashSet();
    	setproject1.add(project1);
    	setproject1.add(project2);
    	
    	ad.setClientchild(setproject1);
   //...........................................................USERS................................ 	
    	Users user1 = new Users();
    	user1.setUsersId(301);
    	user1.setUsersRole("manager");
    	user1.setUsersName("ramesh");
    	
    	Users user2 = new Users();
    	user2.setUsersId(302);
    	user2.setUsersRole("Employee");
    	user2.setUsersName("Dev");
    	
    	Users user3 = new Users();
    	user3.setUsersId(303);
    	user3.setUsersRole("manager");
    	user3.setUsersName("ram");
    	
    	Users user4 = new Users();
    	user4.setUsersId(304);
    	user4.setUsersRole("contractor");
    	user4.setUsersName("tom");
    	
    	Set setuser1 = new HashSet();
    	setuser1.add(user1);
    	setuser1.add(user2);
    	
    	project1.setUserschild(setuser1);
    	//project1.setUserschild(setuser1);
    	
    	Set setuser2 = new HashSet();
    	setuser2.add(user3);
    	setuser2.add(user4);
    	
    	project2.setUserschild(setuser2);
    	//project2.setUserschild(setuser2);
    	
//..............................................................MILESTONE........................................................    	
    	
    	MileStone milestone1 = new MileStone();
    	milestone1.setMilestoneId(401);
    	milestone1.setMilestoneName("Collection");
    	milestone1.setStartDate(new Date());
    	milestone1.setEndDate("10/06/2018");
    	milestone1.setFlag("Internal");
    	
    	milestone1.setUsermilestone(user1);
    	
    	MileStone milestone2 = new MileStone();
    	milestone2.setMilestoneId(402);
    	milestone2.setMilestoneName("Array");
    	milestone2.setStartDate(new Date());
    	milestone2.setEndDate("12/06/2018");
    	milestone2.setFlag("Internal");
    	
    	milestone2.setUsermilestone(user3);
    	
    	Set setmilestone1 = new HashSet();
    	setmilestone1.add(milestone1);
    	project1.setMilestoneproject(setmilestone1);
    	
    	
    	Set setmilestone2 = new HashSet();
    	setmilestone2.add(milestone2);
    	project2.setMilestoneproject(setmilestone2);
    	
    	
//...............................................................BUG................................................

		Bug bug1 = new Bug();
		bug1.setBugId(501);
		bug1.setBugTitle("Arrylist");
		bug1.setDescription("it is not add any objects");
		bug1.setLastDate("30/5/2018");
		bug1.setServerity("minor");
		bug1.setModule("hospital management");
		bug1.setReproducable("sometimes");
		bug1.setFlag("internal");
		
		bug1.setBugUser(user1);
		
		
		Bug bug2 = new Bug();
		bug2.setBugId(502);
		bug2.setBugTitle("two dimensional");
		bug2.setDescription("error on matrix");
		bug2.setLastDate("29/5/2018");
		bug2.setServerity("minor");
		bug2.setModule("hospital management");
		bug2.setReproducable("sometimes");
		bug2.setFlag("internal");
		
		bug2.setBugUser(user2);
		
		Bug bug3 = new Bug();
		bug3.setBugId(503);
		bug3.setBugTitle("two dimensional");
		bug3.setDescription("error on matrix");
		bug3.setLastDate("29/5/2018");
		bug3.setServerity("minor");
		bug3.setModule("hospital management");
		bug3.setReproducable("sometimes");
		bug3.setFlag("internal");
		
		bug3.setBugUser(user3);
		
		Set setbug1 = new HashSet();
		setbug1.add(bug1);
	
		
		milestone1.setBugmilestone(setbug1);
		project2.setBugproject(setbug1);
		
		Set setbug2 = new HashSet();
		setbug2.add(bug2);
		setbug2.add(bug3);
		
		milestone2.setBugmilestone(setbug2);
		project1.setBugproject(setbug2);
		
		
		
//............................................................Status................................................
		
		Status status1 = new Status();
		status1.setStatusId(601);
		status1.setStatustext("its on working");
		status1.setStatusbug(bug1);
		status1.setStatususers(user1);
		
		
		Status status2 = new Status();
		status2.setStatusId(602);
		status2.setStatustext("open");
		status2.setStatusbug(bug2);
		status2.setStatususers(user2);
		
		
//...........................................................Event..................................................
		
		Event event1 = new Event();
		event1.setEventId(701);
		event1.setEventTitle("birthday party");
		event1.setDate("26/5/2018");
		event1.setTime("10:30");
		event1.setDuration("2 hours");
		event1.setLocation("radison");
		
		Set setevent1 = new HashSet();
		setevent1.add(event1);
		
		user3.setEventuser(setevent1);
		project1.setEventproject(setevent1);
		
		Event event2 = new Event();
		event2.setEventId(702);
		event2.setEventTitle("conference");
		event2.setDate("29/5/2018");
		event2.setTime("10:30");
		event2.setDuration("2 hours");
		event2.setLocation("raja-ram");
		
		Set setevent2 = new HashSet();
		setevent2.add(event2);
		
		ad.setAdminevent(setevent2);
		project2.setEventproject(setevent2);
//................................................................BUG ASSIGN ...................................		
    /*	BugAssign bugassign1 = new BugAssign();
    	bugassign1.setAssignid(801);
    	
    	Set setbugassign1 = new HashSet();
    	setbugassign1.add(bugassign1);
    	
    	user1.setUsersbugassign(setbugassign1);
    	bug2.setBugassign(setbugassign1);*/
		
		Transaction tx = session.beginTransaction();
		session.save(ad);
		session.save(status1);
		session.save(status2);
		//session.save(bugassign1);
		tx.commit();
		session.close();   	
    }
}
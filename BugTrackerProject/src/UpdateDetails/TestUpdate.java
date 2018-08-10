package UpdateDetails;

public class TestUpdate {

	 public static void main(String[] args) {
			Update_Status us = new Update_Status();
	    	us.update_BugStatus(601);
	    	us.update_Bug();
	    	us.update_Milestone();
			us.update_Users();
			us.update_Project();
			us.update_Admin();
		}

}

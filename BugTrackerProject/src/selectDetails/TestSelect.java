package selectDetails;

public class TestSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Selectquery sq = new Selectquery();
		//sq.selectAdminWithProject();
		//sq.selectAdminWithEvents();
		//sq.selectProjectWithUsers();     //project == user,milestone,bug ..
		//sq.selectProject();               //arranged 
		//sq.selectMileStoneWithUser();       //milestone == user,bug
		sq.selectMileStone();             //arranged
		//sq.bugWithStatus();              //bug == status,user
		//sq.userwithevent();


	}

}

package BugTracker;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="milestone")
@Data
public class MileStone {
	
	@Id
	@Column(name="milestoneid")
	private int milestoneId;
	
	@Column(name="milestonename")
	private String milestoneName;
	
	@Column(name="startdate")
	private Date startDate;
	
	@Column(name="enddate")
	private String endDate;
	
	@Column(name="Flag")
	private String flag;
	
	@OneToMany(fetch=FetchType.LAZY,targetEntity=Bug.class,cascade=CascadeType.ALL)
	@JoinColumn(name="milestoneid",referencedColumnName="milestoneid")
	private Set bugmilestone;
	
	@ManyToOne(fetch=FetchType.LAZY,targetEntity=Users.class,cascade=CascadeType.ALL)
	@JoinColumns({
		@JoinColumn(name="responsible",referencedColumnName="usersid"),
		@JoinColumn(name="responsiblename",referencedColumnName="users_name")
		})
	private Users usermilestone; 

}

package BugTracker;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="project")
@Getter
@Setter
public class ProjectDemo {
	
	@Id
	@Column(name="projectid")
	private int projectId;
	
	@Column(name="projectname")
	private String projectName;
	
	@Column(name="startdate")
	private Date startDate;
	
	@Column(name="endDate")
	private String endDate;
	
	@Column(name="Overview")
	private String overview;
	
	@OneToMany(fetch=FetchType.LAZY,targetEntity=Users.class,cascade=CascadeType.ALL)
	@JoinColumn(name="projectid",referencedColumnName="projectid")
	private Set userschild;
	
	@OneToMany(fetch=FetchType.LAZY,targetEntity=MileStone.class,cascade=CascadeType.ALL)
	@JoinColumn(name="projectid",referencedColumnName="projectid")
	private Set milestoneproject;
	
	@OneToMany(fetch=FetchType.LAZY,targetEntity=Bug.class,cascade=CascadeType.ALL)
	@JoinColumn(name="projectid",referencedColumnName="projectid")
	private Set bugproject;
	
	@OneToMany(fetch=FetchType.LAZY,targetEntity=Event.class,cascade=CascadeType.ALL)
	@JoinColumn(name="projectid",referencedColumnName="projectid")
	private Set eventproject;
	
	
	
	
	
	
	
	

}

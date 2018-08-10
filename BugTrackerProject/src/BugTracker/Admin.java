package BugTracker;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Admin")
@Data
public class Admin {

	@Id
	@Column(name="adminid")
	private int adminId;
	@Column(name="adminname")
	private String adminName;
	
	@OneToMany(fetch=FetchType.LAZY,targetEntity=ProjectDemo.class,cascade=CascadeType.ALL)
	@JoinColumn(name="adminfor",referencedColumnName="adminid")
	private Set clientchild;
	
	@OneToMany(fetch=FetchType.LAZY,targetEntity=Event.class,cascade=CascadeType.ALL)
	@JoinColumn(name="adminid",referencedColumnName="adminid")
	private Set adminevent;
	
	
}
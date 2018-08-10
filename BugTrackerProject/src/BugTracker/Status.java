package BugTracker;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="status")
@Data
public class Status {

	@Id
	@Column(name="statusid")
	private int statusId;
	
	@Column(name="statustext")
	private String statustext;
	
	@OneToOne(fetch=FetchType.LAZY,targetEntity=Bug.class,cascade=CascadeType.ALL)
	@JoinColumn(name="bugID",referencedColumnName="bugid")
	private Bug statusbug;
	
	@OneToOne(fetch=FetchType.LAZY,targetEntity=Users.class,cascade=CascadeType.ALL)
	@JoinColumn(name="userId",referencedColumnName="usersid")
	private Users statususers;
	
}

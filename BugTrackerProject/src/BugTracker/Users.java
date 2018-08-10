package BugTracker;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Users")
@Getter
@Setter
public class Users implements Serializable {

	@Id
	@Column(name="usersid")
	private int usersId;
	
	@Column(name="users_role")
	private String usersRole;
	
	@Column(name="users_name")
	private String usersName;
	
	

	@OneToMany(fetch=FetchType.LAZY,targetEntity=BugAssign.class,cascade=CascadeType.ALL)
	@JoinColumn(name="userid",referencedColumnName="usersid")
	private Set usersbugassign;
	

	@OneToMany(fetch=FetchType.LAZY,targetEntity=Event.class,cascade=CascadeType.ALL)
	@JoinColumn(name="UserID",referencedColumnName="usersid")
	private Set eventuser;
	
	
}

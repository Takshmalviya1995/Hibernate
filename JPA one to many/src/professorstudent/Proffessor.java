package professorstudent;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="proffessor")
public class Proffessor {

	@Id
	@Column(name="id")
	private int proffid;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(fetch=FetchType.LAZY, targetEntity=Student.class,cascade=CascadeType.ALL)
	@JoinColumn(name="proffid", referencedColumnName="id")

	private Set children;

	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}

	public int getProffid() {
		return proffid;
	}

	public void setProffid(int proffid) {
		this.proffid = proffid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

package stateCountry;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="state")
public class State {

	@Id
	@Column(name="id")
	private int stateid;
	
	@Column(name="name")
	private String stateName;
	
	@ManyToOne(fetch=FetchType.LAZY,targetEntity=Country.class,cascade=CascadeType.ALL)
	@JoinColumn(name="eveId",referencedColumnName="id")

	private Country parent;

	public int getStateid() {
		return stateid;
	}

	public void setStateid(int stateid) {
		this.stateid = stateid;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public Country getParent() {
		return parent;
	}

	public void setParent(Country parent) {
		this.parent = parent;
	}
}

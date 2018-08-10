package Select;

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
private int stateId;

@Column(name="name")
private String stateName;

@ManyToOne(fetch=FetchType.LAZY,targetEntity=Country.class,cascade=CascadeType.ALL)
@JoinColumn(name="eveId",referencedColumnName="id")

private Country parent;

public int getStateId() {
	return stateId;
}

public void setStateId(int stateId) {
	this.stateId = stateId;
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

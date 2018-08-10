package Select;

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
@Table(name="speaker")
public class Speaker {
@Id
@Column(name="id")
private int speakerid;

@Column(name="name")
private String speakerName;

@OneToMany(fetch=FetchType.LAZY,targetEntity=Listner.class,cascade=CascadeType.ALL)
@JoinColumn(name="eveId", referencedColumnName="id")

private Set children;

public int getSpeakerid() {
	return speakerid;
}

public void setSpeakerid(int speakerid) {
	this.speakerid = speakerid;
}

public String getSpeakerName() {
	return speakerName;
}

public void setSpeakerName(String speakerName) {
	this.speakerName = speakerName;
}

public Set getChildren() {
	return children;
}

public void setChildren(Set children) {
	this.children = children;
}
}

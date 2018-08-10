package Delete;

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
@Table(name="owner")
public class Owner {
private static final String CascadeTpye = null;

@Id
@Column(name="ownerid")
private int ownerId;

@Column(name="ownername")
private String ownerName;

@OneToMany(fetch=FetchType.LAZY, targetEntity=Car.class,cascade=CascadeType.ALL)
@JoinColumn(name="owid",referencedColumnName="ownerid")

private Set children;

public int getOwnerId() {
	return ownerId;
}

public void setOwnerId(int ownerId) {
	this.ownerId = ownerId;
}

public String getOwnerName() {
	return ownerName;
}

public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}

public Set getChildren() {
	return children;
}

public void setChildren(Set children) {
	this.children = children;
}

public static String getCascadetpye() {
	return CascadeTpye;
}
}

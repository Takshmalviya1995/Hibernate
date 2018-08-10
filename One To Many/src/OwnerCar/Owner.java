package OwnerCar;

import java.util.Set;

public class Owner {
private Integer ownerId;
private String ownerName;
private Set children;
public Integer getOwnerId() {
	return ownerId;
}
public void setOwnerId(Integer ownerId) {
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

}

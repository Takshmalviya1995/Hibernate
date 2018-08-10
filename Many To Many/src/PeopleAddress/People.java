package PeopleAddress;

import java.util.Set;

public class People {
private Integer peopleId;
private String peopleName;
private Set address;
public Integer getPeopleId() {
	return peopleId;
}
public void setPeopleId(Integer peopleId) {
	this.peopleId = peopleId;
}
public String getPeopleName() {
	return peopleName;
}
public void setPeopleName(String peopleName) {
	this.peopleName = peopleName;
}
public Set getAddress() {
	return address;
}
public void setAddress(Set address) {
	this.address = address;
}
}

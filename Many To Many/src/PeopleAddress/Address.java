package PeopleAddress;

import java.util.Set;

public class Address {
private Integer addressId;
private String addressName;
private Set people;
public Integer getAddressId() {
	return addressId;
}
public void setAddressId(Integer addressId) {
	this.addressId = addressId;
}
public String getAddressName() {
	return addressName;
}
public void setAddressName(String addressName) {
	this.addressName = addressName;
}
public Set getPeople() {
	return people;
}
public void setPeople(Set people) {
	this.people = people;
}
}

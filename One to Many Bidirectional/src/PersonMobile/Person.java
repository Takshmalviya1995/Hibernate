package PersonMobile;

import java.util.Set;

public class Person {
private Integer personId;
private String personName;
private Set children;
public Integer getPersonId() {
	return personId;
}
public void setPersonId(Integer personId) {
	this.personId = personId;
}
public String getPersonName() {
	return personName;
}
public void setPersonName(String personName) {
	this.personName = personName;
}
public Set getChildren() {
	return children;
}
public void setChildren(Set children) {
	this.children = children;
}


}

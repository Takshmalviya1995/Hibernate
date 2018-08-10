package BusPassenger;

import java.util.Set;

public class Bus {
private Integer busId;
private String busName;
private Set children;
public Integer getBusId() {
	return busId;
}
public void setBusId(Integer busId) {
	this.busId = busId;
}
public String getBusName() {
	return busName;
}
public void setBusName(String busName) {
	this.busName = busName;
}
public Set getChildren() {
	return children;
}
public void setChildren(Set children) {
	this.children = children;
}

}

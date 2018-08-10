package StateDistrict;

import java.util.Set;

public class State {
private Integer stateId;
private String stateName;
private Set child;
public Integer getStateId() {
	return stateId;
}
public void setStateId(Integer stateId) {
	this.stateId = stateId;
}
public String getStateName() {
	return stateName;
}
public void setStateName(String stateName) {
	this.stateName = stateName;
}
public Set getChild() {
	return child;
}
public void setChild(Set child) {
	this.child = child;
}
}

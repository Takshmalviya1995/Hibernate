package UniversityCollege;

import java.util.Set;

public class University {
private Integer univerId;
private String univerName;
private Set Children;
public Integer getUniverId() {
	return univerId;
}
public void setUniverId(Integer univerId) {
	this.univerId = univerId;
}
public String getUniverName() {
	return univerName;
}
public void setUniverName(String univerName) {
	this.univerName = univerName;
}
public Set getChildren() {
	return Children;
}
public void setChildren(Set children) {
	Children = children;
}

}

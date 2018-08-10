package SpeakerListner;

import java.util.Set;

public class Speaker {
private Integer SpId;
private String Spname;
private Set children;
public Integer getSpId() {
	return SpId;
}
public void setSpId(Integer spId) {
	SpId = spId;
}
public String getSpname() {
	return Spname;
}
public void setSpname(String spname) {
	Spname = spname;
}
public Set getChildren() {
	return children;
}
public void setChildren(Set children) {
	this.children = children;
}

}

package DoctorPatient;

import java.util.Set;

public class Doctor {
private Integer doctId;
private String doctName;
private Set children;
public Integer getDoctId() {
	return doctId;
}
public void setDoctId(Integer doctId) {
	this.doctId = doctId;
}
public String getDoctName() {
	return doctName;
}
public void setDoctName(String doctName) {
	this.doctName = doctName;
}
public Set getChildren() {
	return children;
}
public void setChildren(Set children) {
	this.children = children;
}

}

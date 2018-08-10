package DoctorPatient;

public class Patient {
private Integer patId;
private String patName;
private String patDieases;
private Doctor fid;
public Integer getPatId() {
	return patId;
}
public void setPatId(Integer patId) {
	this.patId = patId;
}
public String getPatName() {
	return patName;
}
public void setPatName(String patName) {
	this.patName = patName;
}
public String getPatDieases() {
	return patDieases;
}
public void setPatDieases(String patDieases) {
	this.patDieases = patDieases;
}
public Doctor getFid() {
	return fid;
}
public void setFid(Doctor fid) {
	this.fid = fid;
}

}

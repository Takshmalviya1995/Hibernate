package FarmerCow;

import java.util.Set;

public class Cow {
private Integer cowId;
private String cowName;
private Set farmer;
public Integer getCowId() {
	return cowId;
}
public void setCowId(Integer cowId) {
	this.cowId = cowId;
}
public String getCowName() {
	return cowName;
}
public void setCowName(String cowName) {
	this.cowName = cowName;
}
public Set getFarmer() {
	return farmer;
}
public void setFarmer(Set farmer) {
	this.farmer = farmer;
}

}

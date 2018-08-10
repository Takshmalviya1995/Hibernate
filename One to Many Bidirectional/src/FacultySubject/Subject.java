package FacultySubject;

import VendorCustomer.Vendor;

public class Subject {
	private Integer subId;
	private String subName;
	private Integer forevenId;
	private Faculty parentObjects;
	public Integer getSubId() {
		return subId;
	}
	public void setSubId(Integer subId) {
		this.subId = subId;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public Integer getForevenId() {
		return forevenId;
	}
	public void setForevenId(Integer forevenId) {
		this.forevenId = forevenId;
	}
	public Faculty getParentObjects() {
		return parentObjects;
	}
	public void setParentObjects(Faculty parentObjects) {
		this.parentObjects = parentObjects;
	}
	
}

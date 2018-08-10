package UniversityCollege;

import ProductSuplier.Product;

public class College {
	private Integer collegeId;
	private String collegeName;
	private Integer forevenId;
	private University parentObjects;
	public Integer getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Integer getForevenId() {
		return forevenId;
	}
	public void setForevenId(Integer forevenId) {
		this.forevenId = forevenId;
	}
	public University getParentObjects() {
		return parentObjects;
	}
	public void setParentObjects(University parentObjects) {
		this.parentObjects = parentObjects;
	}
	
	
}

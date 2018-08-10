package PersonMobile;

import VendorCustomer.Vendor;

public class Mobile {
	private Integer mobileId;
	private String mobileName;
	private Integer forevenId;
	private Person parentObjects;
	
	public Integer getMobileId() {
		return mobileId;
	}
	public void setMobileId(Integer mobileId) {
		this.mobileId = mobileId;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public Integer getForevenId() {
		return forevenId;
	}
	public void setForevenId(Integer forevenId) {
		this.forevenId = forevenId;
	}
	public Person getParentObjects() {
		return parentObjects;
	}
	public void setParentObjects(Person parentObjects) {
		this.parentObjects = parentObjects;
	}
	
}

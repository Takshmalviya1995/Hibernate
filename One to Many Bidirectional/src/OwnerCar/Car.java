package OwnerCar;

import VendorCustomer.Vendor;

public class Car {
	private Integer carNo;
	private String carName;
	private Integer forevenId;
	private Owner parentObjects;
	public Integer getCarNo() {
		return carNo;
	}
	public void setCarNo(Integer carNo) {
		this.carNo = carNo;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public Integer getForevenId() {
		return forevenId;
	}
	public void setForevenId(Integer forevenId) {
		this.forevenId = forevenId;
	}
	public Owner getParentObjects() {
		return parentObjects;
	}
	public void setParentObjects(Owner parentObjects) {
		this.parentObjects = parentObjects;
	}

}

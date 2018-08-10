package com.onetomanyvendor;

import java.util.Set;

public class Vendor {
	
	private int vendorId;
	private String vendorName;
	private Set children;
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendoreName) {
		this.vendorName = vendoreName;
	}
	public Set getChildren() {
		return children;
	}
	public void setChildren(Set children) {
		this.children = children;
	}
	
}

package ProductSuplier;

import VendorCustomer.Vendor;

public class Suplier {
	private Integer suplierId;
	private String suplierName;
	private String supplierAdd;
	private Integer forevenId;
	private Product parentObjects;
	public Integer getSuplierId() {
		return suplierId;
	}
	public void setSuplierId(Integer suplierId) {
		this.suplierId = suplierId;
	}
	public String getSuplierName() {
		return suplierName;
	}
	public void setSuplierName(String suplierName) {
		this.suplierName = suplierName;
	}
	public String getSupplierAdd() {
		return supplierAdd;
	}
	public void setSupplierAdd(String supplierAdd) {
		this.supplierAdd = supplierAdd;
	}
	public Integer getForevenId() {
		return forevenId;
	}
	public void setForevenId(Integer forevenId) {
		this.forevenId = forevenId;
	}
	public Product getParentObjects() {
		return parentObjects;
	}
	public void setParentObjects(Product parentObjects) {
		this.parentObjects = parentObjects;
	}
	

}

package VendorCustomer;

public class Customer {
	
	private Integer customerId;
	private String customerName;
	private Vendor parentObjects;
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Vendor getParentObjects() {
		return parentObjects;
	}
	public void setParentObjects(Vendor parentObjects) {
		this.parentObjects = parentObjects;
	}
	
	

}
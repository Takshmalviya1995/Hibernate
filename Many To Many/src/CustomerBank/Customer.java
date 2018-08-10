package CustomerBank;

import java.util.Set;

public class Customer {
private Integer customerId;
private String customerName;
private Set bank;
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
public Set getBank() {
	return bank;
}
public void setBank(Set bank) {
	this.bank = bank;
}

}

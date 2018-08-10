package CustomerBank;

import java.util.Set;

public class Bank {
private Integer bankId;
private String bankName;
private Set customer;
public Integer getBankId() {
	return bankId;
}
public void setBankId(Integer bankId) {
	this.bankId = bankId;
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
public Set getCustomer() {
	return customer;
}
public void setCustomer(Set customer) {
	this.customer = customer;
}

}

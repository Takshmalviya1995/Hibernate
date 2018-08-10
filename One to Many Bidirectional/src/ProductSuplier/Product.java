package ProductSuplier;

import java.util.Set;

public class Product {
	private Integer productId;
private String productDesc;
private double productPrice;
private Set children;
public Integer getProductId() {
	return productId;
}
public void setProductId(Integer productId) {
	this.productId = productId;
}
public String getProductDesc() {
	return productDesc;
}
public void setProductDesc(String productDesc) {
	this.productDesc = productDesc;
}
public double getProductPrice() {
	return productPrice;
}
public void setProductPrice(double productPrice) {
	this.productPrice = productPrice;
}
public Set getChildren() {
	return children;
}
public void setChildren(Set children) {
	this.children = children;
}


}

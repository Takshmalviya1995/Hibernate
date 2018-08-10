package OrderItem;

import java.util.Set;

public class Orders {
private Integer orderId;
private Integer orderCount;
private Integer orderName;
private Set item;
public Integer getOrderId() {
	return orderId;
}
public void setOrderId(Integer orderId) {
	this.orderId = orderId;
}
public Integer getOrderCount() {
	return orderCount;
}
public void setOrderCount(Integer orderCount) {
	this.orderCount = orderCount;
}
public Integer getOrderName() {
	return orderName;
}
public void setOrderName(Integer orderName) {
	this.orderName = orderName;
}
public Set getItem() {
	return item;
}
public void setItem(Set item) {
	this.item = item;
}




}

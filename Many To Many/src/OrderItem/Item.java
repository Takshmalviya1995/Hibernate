package OrderItem;

import java.util.Set;

public class Item {
private Integer itemId;
private String itemName;
private Set orders;
public Integer getItemId() {
	return itemId;
}
public void setItemId(Integer itemId) {
	this.itemId = itemId;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public Set getOrders() {
	return orders;
}
public void setOrders(Set orders) {
	this.orders = orders;
}

}

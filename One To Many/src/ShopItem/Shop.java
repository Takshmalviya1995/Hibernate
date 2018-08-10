package ShopItem;

import java.util.Set;

public class Shop {
private Integer shopId;
private String shopName;
private Set children;
public Integer getShopId() {
	return shopId;
}
public void setShopId(Integer shopId) {
	this.shopId = shopId;
}
public String getShopName() {
	return shopName;
}
public void setShopName(String shopName) {
	this.shopName = shopName;
}
public Set getChildren() {
	return children;
}
public void setChildren(Set children) {
	this.children = children;
}

}

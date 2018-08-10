package CategoryItem;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name="items")
public class Item {

	@Id
	@Column(name="itemid")
	private int itemid;
	
	@Column(name="itemname")
	 private String itemName;
	
	 @ManyToMany(targetEntity=Category.class,mappedBy="item")
	
	 private Set categories;

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Set getCategories() {
		return categories;
	}

	public void setCategories(Set categories) {
		this.categories = categories;
	}
}
package CategoryItem;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name="category")
public class Category {
	
	
@Id
@Column(name="catid")
private int categoryId;
@Column(name="catname")
private String categoryName;

@ManyToMany(fetch=FetchType.LAZY,targetEntity=Item.class,cascade=CascadeType.ALL)
@JoinTable(name="Category_Items",joinColumns=@JoinColumn(name="cat_id_fk",referencedColumnName="catid"),
inverseJoinColumns=@JoinColumn(name="item_id_fk",referencedColumnName="itemid"))

private Set item;

public int getCategoryId() {
	return categoryId;
}

public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
}

public String getCategoryName() {
	return categoryName;
}

public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}

public Set getItem() {
	return item;
}

public void setItem(Set item) {
	this.item = item;
}
}
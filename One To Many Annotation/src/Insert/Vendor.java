package Insert;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Vendor")
public class Vendor {
	
	
@Id
@Column(name="vendorid")
private int vendorId;

@Column(name="vendorname")
private String vendorName;

@OneToMany(fetch=FetchType.LAZY, targetEntity=Customer.class,cascade=CascadeType.ALL)
@JoinColumn(name="venid", referencedColumnName="vendorid")

private Set children;

public Set getChildren() {
	return children;
}

public void setChildren(Set children) {
	this.children = children;
}

public int getVendorId() {
	return vendorId;
}

public void setVendorId(int vendorId) {
	this.vendorId = vendorId;
}

public String getVendorName() {
	return vendorName;
}

public void setVendorName(String vendorName) {
	this.vendorName = vendorName;
}
}

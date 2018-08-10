package Update;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="mobile")
public class Mobile {
	@Id
	@Column(name="id")
	private int mobileId;
	
	@Column(name="name")
	private String mobileName;
	
	@ManyToOne(fetch=FetchType.LAZY,targetEntity=Person.class,cascade=CascadeType.ALL)
	@JoinColumn(name="eveId", referencedColumnName="id")
	private Person parent;

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public Person getParent() {
		return parent;
	}

	public void setParent(Person parent) {
		this.parent = parent;
	}
	

}

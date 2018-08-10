import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;



@Entity
@Table(name="student")
@FilterDef(name="statusFilter",parameters= @ParamDef(name="id",type="int"))
@Filter(name="statusFilter",condition="id > :id")
public class Student {
	
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "Name")
	private String name;
	@Column(name = "degree")
	private String degree;
	@Column(name = "Mobile")
	private String mobile;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Column(name = "status")
	private String status;
}

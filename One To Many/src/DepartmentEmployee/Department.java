package DepartmentEmployee;

import java.util.Set;

public class Department {
private Integer deptid;
private String deptname;
private Set children;
public Integer getDeptid() {
	return deptid;
}
public void setDeptid(Integer deptid) {
	this.deptid = deptid;
}
public String getDeptname() {
	return deptname;
}
public void setDeptname(String deptname) {
	this.deptname = deptname;
}
public Set getChildren() {
	return children;
}
public void setChildren(Set children) {
	this.children = children;
}

}

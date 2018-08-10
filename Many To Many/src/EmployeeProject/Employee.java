package EmployeeProject;

import java.util.Set;

public class Employee {
private Integer employeeId;
private String employeeName;
private Set project;
public Integer getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(Integer employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public Set getProject() {
	return project;
}
public void setProject(Set project) {
	this.project = project;
}

}

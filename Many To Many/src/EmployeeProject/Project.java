package EmployeeProject;

import java.util.Set;

public class Project {
	private Integer projectId;
	private String projectName;
	private Set employee;
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Set getEmployee() {
		return employee;
	}
	public void setEmployee(Set employee) {
		this.employee = employee;
	}
	

}

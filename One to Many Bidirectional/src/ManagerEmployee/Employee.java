package ManagerEmployee;

public class Employee {
	private Integer employeeId;
	private String employeeName;
	private Integer forevenId;
	private Manager parentObjects;
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
	public Integer getForevenId() {
		return forevenId;
	}
	public void setForevenId(Integer forevenId) {
		this.forevenId = forevenId;
	}
	public Manager getParentObjects() {
		return parentObjects;
	}
	public void setParentObjects(Manager parentObjects) {
		this.parentObjects = parentObjects;
	}
}

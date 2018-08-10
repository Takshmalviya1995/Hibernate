package DepartmentEmployee;

public class Employee {
	private Integer EmpId;
	private String Name;
	private Department parentObjects;
	public Integer getEmpId() {
		return EmpId;
	}
	public void setEmpId(Integer empId) {
		EmpId = empId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Department getParentObjects() {
		return parentObjects;
	}
	public void setParentObjects(Department parentObjects) {
		this.parentObjects = parentObjects;
	}
	
	
}

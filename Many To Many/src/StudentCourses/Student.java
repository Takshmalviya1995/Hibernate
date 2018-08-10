package StudentCourses;

import java.util.Set;

public class Student {
	private Integer studentId;
	private String studentName;
	private Integer marks;
	
	private Set Courses ;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public Set getCourses() {
		return Courses;
	}

	public void setCourses(Set courses) {
		Courses = courses;
	}
	
}

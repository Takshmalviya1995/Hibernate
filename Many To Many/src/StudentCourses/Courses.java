package StudentCourses;

import java.util.Set;

public class Courses {

	private Integer courseId;
	private String courseName;
	private Integer duration;
	
	private Set student;

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Set getStudent() {
		return student;
	}

	public void setStudent(Set student) {
		this.student = student;
	}
	
}

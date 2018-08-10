package LibraryBook;

import java.util.Set;

public class Library {
private Integer libraryId;
private String libraryName;
private Set children;

public Integer getLibraryId() {
	return libraryId;
}
public void setLibraryId(Integer libraryId) {
	this.libraryId = libraryId;
}
public String getLibraryName() {
	return libraryName;
}
public void setLibraryName(String libraryName) {
	this.libraryName = libraryName;
}
public Set getChildren() {
	return children;
}
public void setChildren(Set children) {
	this.children = children;
}
}

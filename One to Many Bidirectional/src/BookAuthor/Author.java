package BookAuthor;

import java.util.Set;

import ProductSuplier.Product;

public class Author {
private Integer authorId;
private String authorName;
private Set children;
public Integer getAuthorId() {
	return authorId;
}
public void setAuthorId(Integer authorId) {
	this.authorId = authorId;
}
public String getAuthorName() {
	return authorName;
}
public void setAuthorName(String authorName) {
	this.authorName = authorName;
}
public Set getChildren() {
	return children;
}
public void setChildren(Set children) {
	this.children = children;
}
}

package BookAuthor;

import java.util.Set;

import VendorCustomer.Vendor;

public class Book {
	private Integer bookId;
	private String bookTitle;
	private Integer bookPrice;
	private Integer forevenId;
	private Author parentObjects;
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public Integer getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Integer bookPrice) {
		this.bookPrice = bookPrice;
	}
	public Integer getForevenId() {
		return forevenId;
	}
	public void setForevenId(Integer forevenId) {
		this.forevenId = forevenId;
	}
	public Author getParentObjects() {
		return parentObjects;
	}
	public void setParentObjects(Author parentObjects) {
		this.parentObjects = parentObjects;
	}
	
	

}

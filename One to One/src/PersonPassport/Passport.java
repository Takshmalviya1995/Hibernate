package PersonPassport;

import java.util.Date;

public class Passport {
private Integer passNo;
private Date issueDate;
private String expDate;
private Person s;
public Integer getPassNo() {
	return passNo;
}
public void setPassNo(Integer passNo) {
	this.passNo = passNo;
}
public Date getIssueDate() {
	return issueDate;
}
public void setIssueDate(Date issueDate) {
	this.issueDate = issueDate;
}
public String getExpDate() {
	return expDate;
}
public void setExpDate(String expDate) {
	this.expDate = expDate;
}
public Person getS() {
	return s;
}
public void setS(Person s) {
	this.s = s;
}

}

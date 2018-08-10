package Select;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="listner")
public class Listner {
@Id
@Column(name="id")
private int listnerId;

@Column(name="name")
private String listnerName;

public int getListnerId() {
	return listnerId;
}

public void setListnerId(int listnerId) {
	this.listnerId = listnerId;
}

public String getListnerName() {
	return listnerName;
}

public void setListnerName(String listnerName) {
	this.listnerName = listnerName;
}

}

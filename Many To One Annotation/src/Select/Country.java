package Select;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="country")
public class Country {
@Id
@Column(name="id")
private int countryId;

@Column(name="name")
private String countryName;

public int getCountryId() {
	return countryId;
}

public void setCountryId(int countryId) {
	this.countryId = countryId;
}

public String getCountryName() {
	return countryName;
}

public void setCountryName(String countryName) {
	this.countryName = countryName;
}

}

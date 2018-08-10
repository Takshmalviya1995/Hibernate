package CountryLanguage;

import java.util.Set;

public class Country {
private Integer countryId;
private String countryName;
private Set language;
public Integer getCountryId() {
	return countryId;
}
public void setCountryId(Integer countryId) {
	this.countryId = countryId;
}
public String getCountryName() {
	return countryName;
}
public void setCountryName(String countryName) {
	this.countryName = countryName;
}
public Set getLanguage() {
	return language;
}
public void setLanguage(Set language) {
	this.language = language;
}

}

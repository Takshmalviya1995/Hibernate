package CountryLanguage;

import java.util.Set;

public class Language {
	private Integer languageId;
	private String languageName;
	private Set country;
	public Integer getLanguageId() {
		return languageId;
	}
	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}
	public String getLanguageName() {
		return languageName;
	}
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
	public Set getCountry() {
		return country;
	}
	public void setCountry(Set country) {
		this.country = country;
	}
	

}

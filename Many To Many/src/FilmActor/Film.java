package FilmActor;

import java.util.Set;

public class Film {
private Integer filmId;
private String filmName;
private Set actor;
public Integer getFilmId() {
	return filmId;
}
public void setFilmId(Integer filmId) {
	this.filmId = filmId;
}
public String getFilmName() {
	return filmName;
}
public void setFilmName(String filmName) {
	this.filmName = filmName;
}
public Set getActor() {
	return actor;
}
public void setActor(Set actor) {
	this.actor = actor;
}

}

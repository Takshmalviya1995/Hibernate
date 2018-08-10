package FilmActor;

import java.util.Set;

public class Actor {
private Integer actorId;
private String actorName;
private Set film;
public Integer getActorId() {
	return actorId;
}
public void setActorId(Integer actorId) {
	this.actorId = actorId;
}
public String getActorName() {
	return actorName;
}
public void setActorName(String actorName) {
	this.actorName = actorName;
}
public Set getFilm() {
	return film;
}
public void setFilm(Set film) {
	this.film = film;
}

}

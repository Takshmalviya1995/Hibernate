package ArtistSong;

import java.util.Set;

public class Artist {
private Integer artistId;
private String artistName;
private Set song;
public Integer getArtistId() {
	return artistId;
}
public void setArtistId(Integer artistId) {
	this.artistId = artistId;
}
public String getArtistName() {
	return artistName;
}
public void setArtistName(String artistName) {
	this.artistName = artistName;
}
public Set getSong() {
	return song;
}
public void setSong(Set song) {
	this.song = song;
}

}

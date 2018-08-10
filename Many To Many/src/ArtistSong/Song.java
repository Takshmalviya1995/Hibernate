package ArtistSong;

import java.util.Set;

public class Song {
private Integer songId;
private String songName;
private Set artist;
public Integer getSongId() {
	return songId;
}
public void setSongId(Integer songId) {
	this.songId = songId;
}
public String getSongName() {
	return songName;
}
public void setSongName(String songName) {
	this.songName = songName;
}
public Set getArtist() {
	return artist;
}
public void setArtist(Set artist) {
	this.artist = artist;
}

}

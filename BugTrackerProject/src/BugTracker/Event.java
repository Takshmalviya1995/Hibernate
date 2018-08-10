package BugTracker;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="event")
@Getter
@Setter
public class Event {

	@Id
	@Column(name="eventid")
	private int eventId;
	
	@Column(name="eventtitle")
	private String eventTitle;
	
	@Column(name="date")
	private String date;
	
	@Column(name="time")
	private String time;
	
	@Column(name="duration")
	private String duration;
	
	@Column(name="location")
	private String location;
		
}

package update;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="passenger")
public class Passenger {

	@Id
	@Column(name="passengerid")
	private int passengerId;
	
	@Column(name="passengername")
	private String passengerName;
	
	@ManyToMany(targetEntity=Bus.class,mappedBy="passenger")
	
	private Set bus;

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public Set getBus() {
		return bus;
	}

	public void setBus(Set bus) {
		this.bus = bus;
	}
}

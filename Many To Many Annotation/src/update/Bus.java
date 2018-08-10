package update;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="bus")
public class Bus {

	@Id
	@Column(name="busid")
	private int busId;
	
	@Column(name="busname")
	private String busName;
	
	@ManyToMany(fetch=FetchType.LAZY,targetEntity=Passenger.class,cascade=CascadeType.ALL)
	@JoinTable(name="Bus_PAssenger",joinColumns=@JoinColumn(name="bus_id_fk",referencedColumnName="busid"),
	inverseJoinColumns=@JoinColumn(name="passenger_id_fk",referencedColumnName="passengerid"))
	
	private Set passenger;

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public Set getPassenger() {
		return passenger;
	}

	public void setPassenger(Set passenger) {
		this.passenger = passenger;
	}
}

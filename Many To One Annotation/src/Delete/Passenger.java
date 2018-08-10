package Delete;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="passenger")
public class Passenger {
	@Id
	@Column(name="id")
	private int passengerId;
	
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

	public Bus getParent() {
		return parent;
	}

	public void setParent(Bus parent) {
		this.parent = parent;
	}

	@Column(name="name")
	private String passengerName;
	
	@ManyToOne(fetch=FetchType.LAZY,targetEntity=Bus.class,cascade=CascadeType.ALL)
	@JoinColumn(name="eveid", referencedColumnName="id")
	
	private Bus parent;

}

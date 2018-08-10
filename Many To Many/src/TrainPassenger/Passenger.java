package TrainPassenger;

import java.util.Set;

public class Passenger {
private Integer passengerId;
private String passengerName;
private Set train;
public Integer getPassengerId() {
	return passengerId;
}
public void setPassengerId(Integer passengerId) {
	this.passengerId = passengerId;
}
public String getPassengerName() {
	return passengerName;
}
public void setPassengerName(String passengerName) {
	this.passengerName = passengerName;
}
public Set getTrain() {
	return train;
}
public void setTrain(Set train) {
	this.train = train;
} 
}

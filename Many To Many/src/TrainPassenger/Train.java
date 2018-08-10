package TrainPassenger;

import java.util.Set;

public class Train {
private Integer trainId;
private String trainName;
private Set passenger;
public Integer getTrainId() {
	return trainId;
}
public void setTrainId(Integer trainId) {
	this.trainId = trainId;
}
public String getTrainName() {
	return trainName;
}
public void setTrainName(String trainName) {
	this.trainName = trainName;
}
public Set getPassenger() {
	return passenger;
}
public void setPassenger(Set passenger) {
	this.passenger = passenger;
}

}

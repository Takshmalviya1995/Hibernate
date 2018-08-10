package TablePerSubClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="payment1")
@Inheritance(strategy=InheritanceType.JOINED)
public class Payment1 {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="paymentid")
private int paymentId;

@Column(name="amount")
private int amount;

public int getPaymentId() {
	return paymentId;
}

public void setPaymentId(int paymentId) {
	this.paymentId = paymentId;
}

public int getAmount() {
	return amount;
}

public void setAmount(int amount) {
	this.amount = amount;
}
}

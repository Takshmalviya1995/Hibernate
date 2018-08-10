package TablePerConcrete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="payment2")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Payment2 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="paymentId")
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

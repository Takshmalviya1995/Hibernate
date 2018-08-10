package TablePerConcrete;

import javax.persistence.AssociationOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="creditcard2")
@AttributeOverrides({
	@AttributeOverride(name="paymentId", column=@Column(name="paymentId")),
	@AttributeOverride(name="amount", column=@Column(name="amount"))
})
public class CreditCard2 extends Payment2{

	 @Column(name="ccnumber")
	    private int cardNumer;
	    
	 @Column(name="cctype")
	    private String cardType;

	public int getCardNumer() {
		return cardNumer;
	}

	public void setCardNumer(int cardNumer) {
		this.cardNumer = cardNumer;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
}

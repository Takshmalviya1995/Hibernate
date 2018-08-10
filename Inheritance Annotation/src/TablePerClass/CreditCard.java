package TablePerClass;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="CCARD")
public class CreditCard extends Payment {
	 @Column(name="ccnumber")
	    private int cardNumer;
	    
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

		@Column(name="cctype")
	    private String cardType;
}

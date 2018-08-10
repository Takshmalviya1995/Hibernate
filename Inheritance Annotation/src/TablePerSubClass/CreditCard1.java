package TablePerSubClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="creditcard1")
@PrimaryKeyJoinColumn(name="ID")
public class CreditCard1 extends Payment1{

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

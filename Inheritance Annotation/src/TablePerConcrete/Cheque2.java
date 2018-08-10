package TablePerConcrete;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cheque2")
@AttributeOverrides({
	@AttributeOverride(name="paymentId", column=@Column(name="paymentId")),
	@AttributeOverride(name="amount", column=@Column(name="amount"))
})
public class Cheque2 extends Payment2 {
	@Column(name="chqnumber")
    private int chequeNumber;
    
    @Column(name="chtype")
    private String chequeType;

	public int getChequeNumber() {
		return chequeNumber;
	}

	public void setChequeNumber(int chequeNumber) {
		this.chequeNumber = chequeNumber;
	}

	public String getChequeType() {
		return chequeType;
	}

	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}

}

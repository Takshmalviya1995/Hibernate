package TablePerSubClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="cheque1")
@PrimaryKeyJoinColumn(name="ID")
public class Cheque1 extends Payment1 {
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

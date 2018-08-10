package BugTracker;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="assign")
@Data
public class BugAssign {

	@Id
	@Column(name="assign_id")
	private int assignid;
}
